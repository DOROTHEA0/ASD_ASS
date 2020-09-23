/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd.model.dao;

import asd.model.entity.User;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author komei
 */
public class UserDao {
    
    public static void addUser(User user){
        String ciphertext = null;
        try {
            StrEncrypt encry = new StrEncrypt();
            ciphertext = encry.encrypt(user.getPassword());
        } catch (Exception ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Document doc = new Document("FirstName", user.getFirstName())
                .append("LastName", user.getLastName())
                .append("DOB", user.getDOB())
                .append("Email", user.getEmail())
                .append("PhoneNumber", user.getPhoneNumber())
                .append("Password", ciphertext)
                .append("IsAdmin", user.getIsAdmin())
                .append("IsActive", user);
        
        MongoDatabase db = BaseDAO.getConn();
        MongoCollection userColl = db.getCollection("User");
        userColl.insertOne(doc);
    }
    /*
    @param: user id or email
    */
    public static void delUser(String keyWord){
        MongoDatabase db = BaseDAO.getConn();
        MongoCollection<Document> userCollection = db.getCollection("User");
        
        Bson filter = Filters.eq("Email", keyWord);
        userCollection.deleteOne(filter);
        filter = Filters.eq("_id", new ObjectId(keyWord));
        userCollection.deleteOne(filter);
    }
    
    public static ArrayList<User> findAllUsers(){
        ArrayList<User> users = new ArrayList<User>();
        Document userDocument;
        User user;
        StrEncrypt decry;
        String plaintext = null;
        
        MongoDatabase db = BaseDAO.getConn();
        MongoCollection<Document> userCollection = db.getCollection("User");
        FindIterable<Document> findIterable = userCollection.find();
	MongoCursor<Document> mongoCursor = findIterable.iterator();
        
        while (mongoCursor.hasNext()) {            
            userDocument = mongoCursor.next();
            try {
                decry = new StrEncrypt();
                plaintext = decry.decrypt(userDocument.getString("Password"));
            } catch (Exception e) {
            }
            user = new User(userDocument.get("_id").toString()
                    ,userDocument.getString("FirstName")
                    ,userDocument.getString("LastName")
                    ,userDocument.getString("DOB")
                    ,userDocument.getString("Email")
                    ,userDocument.getString("PhoneNumber")
                    ,plaintext
                    ,userDocument.getBoolean("IsAdmin")
                    ,userDocument.getBoolean("IsActive"));
            users.add(user);
        }
        return users;
    }
    
    public static User findUserbyId(String id){
        User resultUser = null;
        StrEncrypt decry;
        String plaintext = null;
        
        MongoDatabase db = BaseDAO.getConn();
        MongoCollection<Document> userCollection = db.getCollection("User");
        Bson filter = Filters.eq("_id", new ObjectId(id));
        FindIterable<Document> findIterable = userCollection.find(filter);
        Document userDocument = findIterable.first();
        if(userDocument != null){
            try {
                decry = new StrEncrypt();
                plaintext = decry.decrypt(userDocument.getString("Password"));
            } catch (Exception e) {
            }
            resultUser = new User(userDocument.get("_id").toString()
                        ,userDocument.getString("FirstName")
                        ,userDocument.getString("LastName")
                        ,userDocument.getString("DOB")
                        ,userDocument.getString("Email")
                        ,userDocument.getString("PhoneNumber")
                        ,plaintext
                        ,userDocument.getBoolean("IsAdmin")
                        ,userDocument.getBoolean("IsActive"));
        }
        return resultUser;
    }
    
    public static User findUserbyEmail(String email){
        User resultUser = null;
        StrEncrypt decry;
        String plaintext = null;
        
        MongoDatabase db = BaseDAO.getConn();
        MongoCollection<Document> userCollection = db.getCollection("User");
        Bson filter = Filters.eq("Email", email);
        FindIterable<Document> findIterable = userCollection.find(filter);
        Document userDocument = findIterable.first();
        
        if(userDocument != null){
            try {
                decry = new StrEncrypt();
                plaintext = decry.decrypt(userDocument.getString("Password"));
            } catch (Exception e) {
            }
            resultUser = new User(userDocument.get("_id").toString()
                        ,userDocument.getString("FirstName")
                        ,userDocument.getString("LastName")
                        ,userDocument.getString("DOB")
                        ,userDocument.getString("Email")
                        ,userDocument.getString("PhoneNumber")
                        ,plaintext
                        ,userDocument.getBoolean("IsAdmin")
                        ,userDocument.getBoolean("IsActive"));
        }
        return resultUser;
    }
    
    public static void updateUser(User user){
        String ciphertext = null;
        try {
            StrEncrypt encry = new StrEncrypt();
            ciphertext = encry.encrypt(user.getPassword());
        } catch (Exception ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Bson filter = Filters.eq("Email", user.getEmail());
        Document doc = new Document("$set", new Document("FirstName", user.getFirstName())
                .append("LastName", user.getLastName())
                .append("DOB", user.getDOB())
                .append("Email", user.getEmail())
                .append("PhoneNumber", user.getPhoneNumber())
                .append("Password", ciphertext)
                .append("IsAdmin", user.getIsAdmin()));
        
        MongoDatabase db = BaseDAO.getConn();
        MongoCollection userColl = db.getCollection("User");
        userColl.updateOne(filter, doc);
    }
}

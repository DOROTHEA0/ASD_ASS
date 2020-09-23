/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd.model.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author komei
 */
public class BaseDAO {
    
    private static MongoClient mongoClient;
    
    public static MongoDatabase getConn(){
        mongoClient = new MongoClient("localhost", 27017);
        return mongoClient.getDatabase("axxxxb");
    }
}

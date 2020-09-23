package asd.model.entity;

import asd.model.dao.StrEncrypt;
import asd.model.dao.UserDao;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            User u = new User(null, "admin fname", "admin lname", "2020-01-01", "admin@email", "1000000000", "admin", true);
            UserDao.updateUser(u);
            
            
            
	}

}

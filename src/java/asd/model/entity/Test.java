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
            User u = new User(null, "Huan", "Guo", "1919-01-01", "Guohuan@email", "13803455682", "chesternb", true);
            UserDao.addUser(u);
            
            
            
	}

}

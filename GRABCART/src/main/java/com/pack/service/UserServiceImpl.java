package com.pack.service;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.bean.Pet;
import com.pack.bean.User;
import com.pack.bean.logIn;
import com.pack.dao.UserDao;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
public void saveUser(User user){
	System.out.println("Inside saveEmp service");
	userDao.saveUser(user);
}

	@Override
	public boolean fetchUser(logIn l) {
		boolean b=userDao.fetchUser(l);
		return b;	
	}

	@Override
	public void savePet(Pet pd) {
		System.out.println("inside save pet service impl");
		userDao.savePet(pd);
		
	}

	@Override
	public List<Pet> viewPet() {
		List<Pet> l=userDao.viewPet();
		return l;
	}


}

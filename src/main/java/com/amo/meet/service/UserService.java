package com.amo.meet.service;

import com.amo.meet.enums.Check;
import com.amo.meet.enums.Gender;
import com.amo.meet.enums.MBTI;
import com.amo.meet.enums.Marry;
import com.amo.meet.model.User;
import com.amo.meet.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;
    
    public boolean addUser(String userId, String password) {
    	
    	if((userId == null) || (password == null)) {
    		return false;
    	}
    	
    	User user = new User();
    	user.setUserId(userId);
    	user.setPassword(password);
    	user.setAlchol(Check.NO);
    	user.setBirth("19990101");
    	user.setEducation("카이스트");
    	user.setGender(Gender.NONE);
    	user.setHeight(169);
    	user.setImages("no images");
    	user.setIntro("HELLO WOLRD");
    	user.setJob("학생");
    	user.setMail("user@mail.com");
    	user.setMarriage(Marry.RE_SINGLE);
    	user.setMbti(MBTI.ENTJ);
    	user.setName("아모르");
    	user.setNickname("아모");
    	user.setPhone("01012341234");
    	user.setReligion("무교");
    	user.setSalary(0);
    	user.setSmoke(Check.YES);
    	
    	userRepository.save(user);
    	
    	return true;
    }
    
    public boolean updateUser(String userId, String password, String newPass) {
    	
    	if((userId == null) || (password == null) || (newPass == null)) {
    		return false;
    	}
    	
    	User user = userRepository.findByUserIdAndPassword(userId, password);
    	
    	if(user != null) {
    		user.setPassword(newPass);
    	}
    	
    	userRepository.save(user);
    	return true;
    }
    
    public boolean deleteUser(String userId, String password) {
    	if((userId == null) || (password == null)) {
    		return false;
    	}
    	
    	User user = userRepository.findByUserIdAndPassword(userId, password);
    	
    	if(user != null) {
    		return userRepository.deleteByUserId(userId) > 0;
    	} else {
    		return false;
    	}
    }
    
    public boolean login(String userId, String password) {
    	if((userId == null) || (password == null)) {
    		return false;
    	}
    	
    	User user = userRepository.findByUserIdAndPassword(userId, password);
    	
    	if(user != null) {
    		return true;
    	} else {
    		return false;
    	}
    }







}

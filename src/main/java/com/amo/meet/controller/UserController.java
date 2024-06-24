package com.amo.meet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amo.meet.service.UserService;

@RestController
@RequestMapping("/api/v1/member")
public class UserController {
	

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value="/addUser", method= {RequestMethod.POST})
    public void addUser(String userId, String password) {
    	boolean result = userService.addUser(userId, password);
    	if(result) {
    		logger.info("addUser ok");
    	} else {
    		logger.info("addUser fail");
    	}
    }
    
    @ResponseBody
    @RequestMapping(value="/updateUser", method=RequestMethod.POST)
    public void updateUser(String userId, String password, String newPass) {
    	boolean result = userService.updateUser(userId, password, newPass);
    	
    	if(result) {
        	logger.info("updateUser ok");
    	} else {
    		logger.info("updateUser fail");
    	}
    }
    
    @ResponseBody
    @RequestMapping(value="/deleteUser", method=RequestMethod.POST)
    public void deleteUser(String userId, String password) {
    	boolean result = userService.deleteUser(userId, password);
    	
    	if(result) {
    		logger.info("delete ok");
    	} else {
    		logger.info("delete fail");
    	}
    }
    
    @ResponseBody
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public void login(String userId, String password) {
    	boolean result = userService.login(userId, password);
    	
    	if(result) {
    		logger.info("login ok");
    	} else {
    		logger.info("login fail");
    	}
    }
    
    
    // 로그 아웃은 클라이언트에서 처리 가능할듯 
//    @RequestMapping(value="/logout", method=RequestMethod.POST)
//    public boolean logout(String userId, String password) {
//    	return userService.deleteUser(userId, password);
//    }

    
}
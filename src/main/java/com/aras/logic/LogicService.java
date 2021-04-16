package com.aras.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aras.controller.UserController;

@Service
public class LogicService {
	@Autowired 
	private UserController userController;
	
	private Game game = new Game(userController);
}

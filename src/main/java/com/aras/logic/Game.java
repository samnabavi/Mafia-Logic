package com.aras.logic;

import java.util.List;

import org.springframework.stereotype.Component;

import com.aras.controller.UserController;
import com.aras.dao.UserRepository;
import com.aras.model.User;

@Component
public class Game {
	
	private UserController userController;
	
	private List<User> usersList;
	private List<User> citizenList;
	private List<User> mafiaList;
	private int numOfCitizens = 0;
	private int numOfMafias = 0;
	private boolean endOfTheGame;
	
	public Game(UserController userController) {
		this.userController = userController;
		usersList = userController.getAllUsers();
		endOfTheGame = false;
		for(User user:usersList) {
			user.setAlive(true);
			user.setAudio(true);
			user.setVideo(true);
			if(user.getTeam().equals("citizen")) {
				citizenList.add(user);
				numOfCitizens += 1;
			} else {
				mafiaList.add(user);
				numOfMafias += 1;
			}
		}
		runTheGame();
	}
	
	public void runTheGame() {
		
		while(!endOfTheGame) {
			if( numOfCitizens < numOfMafias) {
				endOfTheGame = true;
			}
			return; 
		}
		
	}

}

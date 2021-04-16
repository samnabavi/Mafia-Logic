package com.aras.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users-table")
public class User {
	private long id;
	private String username;
	private String team;
	private String role;
	private boolean audio;
	private boolean video;
	private boolean alive;
	private boolean myTurn;
}

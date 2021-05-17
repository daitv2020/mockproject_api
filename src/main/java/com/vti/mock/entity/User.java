package com.vti.mock.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * mapping class voi table trong database
 */
@Entity
@Table(name = "User")
//@Table(name = "User", catalog = "heroku_a10f190c7669d65")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * mapping column
	 */
	@Column(name = "UserID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FacebookID", length = 256, nullable = false, unique = true)
	private String facebookId;

	@Column(name = "Name", length = 256, nullable = false)
	private String name;

	@Column(name = "Email", length = 50, nullable = false, unique = true)
	private String email;

	/**
	 * join with city table -> Favourite city
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinTable(name = "FavoriteCity", joinColumns = @JoinColumn(name = "UserID"), inverseJoinColumns = @JoinColumn(name = "CityID"))
	List<City> favoriteCities;

	/**
	 * Constructor for class Admin
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * getter va setter
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFacebookId() {
		return facebookId;
	}
	
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<City> getFavoriteCities() {
		return favoriteCities;
	}
}

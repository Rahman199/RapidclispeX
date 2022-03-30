
package com.develogment.sod.domain;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.develogment.sod.dal.LogDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Log
 */
@DAO(LogDAO.class)
@Caption("{%username}")
@Entity
@Cacheable(true)
@Table(name = "log", catalog = "develogment")
public class Log implements java.io.Serializable
{
	
	private int    id;
	private String username;
	private String email;
	private String password;
	
	public Log()
	{
	}
	
	@Caption("Id")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "id", unique = true, nullable = false, columnDefinition = "INT")
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Caption("Username")
	@Column(name = "username", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	@Caption("Email")
	@Column(name = "email", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	@Caption("Password")
	@Column(name = "password", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}

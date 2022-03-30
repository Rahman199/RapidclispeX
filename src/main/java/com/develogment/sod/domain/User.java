
package com.develogment.sod.domain;

import com.develogment.sod.dal.UserDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


/**
 * User
 */
@DAO(UserDAO.class)
@Caption("{%username}")
@Entity
@Cacheable(true)
@Table(name = "user", catalog = "employees", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class User implements java.io.Serializable
{
	
	private int    iduser;
	private String username;
	private String password;
	private Date   createdAt;
	
	public User()
	{
	}
	
	@Caption("Iduser")
	@Id
	
	@Column(name = "iduser", unique = true, nullable = false, columnDefinition = "INT")
	public int getIduser()
	{
		return this.iduser;
	}
	
	public void setIduser(int iduser)
	{
		this.iduser = iduser;
	}
	
	@Caption("Username")
	@Column(name = "username", unique = true, nullable = false, columnDefinition = "VARCHAR", length = 45)
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	@Caption("Password")
	@Column(name = "password", nullable = false, columnDefinition = "VARCHAR", length = 45)
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	@Caption("CreatedAt")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", columnDefinition = "DATETIME", length = 19)
	public Date getCreatedAt()
	{
		return this.createdAt;
	}
	
	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}
	
}

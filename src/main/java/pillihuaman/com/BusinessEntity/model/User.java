package pillihuaman.com.BusinessEntity.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pillihuaman.com.Help.Constants;

import java.sql.Timestamp;
import java.time.Instant;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Getter
@Setter
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")

public class User extends AuditEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_user")
	private BigInteger idUser;
	@Column(name="alias")
	private String alias;
	
	@Column(name="api_Password")
	private String apiPassword;

	@Column(name="id_system")
	private BigInteger idSystem;

	@Column(name="mail")
	private String mail;
	
	@Column(name="mobil_Phone")
	private String mobilPhone;

	@Column(name="password")
	private String password;

	@Column(name="sal_Password")
	private String salPassword;
	

	
	@Column(name="username")
	private String username;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Role role;

	@Column(nullable = false, name = "enabled")
	protected String enabled;
	
	public BigInteger getIdUser() {
		return idUser;
	}

	public void setIdUser(BigInteger idUser) {
		this.idUser = idUser;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getApiPassword() {
		return apiPassword;
	}

	public void setApiPassword(String apiPassword) {
		this.apiPassword = apiPassword;
	}

	public BigInteger getIdSystem() {
		return idSystem;
	}

	public void setIdSystem(BigInteger idSystem) {
		this.idSystem = idSystem;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobilPhone() {
		return mobilPhone;
	}

	public void setMobilPhone(String mobilPhone) {
		this.mobilPhone = mobilPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalPassword() {
		return salPassword;
	}

	public void setSalPassword(String salPassword) {
		this.salPassword = salPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public User() {super(); 
	}

}
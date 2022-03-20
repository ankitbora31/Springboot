package com.rest.springrest.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="ngo")
public class NGO{


	public NGO() {};
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ngoId;
	
	@NotNull
	@Size(max=100)
	@Column(unique=true)
	@Email
    private String email;
	
	@NotNull
	@Column(unique=true)
    private long phoneReg;
    
    @NotNull
    @Size(min=8,message="password should have at least 8 characters")
    private String password;
    
    
    @Column(name="verification_code",length=64,nullable=false)
    private String verificationCode;
    
    @Column(nullable=false)
    private boolean enabled;
    
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="detailsId")
    private NGOdetails details;

    public long getNgoId() {
		return ngoId;
	}

	public void setNgoId(long ngoId) {
		this.ngoId = ngoId;
	}

	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public NGO(String email, long phoneReg,
			String password,
			String verificationCode, boolean enabled) {
		this.email = email;
		this.phoneReg = phoneReg;
		this.password = password;
		this.verificationCode = verificationCode;
		this.enabled = enabled;
	}

    
    public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneReg() {
		return phoneReg;
	}

	public void setPhoneReg(long phoneReg) {
		this.phoneReg = phoneReg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public NGOdetails getDetails() {
		return details;
	}

	public void setDetails(NGOdetails details) {
		this.details = details;
	}

	
}

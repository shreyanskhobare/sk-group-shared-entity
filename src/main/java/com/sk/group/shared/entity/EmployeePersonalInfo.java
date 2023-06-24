/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author - Shreyans Khobare
*/
@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePersonalInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5616093575141359755L;

	@Id
	@Column(name="EMPLOYEE_ID")
	private long employeeId;
	
	@Column(name="MOBILE_NUMBER", nullable=false, unique = true)
	private String mobileNumber;
	
	@Column(name="PERSONAL_EMAIL", nullable=false, unique = true)
	private String personalEmail;
	
	@Column(name="ADDRESS", nullable=false)
	private String address;
	
	@Column(name="JOINING_DATE", nullable=false)
	private Date joiningDate;
	
	@Column(name="LEAVING_DATE", nullable=true)
	private Date leavingDate;
	

}

/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePersonalInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5616093575141359755L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID", nullable = false)
	private Employee employeeId;

}

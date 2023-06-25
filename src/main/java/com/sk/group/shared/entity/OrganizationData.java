/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.entity;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author - Shreyans Khobare
*/
@Entity
@Table(name = "ORGANIZATION_DATA")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5856591716224313985L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORGANIZATION_ID")
	private long organizationId;

	@Column(name = "ORGANIZATION_NAME", unique = true, nullable = true)
	private String organizationName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "organizationId", fetch = FetchType.LAZY)
	private Set<Employee> employee;
}

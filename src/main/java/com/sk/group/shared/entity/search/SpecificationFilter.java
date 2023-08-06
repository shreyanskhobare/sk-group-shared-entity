/*
Copyright [2023] Shreyans Dilip Khobare
Proof of concept for Code Template
*/
package com.sk.group.shared.entity.search;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * @author - Shreyans Khobare
 */
@Data
@Builder
public class SpecificationFilter {

	  private String field;
	  private String operator;
	  private String value;
	  private List<String> stringValues;//Used in case of IN operator
	  private List<Long> numberValues;
	  private Date dateValue;

}

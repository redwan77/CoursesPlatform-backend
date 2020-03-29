package com.fs.tetouan.model;

import java.util.Date;

import javax.persistence.Id;

public class PlanElement {

	@Id
	private String name ;	
	private String duration ;
	private Date date ;
	private double price  ;
	  	
}

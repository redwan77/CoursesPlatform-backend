package com.fs.tetouan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="plan")
public class Plan {

	@Id
	private Long id  ;
	
}

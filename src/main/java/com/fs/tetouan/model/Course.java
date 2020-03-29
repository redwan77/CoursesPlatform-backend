package com.fs.tetouan.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 3, max = 50)
	private String name;

	@NotBlank
	@Size(min =10, max = 1000)
	private String Description  ;
	
	@NotBlank
	@Size(min = 10, max = 1000)
	private String Objectives;

	@NotBlank
	@Size(min = 3, max = 50)
	private String establishment;

	@NotBlank
	@Size(min = 3, max = 50)
	private String preRequests;

//	@NotBlank
//	@Size(min = 3, max = 100)
//	private String imagePath;
	
	@Column(name = "picByte", length = 1000)
	private byte[] picByte;
	
	@Column(name = "type")
	private String type;

	@NotBlank
	private int maxSubscribers;

	@Min(0)
	private int nbSubscibers;

	@NotNull
	@ManyToOne
	@JoinColumn
	private User insctructor;

	@Temporal(TemporalType.DATE)
	private Date startingDate;

	@Min(0)
	private int duration;

	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private Plan coursePlan;

	// constructors

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(@NotBlank @Size(min = 3, max = 50) String name,
			@NotBlank @Size(min = 10, max = 1000) String objectives,
			@NotBlank @Size(min = 3, max = 50) String establishment,
			@NotBlank @Size(min = 3, max = 50) String preRequests, @NotBlank @Size(min = 3, max = 100) String imagePath,
			@NotBlank int maxSubscribers, @Min(0) int nbSubscibers, User insctructor, Date startingDate,
			@Min(0) int duration, Plan coursePlan) {
		super();
		this.name = name;
		Objectives = objectives;
		this.establishment = establishment;
		this.preRequests = preRequests;
		//this.imagePath = imagePath;
		this.maxSubscribers = maxSubscribers;
		this.nbSubscibers = nbSubscibers;
		this.insctructor = insctructor;
		this.startingDate = startingDate;
		this.duration = duration;
		this.coursePlan = coursePlan;
	}

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectives() {
		return Objectives;
	}

	public void setObjectives(String objectives) {
		Objectives = objectives;
	}

	public String getEstablishment() {
		return establishment;
	}

	public void setEstablishment(String establishment) {
		this.establishment = establishment;
	}

	public String getPreRequests() {
		return preRequests;
	}

	public void setPreRequests(String preRequests) {
		this.preRequests = preRequests;
	}

//	public String getImagePath() {
//		return imagePath;
//	}
//
//	public void setImagePath(String imagePath) {
//		this.imagePath = imagePath;
//	}

	public int getMaxSubscribers() {
		return maxSubscribers;
	}

	public void setMaxSubscribers(int maxSubscribers) {
		this.maxSubscribers = maxSubscribers;
	}

	public int getNbSubscibers() {
		return nbSubscibers;
	}

	public void setNbSubscibers(int nbSubscibers) {
		this.nbSubscibers = nbSubscibers;
	}

	public User getInsctructor() {
		return insctructor;
	}

	public void setInsctructor(User insctructor) {
		this.insctructor = insctructor;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Plan getCoursePlan() {
		return coursePlan;
	}

	public void setCoursePlan(Plan coursePlan) {
		this.coursePlan = coursePlan;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}

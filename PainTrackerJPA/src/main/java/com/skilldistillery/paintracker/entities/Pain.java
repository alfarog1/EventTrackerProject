package com.skilldistillery.paintracker.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pain")
public class Pain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "pain_location")
	private String painLocation;
	
	private int intensity;
	@Column(name="pain_start_date")
//	@Temporal(TemporalType.DATE)
	private Date painStartDate;
	@Column(name="pain_end_date")
//	@Temporal(TemporalType.DATE)
	private Date painEndDate;
	
	private String trigger;
	@Column(name = "type_of_pain")
	private String typeOfPain;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPainLocation() {
		return painLocation;
	}
	public void setPainLocation(String painLocation) {
		this.painLocation = painLocation;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	public Date getPainStartDate() {
		return painStartDate;
	}
	public void setPainStartDate(Date painStartDate) {
		this.painStartDate = painStartDate;
	}
	public Date getPainEndDate() {
		return painEndDate;
	}
	public void setPainEndDate(Date painEndDate) {
		this.painEndDate = painEndDate;
	}
	public String getTrigger() {
		return trigger;
	}
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}
	public String getTypeOfPain() {
		return typeOfPain;
	}
	public void setTypeOfPain(String typeOfPain) {
		this.typeOfPain = typeOfPain;
	}
	@Override
	public String toString() {
		return "Pain [id=" + id + ", painLocation=" + painLocation + ", intensity=" + intensity + ", painStartDate="
				+ painStartDate + ", painEndDate=" + painEndDate + ", trigger=" + trigger + ", typeOfPain=" + typeOfPain
				+ "]";
	}
	public Pain(int id, String painLocation, int intensity, Date painStartDate, Date painEndDate, String trigger,
			String typeOfPain) {
		super();
		this.id = id;
		this.painLocation = painLocation;
		this.intensity = intensity;
		this.painStartDate = painStartDate;
		this.painEndDate = painEndDate;
		this.trigger = trigger;
		this.typeOfPain = typeOfPain;
	}
	public Pain() {
		super();
	}
	
	
	
	
	
}

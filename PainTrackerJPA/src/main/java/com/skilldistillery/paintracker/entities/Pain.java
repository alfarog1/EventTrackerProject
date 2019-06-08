package com.skilldistillery.paintracker.entities;



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
	private String painStartDate;
	@Column(name="pain_end_date")
//	@Temporal(TemporalType.DATE)
	private String painEndDate;
	@Column(name = "pain_trigger")
	private String painTrigger;
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
	public String getPainStartDate() {
		return painStartDate;
	}
	public void setPainStartDate(String painStartDate) {
		this.painStartDate = painStartDate;
	}
	public String getPainEndDate() {
		return painEndDate;
	}
	public void setPainEndDate(String painEndDate) {
		this.painEndDate = painEndDate;
	}

	public String getTypeOfPain() {
		return typeOfPain;
	}
	public void setTypeOfPain(String typeOfPain) {
		this.typeOfPain = typeOfPain;
	}
	

	public Pain(int id, String painLocation, int intensity, String painStartDate, String painEndDate, String painTrigger,
			String typeOfPain) {
		super();
		this.id = id;
		this.painLocation = painLocation;
		this.intensity = intensity;
		this.painStartDate = painStartDate;
		this.painEndDate = painEndDate;
		this.painTrigger = painTrigger;
		this.typeOfPain = typeOfPain;
	}
	@Override
	public String toString() {
		return "Pain [id=" + id + ", painLocation=" + painLocation + ", intensity=" + intensity + ", painStartDate="
				+ painStartDate + ", painEndDate=" + painEndDate + ", painTrigger=" + painTrigger + ", typeOfPain="
				+ typeOfPain + "]";
	}
	public String getPainTrigger() {
		return painTrigger;
	}
	public void setPainTrigger(String painTrigger) {
		this.painTrigger = painTrigger;
	}
	public Pain() {
		super();
	}
	
	
	
	
	
}

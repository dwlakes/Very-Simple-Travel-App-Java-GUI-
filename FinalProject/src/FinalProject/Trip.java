package FinalProject;

public class Trip {
	String tripName;
	String continent;
	String country;
	String state;
	String city;
	String placeStayed;
	String peopleMet;
	String dateArrived;
	String dateLeft;
    String activities;
	
	public Trip(String tripName,
	String continent,
	String country,
	String state,
	String city,
	String placeStayed,
	String peopleMet,
	String dateArrived,
	String dateLeft,
	String activities) {
		
		this.tripName=tripName;
		this.continent=continent;
		this.country=country;
		this.state=state;
		this.city=city;
		this.placeStayed=placeStayed;
		this.peopleMet=peopleMet;
		this.dateArrived=dateArrived;
		this.dateLeft=dateLeft;
		this.activities=activities;
		
	}
	

	public Trip() {
		// TODO Auto-generated constructor stub
	}


	public String getTripName() {
		return tripName;
	}
	
	public void setTripName(String tripName) {
		this.tripName=tripName;
	}
	
	public String getContinent() {
		return continent;
	}
	
	public void setContinent(String continent) {
		this.continent=continent;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getPlaceStayed() {
		return placeStayed;
	}
	
	public void setPlaceStayed(String placeStayed) {
		this.placeStayed=placeStayed;
	}
	
	public String getPeopleMet() {
		return peopleMet;
	}
	
	public void setPeopleMet(String peopleMet) {
		this.peopleMet=peopleMet;
	}
	
	public String getDateArrived() {
		return dateArrived;
	}
	
	public void setDateArrived(String dateArrived) {
		this.dateArrived=dateArrived;
	}
	
	public String getDateLeft() {
		return dateLeft;
	}
	
	public void setDateLeft(String dateLeft) {
		this.dateLeft=dateLeft;
	}
	
	public String getActivities() {
		return activities;
	}
	
	public void setActivities(String activities) {
		this.activities=activities;
	}
	
	public String toString() {
		return ("On your trip "+"'" +this.getTripName() +"'"+"you went to "
				+ "\n" +this.getCity()+" in "+ this.getCountry()
				+"\n"+"where you did "+this.getActivities());
		
	}

}

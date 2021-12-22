package FinalProject;

public class People {
	String name;
	String nationality;
	String languages;
	String dateMet;
	
	
	public People(String name,
	String nationality,
	String languages,
	String dateMet) {
		this.name=name;
		this.nationality=nationality;
		this.languages=languages;
		this.dateMet=dateMet;
			
	}
	
	public String toString() {
		
		
		return ("You met"+ this.getName()+ " on "+ this.getDateMet() + "."
				+"\nThey are " + this.getNationality() +" and they speak " + this.getLanguages() );
		
	}

	private String getLanguages() {
		// TODO Auto-generated method stub
		return languages;
	}

	private String getNationality() {
		// TODO Auto-generated method stub
		return nationality;
	}

	private String getDateMet() {
		// TODO Auto-generated method stub
		return dateMet;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

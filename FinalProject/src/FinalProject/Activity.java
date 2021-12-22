package FinalProject;

public class Activity {
	String activity;
	String activityPlace;
	String withWho;
	String dateStarted;
	
	
	public Activity(String activity,
	String activityPlace,
	String withWho,
	String dateStarted) {
		this.activity=activity;
		this.activityPlace=activityPlace;
		this.withWho=withWho;
		this.dateStarted=dateStarted;	
		
	}
	
	public String toString() {
		
		
		return ("You did "+ this.getActivity()+ " at "+ this.getActivityPlace() + 
				"\n with " + this.getWithWho() +" on " + this.getDateStarted() );
		
	}

	public String getDateStarted() {
		// TODO Auto-generated method stub
		return dateStarted;
	}

	protected String getWithWho() {
		// TODO Auto-generated method stub
		return withWho;
	}

	protected String getActivity() {
		// TODO Auto-generated method stub
		return activity;
	}
	public String getActivityPlace() {
		return activityPlace;
		
	}
}
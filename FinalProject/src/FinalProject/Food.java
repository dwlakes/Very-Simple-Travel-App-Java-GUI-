package FinalProject;

public class Food extends Activity {
	
	String howSpicey;

	public Food(String activity, String activityPlace, String withWho, String dateStarted, String spicey) {
		super(activity, activityPlace, withWho, dateStarted);
		
		howSpicey=spicey;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		
		return ("You ate "+this.getActivity() + " at " + this.getActivityPlace()+ " with " +  this.getWithWho() + " on " +this.getDateStarted()
		+"\nIt was " + this.getHowSpicey() + " spicey");
	}
	
	public void setHowSpicey(String spicey) {
		howSpicey=spicey;
	}
	
	public String getHowSpicey() {
		return howSpicey;
	}
}

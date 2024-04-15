package java_assignment_3;
//5.Write a class Time with three data members to store hr, min and seconds.
//Create two constructors and apply checks to set valid time. (hr&lt;24, min&lt;60,
//sec&lt;60). Also create display function which displays all data members.

public class Time {
	private int hr,min,sec;
	
	public Time() {
		hr = 0;
		min = 0;
		sec = 0;
	}
	
	public Time(int hr, int min, int sec) {
		super();
		if(hr<=23 && min<=59 && sec<=59 ){
			
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		}
		
		else
		{
			System.out.println("Enter Valid time");
		}
		
	}
	
	public void display()
	{
		System.out.println("The time is : " + hr + " hr : "+min+" min : "+sec+" sec" );
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t1 = new Time(60, 20, 30);
		t1.display();
	}

}

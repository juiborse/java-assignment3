package java_assignment_3;

public class Triangle {
	private double s1,s2,s3,perimeter,area,s;
	
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Triangle(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.perimeter=s1+s2+s3;
	}

	public void calArea()
	{
		s=perimeter/2;
		area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		
	}
	
	public void show()
	{
		System.out.println("Sides of Triangle are :");
		System.out.println("Side 1 : "+s1);
		System.out.println("Side 2 : "+s2);
		System.out.println("Side 3 : "+s3);
		System.out.println("\nArea of Triangle : "+area);
		System.out.println("\nPerimeter of Triangle : "+perimeter); 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(3, 4, 5);
		t1.calArea();
		t1.show();
		

	}

}

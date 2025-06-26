package day25;

public class Student extends Thread {
	private PhilippineTour tour;
	private String name;
	private int signupCount=2;
	
	public Student(PhilippineTour tour, String name) {
		this.tour = tour;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(signupCount!=0) {
			boolean success=tour.signup(name);
			if(success) {
				signupCount--;
				continue;
				
			}else {
				break;
			}
		}
		
	}
	
}
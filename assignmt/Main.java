package assignmt;

import java.util.ArrayList;
;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Subject= new ArrayList<String>();
		Subject.add("one");
		Subject.add("Biology");
		Subject.add("English");
		
		
		
		Subject one = new Subject();
		one.setName("Mathematics");
		one.setCode("Maths");
		
		Subject two = new Subject();
		two.setName("English");
		two.setCode("Eng");
		
		Subject three = new Subject();
		three.setName("Biology");
		three.setCode("Bio");
		
		
		for (String x : Subject) 
			System.out.println(x);
		

	}

}

package LVS;

public class testclass {
	 public static void main( String args[] ){
		//System.out.println("Welcome to Jamrock");
		
		student Student;
		
		Student = new student();
		Student.setDag(5);
		Student.setJaar(2001);
		Student.setMaand(12);
		
		System.out.println( Student.getDag());
		System.out.println( Student.getJaar());
		System.out.println( Student.getMaand());
		System.out.println( "" + Student.getDag() + "  " + Student.getJaar() + " " + Student.getMaand());
	}
}

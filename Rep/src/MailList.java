import java.util.ArrayList;


public class MailList {
	private ArrayList<String> array;
	
	public MailList(){
		array = new ArrayList<String>();
	}
	public void voegtoe( String status){
		array.add(status);
	}
	public void show (){
		for (String status : array ){
			System.out.println(status);
		}
	}
}

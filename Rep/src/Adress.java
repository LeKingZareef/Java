
import java.util.*;
import javax.swing.JPanel;

public class Adress extends JPanel{
	MailList name = new MailList();
	MailList street = new MailList();
	MailList city = new MailList();
	MailList state = new MailList();
	MailList zip = new MailList();
	
	public Adress() {
		name.voegtoe("Natin");
//		name.voegtoe("Natin");
//		name.voegtoe("Natin");
		name.show();
		
		street.voegtoe("Leysweg" + "");
		street.show();

		city.voegtoe("Paramaribo");
		city.show();
	}
}
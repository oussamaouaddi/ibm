import metier.Metier;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		Metier met = (Metier) context.getBean("metier");
		
		Client c = new Client(14,"sama","kira","marocaine");
		
		met.addClient(c);
		
		System.out.println(met.getClientbyid(1).getLastName());
		
		
	}

}

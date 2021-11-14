package springbeanfactoryDemo;


	
	
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		
		
		Message collec1= (Message)con.getBean("collectiondemo");
		
		
		System.out.println(collec1.getAddressList());
		
		System.out.println(collec1.getAddressMap());
		
		//same for other colections
    //for your implementations

	}

}
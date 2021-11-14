package springbeanfactoryDemo;


	
	
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");

		Message mes = (Message) context.getBean("myappbean");

		mes.show();

	}

}





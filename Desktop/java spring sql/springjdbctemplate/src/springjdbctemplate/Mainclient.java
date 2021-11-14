package springjdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclient {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		
		StudentJDBCImpl studentJDBCImpl = (StudentJDBCImpl)context.getBean("studentdao");
		
		System.out.println("recored creation..");
		studentJDBCImpl.createStudent("ram1","25");
		studentJDBCImpl.createStudent("tom","26");
		
		System.out.println("done.......");

		

}
}
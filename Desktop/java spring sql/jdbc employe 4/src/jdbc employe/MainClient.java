package springjdbctrmplate;



	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainClient {
		
		public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
			
			EmployeJDBCImpl studentJDBCImpl = (EmployeJDBCImpl)context.getBean("studentdao");
			
			System.out.println("recored creation..");
			employeJDBCImpl.insertemploye(45,"sanjana",45);
			
			
			System.out.println("done.......");

			

	}
	}

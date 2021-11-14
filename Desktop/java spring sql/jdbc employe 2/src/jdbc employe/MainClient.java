package springjdbctrmplate;



	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainClient {
		
		public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
			
			EmployeJDBCImpl employeJDBCImpl = (EmployeJDBCImpl)context.getBean("employedao");
			
			System.out.println("recored creation..");
			
			employeJDBCImpl.updateemploye(67);
			
			
			System.out.println("done.......");

			

	}
	}

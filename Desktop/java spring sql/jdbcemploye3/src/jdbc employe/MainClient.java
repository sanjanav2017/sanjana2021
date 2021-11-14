package springjdbctrmplate;



	import java.util.List;

import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainClient {
		
		public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
			
			EmployeJDBCImpl studentJDBCImpl = (EmployeJDBCImpl)context.getBean("employedao");
			
			System.out.println("recored creation..");
			List<Employe> listofemployes = employeJDBCImpl.listAllEmployes();
			{

				for (Employe stud : listofstudents) {

					String employename = stud.getEmployeename();
				
				
					
					Integer employesalary = stud.getEmployeesalary();
					
					System.out.println(" employe  name " + employename + "employe salary " + employesalary);

				}

			
			
			
			
			System.out.println("done.......");
			

			

	}
		}
	}

package springbeanfactoryDemo;


	
	
	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	public class MainClient {

		public static void main(String[] args) {

			// Interface Resource
			Resource resource = new ClassPathResource("bean.xml");

			BeanFactory factory = new XmlBeanFactory(resource);

			Message message = (Message) factory.getBean("mybean");

			System.out.println(message.getMessage());

		}

	
		
	}





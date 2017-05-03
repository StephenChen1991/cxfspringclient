package live.chenchen.cxf.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client
{
	public static void main(String[] args)
	{
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		
		MyService myService = (MyService)factory.getBean("myServiceClient");
		
		System.out.println(myService.hello("ʥ˼԰"));
	}
}

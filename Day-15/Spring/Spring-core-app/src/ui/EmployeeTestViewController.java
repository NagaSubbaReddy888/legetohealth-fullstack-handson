package ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.EmployeeServiceImpl;

public class EmployeeTestViewController {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("empService"); 
			service.save(); 
			
			ClassPathXmlApplicationContext cpx = (ClassPathXmlApplicationContext)context;
			cpx.close();
		}

	}



package com.exapmle.beanLifeCycle.annotations;

import java.sql.SQLException;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		StudentDao dao = context.getBean("dao", StudentDao.class);
//		dao.selectAllRow();
//		((ClassPathXmlApplicationContext) context).close();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentDaoConfig.class);
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		dao.selectAllRow();
		context.close();
	}
}

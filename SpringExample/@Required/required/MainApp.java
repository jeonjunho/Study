package required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("requiredBeans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}
package com.ey.SpringMavenApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      //  Account a1=new Account();
      //  System.out.println(a1.name+"  "+a1.id);
        
        //IOC BeanFactory, brean creation,destruction,property, constructor, setter, scope (singleton/prototype)
        // life cycle method- init-method - destroy method 
       
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext context=new FileSystemXmlApplicationContext("d:\\beans.xml");
        //singleton
        Account a=(Account)context.getBean("a");  //Object -typecast
        System.out.println(a.hashCode());
        Account a1=(Account)context.getBean("a");
        System.out.println(a1.hashCode());
        Customer c1=(Customer)context.getBean("c");
        System.out.println(c1);
        System.out.println(c1.hashCode());
        Customer c2=(Customer)context.getBean("c");
        System.out.println(c2);
        System.out.println(c2.hashCode());
        
        Order o1=(Order)context.getBean("order");
      //  o1.setOrderId(203);
       // o1.setOrderAmount(999.99);
        System.out.println(o1);
        
        
        /*
       // AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
       // Account a1=(Account)context.getBean(Account.class);
       // System.out.println(a1);
        */
        context.close();
        context.registerShutdownHook();
    }
}

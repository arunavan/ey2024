package com.ey;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ey.beans.Account;
import com.ey.beans.Order;

public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
         
          Account a1=(Account)context.getBean(Account.class);
          System.out.println(a1);
          Order o=(Order)context.getBean(Order.class);
          System.out.println(o);
          System.out.println(o.hashCode());
          
          Order o1=(Order)context.getBean(Order.class);
          System.out.println(o1);
          System.out.println(o1.hashCode());
          
    }
}

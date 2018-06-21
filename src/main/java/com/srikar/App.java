package com.srikar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context=new AnnotationConfigApplicationContext(HelloworldConfig.class);
       Helloworld bean=(Helloworld) context.getBean("helloworldBean");
       bean.sayHello("srikar");
       context.close();
    }
}

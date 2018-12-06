package com.white.beandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext beancontext =new AnnotationConfigApplicationContext(HelloConfig.class);
        helloworld bean = (helloworld)beancontext.getBean("helloworld");
        bean.disp();
    }
}

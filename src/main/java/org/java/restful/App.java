package org.java.restful;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Main Class
 */
public class App {
    public static void main( String[] args ) {
		new ClassPathXmlApplicationContext(new String[] {"classpath:app.xml"});
    }
}

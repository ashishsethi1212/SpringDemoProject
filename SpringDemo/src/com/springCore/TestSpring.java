package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ashish.sethi on 09/04/16.
 */
public class TestSpring {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        Restaurant restaurant = (Restaurant)context.getBean("restaurantBean");
        restaurant.greetCustomer();
    }
}

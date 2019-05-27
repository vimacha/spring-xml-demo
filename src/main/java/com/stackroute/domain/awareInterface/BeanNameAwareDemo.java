package com.stackroute.domain.awareInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware {


    @Override
    public void setBeanName(String s) {
        System.out.println("string is"+s);
    }
}
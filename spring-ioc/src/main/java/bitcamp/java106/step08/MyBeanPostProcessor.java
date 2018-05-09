package bitcamp.java106.step08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    
    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor()");
    }
    
    
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization()");
        return null;
        // TODO Auto-generated method stub
        //return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization()");
        return null;
        // TODO Auto-generated method stub
        //return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
    
}

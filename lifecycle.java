package com.Ass8;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class lifecycle implements InitializingBean,DisposableBean,BeanNameAware{
  public void setBeanName(String name) {
        System.out.println("Setting the Bean Name");
  }        
        public void destroy() throws Exception {
        System.out.println("Destroying the Method");
        
    }
        public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing the bean");
        
    }
  }
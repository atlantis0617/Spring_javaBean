package org.spring.javabean;

public class StringStore implements Store{
	public void init() {
        
        System.out.println("执行了init方法");
         
    }
     
    public void destroy() {
         
        System.out.println("执行了destroy方法");
         
    }
}

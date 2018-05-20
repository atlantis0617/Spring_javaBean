package org.spring.javabean.test;

import org.junit.Test;
import org.spring.javabean.Store;

public class TestSpringJavaBean extends TestBase {
	public TestSpringJavaBean() {

		super("classpath:spring-javabean.xml");

	}

	@Test
	public void testJavaBean() {

		Store store = (Store) super.getBean("stringStore");
		System.out.println(store.getClass().getName());

	}
}

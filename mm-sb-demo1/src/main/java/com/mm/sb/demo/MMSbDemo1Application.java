/**
 * 
 */
package com.mm.sb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

/**
 * @author dorak
 *
 */
@SpringBootApplication
public class MMSbDemo1Application extends SpringServletContainerInitializer{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MMSbDemo1Application.class, args);
	}

}

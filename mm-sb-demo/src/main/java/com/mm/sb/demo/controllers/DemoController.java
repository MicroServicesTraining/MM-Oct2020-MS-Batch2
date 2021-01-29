/**
 * 
 */
package com.mm.sb.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
public class DemoController {
	
	@GetMapping("/")
	public String getWelcome() {
		return "<h1>Welcome to Spring boot docker demo app</h1>";
	}
	
}

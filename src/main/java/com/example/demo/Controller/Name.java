package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
//	@Value("${name}")
	private String studentName="Geones";
  @GetMapping("/name")
  public String getName()
  {
	return "welcome "+studentName+" !";
  }
}

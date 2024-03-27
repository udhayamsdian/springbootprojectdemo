package com.demo2.controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.entity.Sample;
import com.demo2.repository.SampleRepository;
@RestController
@RequestMapping("/demo2")
public class demo1 {
	
	@Autowired
	SampleRepository sRepo;
	
	
 @GetMapping("/hello")
 public String demo() {
	 return "vanakamda maapla";
 }
 
 @PostMapping("/create")
 public Sample CreateStudent(@RequestBody Sample s) {
	 
	 
	Sample sampleData = sRepo.save(s);
	 
	
	 return sampleData;
 }
}

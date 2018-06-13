package com.snkit.multimimeversion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multimime")
public class MultiMIMEVersionController {
	@RequestMapping( value= "/display",
			method=RequestMethod.GET,
			consumes= {"application/json", "application/xml","application/vnd.jhc-v1+json","application/vnd.jhc-v1+xml"} ,
			produces = { "application/json", "application/xml","application/vnd.jhc-v1+json","application/vnd.jhc-v1+xml" })
	public List<User>  show() {
		
		List<User> list = new ArrayList<>();
		
		list.add(new User("SaiSrinu","CTO"));
		list.add(new User("SaiKrithik","CEO"));
		
		return list;
		
	}
	/*
	 * Rest service version
	 */
	
	@RequestMapping( value= "/display",
			method=RequestMethod.GET,
			consumes= {"application/json", "application/xml","application/vnd.jhc-v2+json","application/vnd.jhc-v2+xml"} ,
			produces = { "application/json", "application/xml","application/vnd.jhc-v2+json","application/vnd.jhc-v2+xml" })
	public List<User>  show1() {
		
		List<User> list = new ArrayList<>();
		
		User u = new User("SaiSrinu","CTO");
		u.setCompName("Hcl");
		
		User u2 = new User("SaiKrithik","CEO");
		u2.setCompName("TCS");
		
		list.add(u);
		list.add(u2);
		
		return list;
		
	}
}

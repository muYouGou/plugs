package com.muyou.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.muyou.pojo.User;

@RestController
@RequestMapping(value="/index")
public class indexController {

	@RequestMapping(value="/hello")
	public String helloWorld() {
		return "hello";
	}
	
	@RequestMapping(value="/hello2")
	public String helloWorld2(@RequestParam(required=false)String user) {
		return user+" hello";
	}
	@RequestMapping(value="/hello3")
	public Map<String,Object> hello3(@RequestParam(required=false) String user){
		Map<String,Object> _map = new HashMap<String,Object>();
		_map.put("user", user);
		_map.put("date", new Date());
		_map.put("msg", "啥的发送端");
		return _map;
	}
	@RequestMapping(value="/hello4/{userName}/{age}/{sal}")
	public User hello4(@PathVariable(value="userName") String userName,@PathVariable(value="age") String age, 
			@PathVariable(value="sal") String sal) {
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setSal(sal);
		user.setClikse("爱你哟");
		return user;
	}
	@RequestMapping(value="/hello5")
	public User hello5(@RequestBody(required=false) User user) {
		return user;
	}
}

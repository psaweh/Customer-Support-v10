package com.wrox.site;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("session")

public class SessionController {

	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Map<String, Object> model){
		 model.put("timestamp", System.currentTimeMillis());
	     model.put("numberOfSessions", SessionRegistry.getNumberOfSessions());
	     model.put("sessionList", SessionRegistry.getAllSessions());
	     
	     return "session/list";

	}
}

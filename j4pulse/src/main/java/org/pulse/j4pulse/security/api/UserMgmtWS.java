package org.pulse.j4pulse.security.api;

import javax.servlet.http.HttpServletRequest;

import org.pulse.j4pulse.common.UtilSvc;
import org.pulse.j4pulse.utils.Request;
import org.pulse.j4pulse.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController()
@RequestMapping("/api/usermgmt")
public class UserMgmtWS {
	
	@Autowired 
	UtilSvc utilSvc;
	
	@Autowired
	UserManagerSvc userManagerSvc;
	
	@RequestMapping(value = "callService", method = RequestMethod.POST)
	public Response callService(@RequestBody Request request) {
		Response response = new Response();
		
		userManagerSvc.process(request, response);
		
		return response;
	}
	
	@RequestMapping(value = "authenticate", method = RequestMethod.POST)
	public void authenticate(HttpServletRequest request) {
		
		// This is placeholder for filter
	}
}

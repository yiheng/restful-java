package org.java.restful.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("DemoService")
public class DemoService {
	private static final Logger logger = LoggerFactory.getLogger(DemoService.class);
	
	@GET
	@Path("/echo/{msg}")    
	@Produces("application/json")
	public String echo(@PathParam("msg") String msg) {
		logger.debug("Start echo===>");
		logger.info("Recieve msg is " + msg);
		logger.debug("End echo<===");
		return msg;
	}
}

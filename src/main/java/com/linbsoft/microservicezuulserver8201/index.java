package com.linbsoft.microservicezuulserver8201;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
	  @RequestMapping("/")
	    public String indexmain() {
	        return "me is  MicroserviceZuulServer8201 on centos7.linbsoft.com:8201";
	    }
	  @RequestMapping("/hello")
	    public String hellomain() {
	        return "me is  MicroserviceZuulServer8201/hello on centos7.linbsoft.com:8201";
	    }
}

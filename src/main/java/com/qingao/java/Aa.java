package com.qingao.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Aa {
	@RequestMapping("/aa")
	public Object aa(){
		return "吆西";
	}
}

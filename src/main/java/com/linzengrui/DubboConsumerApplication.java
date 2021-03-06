package com.linzengrui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DubboConsumerApplication {

    @Autowired
    Consumer consumer;

    @RequestMapping("/consumer")
    @ResponseBody
    public String refer(){
        return consumer.personConsumer().get().talk();
    }


	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}

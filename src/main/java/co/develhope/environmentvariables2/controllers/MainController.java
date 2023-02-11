package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {

    @Autowired
    private Environment environment;


    @GetMapping("/welcomeMsgProd")
    public String welcomeMsgProd(){
        return environment.getProperty("myCustomEnvs.welcomeMsg");
    }

    @Value("${myCustomEnvs.welcomeMsg}")
    String welcomeMsg;

    @GetMapping("/welcomeMsgTest")
    public String welcomeMsgTest(){
        return welcomeMsg;
    }

}

package com.shareride.shareride;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
private static final String welcomemsg = "Welcome Mr. %s!";
    @PostMapping("/welcome/user")
    @ResponseBody
    
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {
        return new Welcome( name);
    }
}
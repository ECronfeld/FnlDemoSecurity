package com.fnl.demo.resource;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloeResource {

    @GetMapping("/all")
    public String Hello(){
        return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured")
    public String securedHello(){
        return "Secured Hello";
    }

    @GetMapping("/home")
    public String alternate(){
        return "alternate";
    }

    public String welcome(){
        return "Welcome";
    }
}

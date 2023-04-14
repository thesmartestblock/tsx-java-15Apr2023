package com.example.tsxjava.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tsxjava.Entities.HookResponse;

@RestController
@RequestMapping("/webhooks")
public class Controller {

    /*
     * As the resources are limited and insufficient info. 
     * I have created temparory repo in controlled with array list.
     * Services are not created as I am not sure of the exact requirement.
     */


    List<HookResponse> hooks = new ArrayList<>();

    @GetMapping("/{id}")
    public String display(@PathVariable Integer id){
        if(id>hooks.size()) {

            return "invalid id. Id should be from 1 to " + hooks.size();
        }
    return hooks.get(id-1).getResponse();
    }

    @PostMapping("/")
    public ResponseEntity<HookResponse> printToConsole(@RequestBody String input) {
        HookResponse hook = new HookResponse(input);
        hooks.add(hook);
        System.out.println(input);
        return new ResponseEntity<HookResponse>(hook, HttpStatus.OK);
    }
    
}

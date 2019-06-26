package com.mateusz.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class DataController {

    private DataService dataService;

    @Autowired
    public DataController(DataService dataService){
        this.dataService = dataService;
    }

    @GetMapping("/info")
    public ResponseEntity<UserInfo> getUserInfo(){
        return dataService.prepareUserInfo("octocat" );

    }
}

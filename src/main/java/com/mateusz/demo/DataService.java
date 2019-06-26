package com.mateusz.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class DataService {

    private final String baseUrl = "https://api.github.com/users/";

    ResponseEntity<UserInfo> prepareUserInfo(String userName){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response =  restTemplate.getForEntity(baseUrl + userName, String.class);

        ObjectMapper objectMapper  = new ObjectMapper();
        try{
            GithubUserInfo githubUserInfo = objectMapper.readValue(response.getBody(), GithubUserInfo.class);
            return new ResponseEntity<>(new UserInfo(githubUserInfo), HttpStatus.OK);

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}

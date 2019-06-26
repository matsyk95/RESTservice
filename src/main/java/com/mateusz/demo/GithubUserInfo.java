package com.mateusz.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUserInfo {

    public String id;
    public String login;
    public String name;
    public String type;
    @JsonProperty("avatar_url")
    public String avatarUrl;
    @JsonProperty("created_at")
    public String createdAt;
    public String calculation;
}

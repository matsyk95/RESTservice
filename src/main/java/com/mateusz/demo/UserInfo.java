package com.mateusz.demo;


import lombok.Data;

@Data
class UserInfo {
    private String id;
    private String login;
    private String name;
    private String type;

    private String avatarUrl;

    private String createdAt;
    private Integer calculation;

    UserInfo(GithubUserInfo user){
        this.id = user.getId();
        this.login = user.getLogin();
        this.name = user.getName();
        this.type = user.getType();
        this.avatarUrl = user.getAvatarUrl();
        this.createdAt = user.getCreatedAt();
        this.calculation = 6 / 2 * (2 + 1);
    }
}

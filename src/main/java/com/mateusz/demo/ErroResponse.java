package com.mateusz.demo;

import lombok.Data;

@Data
public class ErroResponse {
    private String statusCode;
    private String name;
    private String description;

    public ErroResponse(String statusCode, String name, String description) {
        this.statusCode = statusCode;
        this.name = name;
        this.description = description;
    }
}

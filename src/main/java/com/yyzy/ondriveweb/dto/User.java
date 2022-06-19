package com.yyzy.ondriveweb.dto;

import lombok.Data;

@Data
public class User {
    private String userCode;
    private String userName;
    private String password;
    private String clientId;
    private String clientSecret;
    private String tenantId;
}

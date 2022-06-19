package com.yyzy.ondriveweb.dto.common;

import lombok.Data;

@Data
public class Result<T> {
    private Integer status;
    private String msg;
    private T data;

    public Result<T> setSuccessResult(T data) {
        this.status = 0;
        this.msg = "ok";
        this.data = data;
        return this;
    }

    public Result<T> setFailResult() {
        this.status = -1;
        this.msg = "error";
        this.data = null;
        return this;
    }
}

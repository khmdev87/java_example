package com.example.demo.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseDto {
    private BaseDto rsp;

    public BaseDto getRsp() {
        return rsp;
    }

    public void setRsp(BaseDto rsp) {
        this.rsp = rsp;
    }

}

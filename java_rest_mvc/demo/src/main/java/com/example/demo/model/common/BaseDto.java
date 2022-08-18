package com.example.demo.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BaseDto {

    private String stat;
    private ErrorDto err;
    private String desc;

    public String getStat() {
        return stat;
    }

    public ErrorDto getErr() {
        return err;
    }

    public String getDesc() {
        return desc;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void setErr(ErrorDto err) {
        this.err = err;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}

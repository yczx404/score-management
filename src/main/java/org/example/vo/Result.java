package org.example.vo;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = -3948389268046368059L;

    private Integer code;

    private String msg;

    private T data ;


    Result() {
    }

    private Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }



    public static <T> Result<T> failure(String failMsg) {
        Result result = new Result();
        result.setMsg(failMsg);
        result.setCode(-1);
        return result;
    }




    public static <T> Result<T> success(T data) {
        Result result = new Result();
        result.setCode(1);
        result.setData(data);
        return result;
    }

    public Result msg(String message) {
        this.setMsg(message);
        return this;
    }

    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }





    /**
     *     getter setter
     */
    public Integer getCode() {
        return code;
    }

    private void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }


    public T getData() {
        return data;
    }


    private void setData(T data) {
        this.data = data;
    }

}

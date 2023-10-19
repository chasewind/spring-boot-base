package com.deer.spi.model;



import java.time.Instant;
import java.time.ZonedDateTime;


public class Result<T> {

    public static final String SUCCESSFUL_CODE = "000000";

    public static final String SUCCESSFUL_MSG = "处理成功";


    private String code;


    private String msg;


    private Instant time;


    private T data;

    public Result() {
        this.time = ZonedDateTime.now().toInstant();
    }

    public Result(ErrorType errorType) {
        this.code = errorType.getCode();
        this.msg = errorType.getMsg();
        this.time = ZonedDateTime.now().toInstant();
    }

    public Result(ErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }


    private Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.time = ZonedDateTime.now().toInstant();
    }


    public static Result success(Object data) {
        return new Result<>(SUCCESSFUL_CODE, SUCCESSFUL_MSG, data);
    }


    public static Result success() {
        return success(null);
    }


    public static Result fail() {
        return new Result(SystemErrorType.SYSTEM_ERROR);
    }




    public static Result fail(ErrorType errorType, Object data) {
        return new Result<>(errorType, data);
    }

    public static Result fail(ErrorType errorType) {
        return Result.fail(errorType, null);
    }

    public static Result fail(Object data) {
        return new Result<>(SystemErrorType.SYSTEM_ERROR, data);
    }



    public boolean isSuccess() {
        return SUCCESSFUL_CODE.equals(this.code);
    }

    public boolean isFail() {
        return !isSuccess();
    }
}

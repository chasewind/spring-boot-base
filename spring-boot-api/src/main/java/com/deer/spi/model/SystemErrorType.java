package com.deer.spi.model;



public enum SystemErrorType implements ErrorType {

    SYSTEM_ERROR("-1", "系统异常");


    /**
     * 错误类型码
     */
    private String code;

    /**
     * 错误类型描述信息
     */
    private String msg;

    SystemErrorType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }


    @Override
    public String getMsg() {
        return msg;
    }


}

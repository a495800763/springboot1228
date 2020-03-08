package com.liumq.springboottest1.enumpackage;

import jdk.nashorn.internal.objects.annotations.Getter;


public enum ResultCodeEnum {


    SUCCESS(true,20000,"成功"),
    UNKNOWN_REASON(false,20001,"未知错误"),
    BAD_SQL_GRAMMAR(false,21001,"sql语法错误"),
    JSON_PARSE_ERROR(false,21002,"json解析异常"),
    PARAM_ERROR(false,21003,"参数不正确"),
    FILE_UPLOAD_ERROR(false,21004,"文件上传错误"),
    EXCEL_DATA_IMPORT_ERROR(false,21005,"Excel数据导入错误");

    public boolean isSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private boolean success;
    private Integer code;
    private String message;

    private ResultCodeEnum(Boolean success,Integer code ,String message)
    {
        this.success=success;
        this.code = code;
        this.message = message;
    }
}

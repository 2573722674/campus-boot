package com.zhigu.entity;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:01
 */

public class ProcessContext{
    // 学校编码
    private String schoolCode;

    // 处理类型
    private HandleType handleType;

    private String jsonStr;

    private Object result;

    public ProcessContext(String schoolCode, HandleType handleType) {
        this.schoolCode = schoolCode;
        this.handleType = handleType;
    }


    public String getServiceKey() {
        return this.schoolCode + "#" + this.handleType;
    }


    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public HandleType getHandleType() {
        return handleType;
    }

    public void setHandleType(HandleType handleType) {
        this.handleType = handleType;
    }

    public String getJsonStr() {
        return jsonStr;
    }

    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}

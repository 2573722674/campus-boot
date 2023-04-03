package com.zhigu.entity.param;

import java.io.Serializable;

/**
 * 参数类
 * !!!需要添加新参数时，请优先选择添加构造方法而不是修改现有的构造方法!!!
 */
public class TranscriptsParam implements Serializable {
    private String studentId;
    private TranscriptsParam() {/*空构造方法勿删，供序列化框架使用*/}

    public TranscriptsParam(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}

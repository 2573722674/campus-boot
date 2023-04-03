package com.zhigu.entity.param;

import java.io.Serializable;

/**
 * 参数类
 * !!!需要添加新参数时，请优先选择添加构造方法而不是修改现有的构造方法!!!
 */
public class ScheduleParam implements Serializable {
    private String semester;

    private String studentId;

    private ScheduleParam() {/*勿删，序列化用*/}

    public ScheduleParam(String semester, String studentId) {
        this.semester = semester;
        this.studentId = studentId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

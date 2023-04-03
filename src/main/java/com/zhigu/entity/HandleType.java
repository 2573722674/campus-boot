package com.zhigu.entity;

/**
 * 解析数据类型
 *
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:02
 */
public enum HandleType {
    UNDERGRADUATE_HANDLE_STUDENT_INFO("本科生处理学生信息"),
    UNDERGRADUATE_HANDLE_SCHEDULE_INFO("本科生处理课表信息"),
    UNDERGRADUATE_HANDLE_TRANSCRIPT_INFO("本科生处理成绩信息"),

    POSTGRADUATE_HANDLE_STUDENT_INFO("研究生处理学生信息"),
    POSTGRADUATE_HANDLE_SCHEDULE_INFO("研究生处理课表信息"),
    POSTGRADUATE_HANDLE_TRANSCRIPT_INFO("研究生处理成绩信息");


    private String mean;

    HandleType(String mean) {
        this.mean = mean;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
}

package com.zhigu.entity;

/**
 * 解析数据类型
 *
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:02
 */
public enum HandleType {
    HANDLE_STUDENT_INFO("获取学生信息"),
    HANDLE_SCHEDULE_INFO("获取课表信息"),
    HANDLE_TRANSCRIPT_INFO("获取成绩信息");
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

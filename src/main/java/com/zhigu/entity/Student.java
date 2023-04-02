package com.zhigu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    String studentId;

    String name;

    String birthday;

    String college;

    String major;

    String clazz;

    int grade;

    int gender;

    int univId;


}

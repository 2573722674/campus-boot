package com.zhigu.parser.impl.wpue.undergraduate;

import com.zhigu.entity.Constants;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ProcessContext;
import com.zhigu.entity.Student;
import com.zhigu.entity.param.StudentInfoParam;
import com.zhigu.parser.AbstractHandleStudentInfo;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:34
 */

public class WpueHandleStudentInfoImpl extends AbstractHandleStudentInfo<StudentInfoParam> {

    public String getSchoolCode() {
        return Constants.SchoolCode.WPUE;
    }

    @Override
    public HandleType getHandleType() {
        return HandleType.UNDERGRADUATE_HANDLE_STUDENT_INFO;
    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @param processContext
     * @return
     * @author 之古 2023-04-02 11:14
     */
    @Override
    public String preObtainProcess(ProcessContext processContext, StudentInfoParam param) {
        // 根据学校code,获取studentInfoStr并return
        System.out.println("wpue preObtainProcess");
        return "studentStr";
    }

    @Override
    public Student preParseProcess(ProcessContext processContext, StudentInfoParam param) {
        // 根据html/json解析生成student对象并return
        System.out.println("wpue preParseProcess");


        return new Student();
    }
}

package com.zhigu.parser;

import com.zhigu.entity.SchoolContext;
import com.zhigu.entity.Student;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:20
 */
public abstract class AbstractHandleStudentInfo implements HandleProcess {
    public void obtainProcess(SchoolContext schoolContext) {
        String studentInfoStr = this.preObtainProcess(schoolContext);
        schoolContext.setJsonStr(studentInfoStr);
    }

    public void parseProcess(SchoolContext schoolContext) {
        Student student = this.preParseProcess(schoolContext);
        schoolContext.setResult(student);
        // 可执行入库操作

    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @return
     * @author 之古 2023-04-02 11:14
     */
    public abstract String preObtainProcess(SchoolContext schoolContext);


    public abstract Student preParseProcess(SchoolContext schoolContext);


}

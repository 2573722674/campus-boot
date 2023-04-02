package com.zhigu.parser;

import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.entity.SchoolContext;
import com.zhigu.entity.Student;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 11:25
 */
public abstract class AbstractHandleSchedule implements HandleProcess{

    public void obtainProcess(SchoolContext schoolContext) {
        String studentInfoStr = this.preObtainProcess(schoolContext);
        schoolContext.setJsonStr(studentInfoStr);
    }

    public void parseProcess(SchoolContext schoolContext) {
        ScheduleParseResult scheduleParseResult = this.preParseProcess(schoolContext);
        schoolContext.setResult(scheduleParseResult);
        // 可执行入库操作

    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @return
     * @author 之古 2023-04-02 11:14
     */
    public abstract String preObtainProcess(SchoolContext schoolContext);


    public abstract ScheduleParseResult preParseProcess(SchoolContext schoolContext);

}

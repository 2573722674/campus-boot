package com.zhigu.parser;

import com.alibaba.fastjson.JSON;
import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.entity.ProcessContext;



/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 11:25
 */
public abstract class AbstractHandleSchedule<T> implements HandleProcess<T> {

    public void obtainProcess(ProcessContext processContext, String paramJson) {
        T param = JSON.parseObject(paramJson, getTClass());

        String studentInfoStr = this.preObtainProcess(processContext, param);
        processContext.setJsonStr(studentInfoStr);
    }

    public void parseProcess(ProcessContext processContext, String paramJson) {

        T param = JSON.parseObject(paramJson, getTClass());
        ScheduleParseResult scheduleParseResult = this.preParseProcess(processContext, param);
        processContext.setResult(scheduleParseResult);
        // 可执行入库操作

    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @return
     * @author 之古 2023-04-02 11:14
     */
    public abstract String preObtainProcess(ProcessContext processContext, T param);


    public abstract ScheduleParseResult preParseProcess(ProcessContext processContext, T param);

}

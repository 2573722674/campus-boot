package com.zhigu;

import com.alibaba.fastjson.JSON;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ProcessContext;
import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.parser.HandleEngine;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/03 15:54
 */
public class Test {
    public static void main(String[] args) {
        HandleEngine handleEngine = new HandleEngine();

        ProcessContext processContext = new ProcessContext("wust", HandleType.UNDERGRADUATE_HANDLE_SCHEDULE_INFO);
        handleEngine.process(processContext, "{\"semester\":\"2022-1\",\"studentId\":\"2018\"}");
        ScheduleParseResult result = (ScheduleParseResult) processContext.getResult();
        System.out.println(JSON.toJSONString(result));
    }
}

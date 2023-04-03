package com.zhigu;

import cn.hutool.json.JSONUtil;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.entity.ProcessContext;
import com.zhigu.parser.HandleEngine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CampusCoreApplicationTests {

    @Autowired
    private HandleEngine handleEngine;

    @Test
    public void test1() {
        ProcessContext processContext = new ProcessContext("wust", HandleType.UNDERGRADUATE_HANDLE_SCHEDULE_INFO);
        handleEngine.process(processContext, "{\"semester\":\"2022-1\",\"studentId\":\"2018\"}");
        ScheduleParseResult result = (ScheduleParseResult) processContext.getResult();
        System.out.println(JSONUtil.toJsonStr(result));
    }

}

package com.zhigu.parser.impl.wust.undergraduate;

import com.alibaba.fastjson.JSON;
import com.zhigu.entity.Constants;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ProcessContext;
import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.entity.param.ScheduleParam;
import com.zhigu.parser.AbstractHandleSchedule;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:30
 */

public class WustHandleScheduleImpl extends AbstractHandleSchedule<ScheduleParam> {


    public String getSchoolCode() {
        return Constants.SchoolCode.WUST;
    }


    public HandleType getHandleType() {
        return HandleType.UNDERGRADUATE_HANDLE_SCHEDULE_INFO;
    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @param processContext
     * @return
     * @author 之古 2023-04-02 11:14
     */
    @Override
    public String preObtainProcess(ProcessContext processContext, ScheduleParam param) {

        // 根据学校code,获取studentInfoStr并return
        System.out.println("wust HANDLE_SCHEDULE_INFO preObtainProcess");
        return "scheduleStr";
    }

    @Override
    public ScheduleParseResult preParseProcess(ProcessContext processContext, ScheduleParam param) {
        // 根据html/json解析生成student对象并return
        System.out.println("wust HANDLE_SCHEDULE_INFO preParseProcess");
        System.out.println(JSON.toJSONString(param));

        return new ScheduleParseResult(null, 0);
    }
}

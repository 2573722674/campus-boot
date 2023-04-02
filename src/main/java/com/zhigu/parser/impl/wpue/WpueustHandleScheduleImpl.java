package com.zhigu.parser.impl.wpue;

import com.zhigu.entity.Constants;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.entity.SchoolContext;
import com.zhigu.parser.AbstractHandleSchedule;
import org.springframework.stereotype.Component;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:30
 */
@Component
public class WpueustHandleScheduleImpl extends AbstractHandleSchedule {


    public String getSchoolCode() {
        return Constants.SchoolCode.WUST;
    }

    @Override
    public HandleType getHandleType() {
        return HandleType.HANDLE_SCHEDULE_INFO;
    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @param schoolContext
     * @return
     * @author 之古 2023-04-02 11:14
     */
    @Override
    public String preObtainProcess(SchoolContext schoolContext) {
        // 根据学校code,获取studentInfoStr并return
        System.out.println("wpue HANDLE_SCHEDULE_INFO preObtainProcess");
        return "scheduleStr";
    }

    @Override
    public ScheduleParseResult preParseProcess(SchoolContext schoolContext) {
        // 根据html/json解析生成student对象并return
        System.out.println("wpue HANDLE_SCHEDULE_INFO preParseProcess");

        return new ScheduleParseResult(null, 0);
    }
}

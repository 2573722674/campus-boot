package com.zhigu.parser;

import com.zhigu.entity.HandleType;
import com.zhigu.entity.ProcessContext;
import com.zhigu.parser.impl.wpue.undergraduate.WpueHandleScheduleImpl;
import com.zhigu.parser.impl.wpue.undergraduate.WpueHandleStudentInfoImpl;
import com.zhigu.parser.impl.wust.undergraduate.WustHandleScheduleImpl;
import com.zhigu.parser.impl.wust.undergraduate.WustHandleStudentInfoImpl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 11:23
 */

public class HandleFactory {


    private static final Map<String, HandleProcess> handleProcessMap = new HashMap<>();


    static {

        List<HandleProcess> handleProcessList = new ArrayList<>();
        // 手动注入武工程
        handleProcessList.add(new WpueHandleScheduleImpl());
        handleProcessList.add(new WpueHandleStudentInfoImpl());


        // 手动注入武科大
        handleProcessList.add(new WustHandleStudentInfoImpl());
        handleProcessList.add(new WustHandleScheduleImpl());


        handleProcessList.forEach(processService -> {
            String serviceKey = processService.getServiceKey();
            if (serviceKey != null) {
                handleProcessMap.put(serviceKey, processService);
            }
        });


    }


    public HandleProcess getHandleProcess(ProcessContext context) {
        return this.handleProcessMap.get(context.getServiceKey());
    }

    public HandleProcess getHandleProcess(String schoolCode, HandleType handleType) {
        return this.handleProcessMap.get(schoolCode + "#" + handleType);
    }
}

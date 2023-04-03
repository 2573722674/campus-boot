package com.zhigu.parser;

import com.zhigu.entity.ProcessContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 11:49
 */
@Component
public class HandleEngine {

    @Autowired
    private HandleFactory handleFactory;

    /**
     * 传入学校编码和处理类型即可拿到结果，存在schoolContext中
     *
     * @return
     * @author 之古 2023-04-02 12:01
     */

    public void process(ProcessContext processContext, String paramJson) {
        HandleProcess handleProcess = handleFactory.getHandleProcess(processContext);
        if (handleProcess == null) {
            System.out.println("没有相应的处理规则");
            return;
        }
        handleProcess.process(processContext, paramJson);
    }


    public void obtainProcess(ProcessContext processContext, String paramJson) {
        HandleProcess handleProcess = handleFactory.getHandleProcess(processContext);
        if (handleProcess == null) {
            System.out.println("没有相应的处理规则");
            return;
        }
        handleProcess.obtainProcess(processContext, paramJson);
    }

    public void parseProcess(ProcessContext processContext, String paramJson) {
        HandleProcess handleProcess = handleFactory.getHandleProcess(processContext);
        if (handleProcess == null) {
            System.out.println("没有相应的处理规则");
            return;
        }
        handleProcess.parseProcess(processContext, paramJson);
    }


}

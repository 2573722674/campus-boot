package com.zhigu.parser;

import com.zhigu.entity.HandleType;
import com.zhigu.entity.SchoolContext;
import org.springframework.util.StringUtils;

/**
 * 定义处理最顶层接口
 *
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:14
 */
public interface HandleProcess {

    default String getServiceKey() {
        return this.getSchoolCode() + "#" + getHandleType();
    }

    String getSchoolCode();

    HandleType getHandleType();

    default void process(SchoolContext schoolContext) {
        this.obtainProcess(schoolContext);
        if (!StringUtils.isEmpty(schoolContext.getJsonStr())) {
            this.parseProcess(schoolContext);
        }
    }


    void obtainProcess(SchoolContext schoolContext);

    void parseProcess(SchoolContext schoolContext);
}

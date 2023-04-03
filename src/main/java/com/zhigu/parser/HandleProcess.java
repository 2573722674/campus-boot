package com.zhigu.parser;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ProcessContext;
import org.springframework.util.StringUtils;

/**
 * 定义处理最顶层接口
 *
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:14
 */
public interface HandleProcess<T> {


    default String getServiceKey() {
        return this.getSchoolCode() + "#" + getHandleType();
    }

    String getSchoolCode();

    HandleType getHandleType();

    default void process(ProcessContext processContext, String paramJson) {
        this.obtainProcess(processContext, paramJson);
        if (!StringUtils.isEmpty(processContext.getJsonStr())) {
            this.parseProcess(processContext, paramJson);
        }
    }


    //获取处理
    public abstract void obtainProcess(ProcessContext processContext, String paramJson);

    //解析处理
    public abstract void parseProcess(ProcessContext processContext, String paramJson);
}

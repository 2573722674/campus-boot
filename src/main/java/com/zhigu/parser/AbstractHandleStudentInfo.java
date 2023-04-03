package com.zhigu.parser;

import com.alibaba.fastjson.JSON;
import com.zhigu.entity.ProcessContext;
import com.zhigu.entity.Student;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 10:20
 */
public abstract class AbstractHandleStudentInfo<T> implements HandleProcess<T> {
    private Class<T> tClass;

    public void obtainProcess(ProcessContext processContext, String paramJson) {
        T param = JSON.parseObject(paramJson, this.tClass);

        String studentInfoStr = this.preObtainProcess(processContext, param);
        processContext.setJsonStr(studentInfoStr);
    }

    public void parseProcess(ProcessContext processContext, String paramJson) {
        T param = JSON.parseObject(paramJson, this.tClass);

        Student student = this.preParseProcess(processContext, param);
        processContext.setResult(student);
        // 可执行入库操作

    }

    /**
     * 提供给不同学校实现获取学生信息的json/xml/html数据的方法
     *
     * @return
     * @author 之古 2023-04-02 11:14
     */
    public abstract String preObtainProcess(ProcessContext processContext, T param);


    public abstract Student preParseProcess(ProcessContext processContext, T param);


}

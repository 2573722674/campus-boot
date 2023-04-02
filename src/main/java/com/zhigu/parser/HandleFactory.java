package com.zhigu.parser;

import com.zhigu.entity.HandleType;
import com.zhigu.entity.SchoolContext;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 曹志恒 zhiheng.cao@hand-china.com
 * 2023/04/02 11:23
 */
@Component
public class HandleFactory {


    private final List<HandleProcess> handleProcessList;

    private final Map<String, HandleProcess> handleProcessMap = new HashMap<>();

    public HandleFactory(ObjectProvider<List<HandleProcess>> listObjectProvider) {
        this.handleProcessList = listObjectProvider.getIfAvailable();
    }

    @PostConstruct
    public void init() {
        if (!CollectionUtils.isEmpty(this.handleProcessList)) {
            this.handleProcessList.forEach(processService -> {
                String serviceKey = processService.getServiceKey();
                if (!StringUtils.isEmpty(serviceKey)) {
                    this.handleProcessMap.put(serviceKey, processService);
                }
            });
        }
    }


    public HandleProcess getHandleProcess(SchoolContext context) {
        return this.handleProcessMap.get(context.getServiceKey());
    }

    public HandleProcess getHandleProcess(String schoolCode, HandleType handleType) {
        return this.handleProcessMap.get(schoolCode + "#" + handleType);
    }
}

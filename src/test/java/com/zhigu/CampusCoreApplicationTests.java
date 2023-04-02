package com.zhigu;

import cn.hutool.json.JSONUtil;
import com.zhigu.entity.HandleType;
import com.zhigu.entity.ScheduleParseResult;
import com.zhigu.entity.SchoolContext;
import com.zhigu.parser.HandleEngine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CampusCoreApplicationTests {

	@Autowired
	private HandleEngine handleEngine;

	@Test
	public void test1(){
		SchoolContext schoolContext = new SchoolContext("wust", HandleType.HANDLE_SCHEDULE_INFO);
		handleEngine.process(schoolContext);
		ScheduleParseResult result = (ScheduleParseResult) schoolContext.getResult();
		System.out.println(JSONUtil.toJsonStr(result));
	}

}

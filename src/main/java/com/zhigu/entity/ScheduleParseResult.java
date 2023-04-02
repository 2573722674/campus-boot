package com.zhigu.entity;



import java.io.Serializable;
import java.util.List;

public class ScheduleParseResult implements Serializable {

    private List<Lesson> lessons;

    private int count;

    private ScheduleParseResult() {/*勿删*/}


    public ScheduleParseResult(List<Lesson> lessons, int count) {
        this.lessons = lessons;
        this.count = count;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

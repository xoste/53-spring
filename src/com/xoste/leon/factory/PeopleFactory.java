package com.xoste.leon.factory;

import com.xoste.leon.pojo.People;

public class PeopleFactory {
    public static People newInstance() {
        return new People(1, "测试");
    }
}

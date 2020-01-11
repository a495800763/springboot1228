package com.example.springboottest1.util.enumPackage;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:LiuMengQi Description:
 * Date:Created in 17:25 ${Date}
 * Modified by :liumq
 */
public enum enumUserType {
    /**
     * 学生
     */
    Student(1),//0
    /**
     * 老师
     */
    Teacher(2),//1
    /**
     * 管理员
     */
    MANAGER(3),//2
    /**
     * 其他
     */
    OTHER(4);//3

    public static final int SIZE = Integer.SIZE;

    private int intValue;

    private static Map<Integer, enumUserType> mappings;

    private synchronized static Map<Integer, enumUserType> getMappings() {
        if (mappings == null) {
            mappings = new java.util.HashMap<Integer, enumUserType>();
        }
        return mappings;
    }

    private enumUserType(int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static enumUserType forValue(int value) {
        return getMappings().get(value);
    }

}

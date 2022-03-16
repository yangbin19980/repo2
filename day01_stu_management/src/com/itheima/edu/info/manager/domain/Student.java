package com.itheima.edu.info.manager.domain;

/**
 * 学生实体类
 */
public class Student {
    //学号
    private String id;
    //学生姓名
    private String name;
    //学生年龄
    private String age;
    //生日
    private String birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

package com.enumDemo;

public enum EnumTest {
    PEOPLE,
    ANIMAL,
    CLASS("name","id"),;

    EnumTest(String stuName, String stuId) {
        this.stuName = stuName;
        this.stuId = stuId;
    }

    EnumTest() {
    }

    private String stuName;
    private String stuId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}

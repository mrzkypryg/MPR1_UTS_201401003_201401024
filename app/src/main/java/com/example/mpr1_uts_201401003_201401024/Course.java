package com.example.mpr1_uts_201401003_201401024;

public class Course {
    String courseTitle, courseShortDescription, courseColor;
    int courseImage;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseShortDescription() {
        return courseShortDescription;
    }

    public void setCourseShortDescription(String courseShortDescription) {
        this.courseShortDescription = courseShortDescription;
    }

    public String getCourseColor() {
        return courseColor;
    }

    public void setCourseColor(String courseColor) {
        this.courseColor = courseColor;
    }

    public int getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(int courseImage) {
        this.courseImage = courseImage;
    }

    public Course(String title, String description, int image, String color){
        this.courseTitle = title;
        this.courseShortDescription = description;
        this.courseColor = color;
        this.courseImage = image;


    }
}

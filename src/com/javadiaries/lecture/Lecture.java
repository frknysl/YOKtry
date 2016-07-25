package com.javadiaries.lecture;

public class Lecture {
	private String lecture;
	private String lectureInstructorName;
	private int lectureCapacity;
	
	public Lecture(String lecture1,String lectureInstructorName1,int lectureCapacity1) {
		lecture = lecture1;
		lectureInstructorName = lectureInstructorName1;
		lectureCapacity = lectureCapacity1;
	}
	

	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public String getLectureInstructorName() {
		return lectureInstructorName;
	}

	public void setLectureInstructorName(String lectureInstructorName) {
		this.lectureInstructorName = lectureInstructorName;
	}

	public int getLectureCapacity() {
		return lectureCapacity;
	}

	public void setLectureCapacity(int lectureCapacity) {
		this.lectureCapacity = lectureCapacity;
	}

	public void printLectureformation(){
		System.out.println("");
		System.out.println("SUBJECT                          : " + lecture);
		System.out.println("SUBJECT INSTRUCTOR'S NAME        : " + lectureInstructorName);		
		System.out.println("SUBJECT'S STUDENT CAPACÝTY       : " + lectureCapacity);
	}
	

}

package com.javaex.ex03;

public class Sparrow implements Soundable {
	
	// 필드
	private String sound;
	// 생성자
	Sparrow(){
	}
	
	// 메소드 gs
	
	// 메소드 일반
	public String sound() {
		this.sound = "짹짹";
		return sound;
	}
	

}

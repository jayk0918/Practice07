package com.javaex.ex02;

public abstract class Bird {
	// abstract -> 추상클래스
	
	// 필드
    private String name;
    
    // 생성자
    Bird(){}
    

    // 메소드 gs
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    // 메소드 일반
	public void fly() {}
	public void sing() {}
	public void showName() {}


}

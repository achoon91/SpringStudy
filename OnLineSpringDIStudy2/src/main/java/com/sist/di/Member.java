package com.sist.di;
// 생성자 DI ==> 객체 생성시에 생성자 매개변수에 값을 채워라
/*
 * 		XML, Annotataion ==> 스프링에 요청
 * 		
 * 		=> 프로그램
 * 			개발자 전체 처리 (소프트웨어 전체)
 * 			필요시마다 스프링에 요청 => 값을 얻어온다 (소프트웨어 제어하는 제어권 => 스프링)
 * 				=> 제어가 역전 (Ioc) => 마틴 파울러
 * 			=> 소프트웨어 기반으로 프로그램 제작
 */
public class Member {
	private String name;
	private String addr;
	private String tel;
	public Member(String name,String addr, String tel){
		this.name= name;
		this.addr= addr;
		this.tel= tel;
	}
	public void print()
	{
		System.out.println("이름:"+name);
		System.out.println("주소:"+addr);
		System.out.println("전화:"+tel);
	}
}

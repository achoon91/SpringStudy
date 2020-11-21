package com.sist.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] xml={"app1.xml","app2.xml"}; // 2�� �̻��̸� �迭�� ó��
		ApplicationContext app=new ClassPathXmlApplicationContext(xml);
		Sawon sa=(Sawon)app.getBean("sa"); // Object => �ݵ�� ����ȯ
		System.out.println("�̸�:"+sa.getName());
		System.out.println("�μ�:"+sa.getDept());
		System.out.println("����:"+sa.getJob());
		Member mem=app.getBean("mem",Member.class);
		System.out.println("�̸�:"+mem.getName());
		System.out.println("�ּ�:"+mem.getAddr());
		System.out.println("��ȭ:"+mem.getTel());
	}

}
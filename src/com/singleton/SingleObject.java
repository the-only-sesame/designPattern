package com.singleton;

public class SingleObject {
	//创建一个singleobject的对象
	private static SingleObject instance = new SingleObject();
	
	//让构造函数为private，这样该类就不会被实例化
	private SingleObject() {}
	
	//获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("你好芝麻");
	}

}

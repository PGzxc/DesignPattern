package com.design.proxy;

public class AppCglib {

	public static void main(String[] args) {
		 //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactoryCglib(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();

	}

}

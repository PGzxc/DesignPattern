package com.design.proxy;

public class AppCglib {

	public static void main(String[] args) {
		 //Ŀ�����
        UserDao target = new UserDao();

        //�������
        UserDao proxy = (UserDao)new ProxyFactoryCglib(target).getProxyInstance();

        //ִ�д������ķ���
        proxy.save();

	}

}

package com.design.proxy;

public class App {

	public static void main(String[] args) {
        //Ŀ�����
        UserDao target = new UserDao();
        //�������,��Ŀ����󴫸��������,���������ϵ
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();//ִ�е��Ǵ���ķ���
    }
}

package com.design.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {

	//��������ļ���
    private List<String> parts = new ArrayList<String>();

    //���ڽ������װ��������
    public void Add(String part){
    parts.add(part);
}

    public void Show(){
          for (int i = 0;i<parts.size();i++)
          {    
        	  System.out.println("���"+parts.get(i)+"װ����");
          }
          System.out.println("������װ��ɣ�������");
}
}

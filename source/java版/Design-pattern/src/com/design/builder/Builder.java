package com.design.builder;

public abstract class Builder {

	//��һ����װCPU
	//����Ϊ���󷽷�������������ʵ�� 
	  public abstract void  BuildCPU();

	//�ڶ�����װ����
	//����Ϊ���󷽷�������������ʵ�� 
	 public abstract void BuildMainboard();

	//��������װӲ��
	//����Ϊ���󷽷�������������ʵ�� 
	 public abstract void BuildHD();

	//���ز�Ʒ�ķ����������װ�õĵ���
	public abstract Computer GetComputer();
}

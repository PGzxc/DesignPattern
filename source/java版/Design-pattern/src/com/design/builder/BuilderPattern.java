package com.design.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		//���˺ܾ����ڷ���һ�Һ��ʵĵ��Ե�
		//�ҵ��õ���ϰ��װ����Ա
		  Director director = new Director();
		  Builder builder = new ConcreteBuilder();
		 //��ͨ������ϰ��װ����Աȥװ����
		 director.Construct(builder);
		//װ�����װ��Ա������װ�õĵ���
		 Computer computer = builder.GetComputer();
		//��װ��Աչʾ���Ը�С�ɿ�
		computer.Show();
   
	}
}

package com.design.builder;

public class ConcreteBuilder extends  Builder
{
	//������Ʒʵ��
    Computer computer = new Computer();
	@Override
	public void BuildCPU() {
		 computer.Add("��װCPU");
		
	}

	@Override
	public void BuildMainboard() {
		computer.Add("��װ����");
		
	}

	@Override
	public void BuildHD() {
		computer.Add("��װӲ��");
		
	}

	@Override
	public Computer GetComputer() {

		return computer;
	}
    
}

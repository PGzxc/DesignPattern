package com.design.builder;

public class Director{
    //ָ��װ����Ա��װ����
    public void Construct(Builder builder)
    {
             builder. BuildCPU();
             builder.BuildMainboard();
             builder.BuildHD();
    }
}
package com.lara3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable
{
	private String name;
	private int age;
	private Double weight;
	
	public Employee()
	{
		
	}
	public Employee(String name, 
					int age, 
					Double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String toString()
	{
		return name + ":" + age + ":" + weight;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) 
	throws IOException
	{
		out.writeUTF(name);
		//out.writeInt(age);
		out.writeObject(weight);
	}	
	@Override
	public void readExternal(ObjectInput in) 
	throws IOException,
			ClassNotFoundException
	{
		name = in.readUTF();
		//age = in.readInt();
		weight = (Double)in.readObject();
	}
}

package com.IOtask2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FabiRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fi=new FileInputStream("Fabi.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		fabinooci f=(fabinooci)oi.readObject();
		f.task1();
		}
		catch (Exception f) {
			// TODO: handle exception
			f.printStackTrace();
		}

	}

}

package com.IOtask2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FabiStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		fabinooci f=new fabinooci(0);
		// f.task1();
		FileOutputStream fo=new FileOutputStream("Fabi.ser");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(f);
		}
		catch (Exception f) {
			// TODO: handle exception
			f.printStackTrace();
		}
	}

}

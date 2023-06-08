package com.hdy.utils;

import java.io.IOException; 
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;


/**
 * @author Hone too young
 * @email 645680833@qq.com
 * @CreateDate 2023/6/8 16:25
 * 	 定义对象输入流
 */
public class MyObjectInputStream extends ObjectInputStream{

	public MyObjectInputStream(InputStream in) throws IOException {
		super(in);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void readStreamHeader() throws IOException, StreamCorruptedException {
		// TODO Auto-generated method stub

	}


}

package cn.edu.zju.cst.examples.thrift;

import org.apache.thrift.TException;

import cn.edu.zju.cst.examples.thrift.Hello.Iface;

public class HelloServiceImpl implements Iface {

	@Override
	public String helloString(String para) throws TException {
		return para;
	}

	@Override
	public int helloInt(int para) throws TException {
		return para;
	}

	@Override
	public boolean helloBoolean(boolean para) throws TException {
		return para;
	}

	@Override
	public void helloVoid() throws TException {
		System.out.println("Hello, Thrift");

	}

	@Override
	public String helloNull() throws TException {
		return null;
	}

}

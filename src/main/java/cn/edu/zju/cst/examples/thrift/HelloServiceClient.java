package cn.edu.zju.cst.examples.thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * 创建客户端实现代码，调用 Hello.client 访问服务端的逻辑实现
 * @author caoyaochong
 *
 */
public class HelloServiceClient {

	public static void main(String[] args) {
		
		// 设置调用的服务地址为本地，端口为 7911 
		 TTransport transport = new TSocket("localhost", 7911);
		 try {
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			Hello.Client client = new Hello.Client(protocol);
			// 调用服务的 helloVoid 方法
			try {
				client.helloVoid();
			} catch (TException e) {
				e.printStackTrace();
			}
			 transport.close();
		} catch (TTransportException e) {
			e.printStackTrace();
		} 
		// 设置传输协议为 TBinaryProtocol 

	}

}

/**
 * @author Shao
 * A simple Web Server Demo named MyTomcat
 */

import java.lang.*;
import java.net.*;
import java.io.*;

public class MyBrowser{
	public static void main(String args[]){
		try {
			@SuppressWarnings("resource")
			Socket mysocket = new Socket("127.0.0.1",8000);
 			OutputStream output = mysocket.getOutputStream();
			OutputStreamWriter outputstream = new OutputStreamWriter(output);
			PrintWriter writer = new PrintWriter(outputstream,true);
			
			writer.println("GET /demo.html Http/1.1");
			writer.println("Accept: */*");
			writer.println("Accept-Language:zh-CN");
			writer.println("User-Agent: ���������������");
			writer.println("Accept-Encoding:gzip,deflate");
			writer.println("host:127.0.0.1:8000");
			writer.println("Connection:Keep-Alive");

			//һ�����н������Խ��ջش�����Ϣ
			writer.println("");			
			

			//������ϢΪ����MyTomcat�ش���������Ϣ
			InputStream input = mysocket.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(input);
			BufferedReader buffer = new BufferedReader(inputReader);
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
			System.out.println(buffer.readLine());
		}catch(Exception e){}
	}
}
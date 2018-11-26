/**
 * @author Shao
 * A simple Web Server Demo named MyTomcat
 */

import java.lang.*;
import java.net.*;
import java.io.*;

public class MyTomcat {
	public static void main(String args[]){
		try {
			//@SuppressWarnings("resource")
			ServerSocket socket_webserver = new ServerSocket(8000);
			System.out.println("MyTomcat服务器已启动！");
			Socket socket = socket_webserver.accept();
			
			InputStream stream = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);
			
			System.out.println(buffer.readLine());		

			//以下信息将会在控制台输出
			

		}catch(Exception e){}
	}
}
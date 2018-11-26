package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadDocument {
	public static void main(String args[]) throws Exception{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		//查询所有鲜花名称
		NodeList list = doc.getElementsByTagName("name");
		for(int i=0;i<list.getLength();i++){
			Node node = list.item(i);			
			System.out.println(node.getTextContent());
		}
	}
}
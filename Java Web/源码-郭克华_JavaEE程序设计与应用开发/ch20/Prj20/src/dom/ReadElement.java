package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadElement {
	public static void main(String args[]) throws Exception{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		//查询所有鲜花
		NodeList list = doc.getElementsByTagName("flower");
		for(int i=0;i<list.getLength();i++){
			Element flower = (Element)list.item(i);			
			Node priceNode = flower.getElementsByTagName("price").item(0);
			String strPrice = priceNode.getTextContent();
			double price = Double.parseDouble(strPrice);
			if(price>10){
				String id = flower.getAttribute("id");
				Node nameNode = flower.getElementsByTagName("name").item(0);
				String name = nameNode.getTextContent();
				System.out.println("id:" + id);
				System.out.println("name:" + name);
				System.out.println("price:" + price);	
				System.out.println("----------------");
			}			
		}
	}
}
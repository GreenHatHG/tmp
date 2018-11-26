package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadNode {
	public static void main(String args[]) throws Exception{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		//获取文档中的第一个子节点(即根节点)
		Node root = doc.getFirstChild();
		//打印节点名称
		System.out.println("根节点名称为：" + root.getNodeName());
		//打印节点类型
		System.out.println("根节点类型为：" + root.getNodeType());
		//显示所有子节点
		NodeList list = root.getChildNodes();
		for(int i=0;i<list.getLength();i++){
			Node node = list.item(i);
			if(!(node.getNodeType()==Node.TEXT_NODE&&
					node.getTextContent().trim().length()==0)){
				System.out.println(node.getNodeName());
			}
		}
	}
}
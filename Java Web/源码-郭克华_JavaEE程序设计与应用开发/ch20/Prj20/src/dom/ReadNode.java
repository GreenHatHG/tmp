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
		//��ȡ�ĵ��еĵ�һ���ӽڵ�(�����ڵ�)
		Node root = doc.getFirstChild();
		//��ӡ�ڵ�����
		System.out.println("���ڵ�����Ϊ��" + root.getNodeName());
		//��ӡ�ڵ�����
		System.out.println("���ڵ�����Ϊ��" + root.getNodeType());
		//��ʾ�����ӽڵ�
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
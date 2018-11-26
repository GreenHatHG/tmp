package dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class WriteElement {
	public static void main(String args[]) throws Exception{
		//�����ļ�
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		//��ѯ����flower
		NodeList list = doc.getElementsByTagName("flower");
		for(int i=0;i<list.getLength();i++){
			Element flowerElement = (Element)list.item(i);	
			//��ȡid����
			String id = flowerElement.getAttribute("id");
			//ɾ��id����
			flowerElement.removeAttribute("id");
			//���"���"����,ֵΪԭ�ȵ�id����ֵ
			flowerElement.setAttribute("���", id);			
		}
		//����һ����Ԫ��
		Element newFlower = doc.createElement("flower");
		newFlower.setAttribute("���", "4");
		Element newName = doc.createElement("name");
		newName.setTextContent("����ܰ");
		newFlower.appendChild(newName);
		Element newPrice = doc.createElement("price");
		newPrice.setTextContent("23");
		newFlower.appendChild(newPrice);	
		//�õ����ڵ�
		Element root = doc.getDocumentElement();
		//�ڸ��ڵ������newFlower
		root.appendChild(newFlower);
		//�������ļ�
	    TransformerFactory tf =TransformerFactory.newInstance();
  		Transformer transformer = tf.newTransformer();
  		transformer.setOutputProperty("encoding","gb2312");
  		DOMSource source = new DOMSource(doc);
  		File file = new File("newFlowers.xml");
  		StreamResult result = new StreamResult(file);
  		transformer.transform(source, result);
	}
}
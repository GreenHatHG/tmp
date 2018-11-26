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
		//载入文件
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		//查询所有flower
		NodeList list = doc.getElementsByTagName("flower");
		for(int i=0;i<list.getLength();i++){
			Element flowerElement = (Element)list.item(i);	
			//获取id属性
			String id = flowerElement.getAttribute("id");
			//删除id属性
			flowerElement.removeAttribute("id");
			//添加"编号"属性,值为原先的id属性值
			flowerElement.setAttribute("编号", id);			
		}
		//创建一个新元素
		Element newFlower = doc.createElement("flower");
		newFlower.setAttribute("编号", "4");
		Element newName = doc.createElement("name");
		newName.setTextContent("康乃馨");
		newFlower.appendChild(newName);
		Element newPrice = doc.createElement("price");
		newPrice.setTextContent("23");
		newFlower.appendChild(newPrice);	
		//得到根节点
		Element root = doc.getDocumentElement();
		//在根节点中添加newFlower
		root.appendChild(newFlower);
		//保存入文件
	    TransformerFactory tf =TransformerFactory.newInstance();
  		Transformer transformer = tf.newTransformer();
  		transformer.setOutputProperty("encoding","gb2312");
  		DOMSource source = new DOMSource(doc);
  		File file = new File("newFlowers.xml");
  		StreamResult result = new StreamResult(file);
  		transformer.transform(source, result);
	}
}
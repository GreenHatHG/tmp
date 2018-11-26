package dom;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class WriteNode {
	public static void main(String args[]) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		// 查询所有价格
		NodeList list = doc.getElementsByTagName("price");
		ArrayList arrayList = new ArrayList();
		Node flowers = null;
		for (int i = 0; i < list.getLength(); i++) {
			Node priceNode = list.item(i);
			String strPrice = priceNode.getTextContent();
			double price = Double.parseDouble(strPrice);
			// 获取该价格的父节点(flower)
			Node flower = priceNode.getParentNode();
			// 获取flower的父节点(flowers)
			flowers = flower.getParentNode();
			if (price > 15) {
				arrayList.add(flower);
			} else {
				// 修改价格
				String newPrice = String.valueOf(price - 5);
				priceNode.setTextContent(newPrice);
			}
		}
		for (int j = 0; j < arrayList.size(); j++) {
			Node flower = (Node) arrayList.get(j);
			// 从flowers中删除flower
			flowers.removeChild(flower);
		}
		// 保存入文件
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty("encoding", "gb2312");
		DOMSource source = new DOMSource(doc);
		File file = new File("newFlowers.xml");
		StreamResult result = new StreamResult(file);
		transformer.transform(source, result);
	}
}
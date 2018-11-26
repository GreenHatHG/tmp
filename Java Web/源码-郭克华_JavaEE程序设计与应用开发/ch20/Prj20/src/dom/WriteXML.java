package dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class WriteXML{
	public static void main(String args[]) throws Exception{
		//载入文件
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("flowers.xml");
		//保存文件
	    TransformerFactory tf =TransformerFactory.newInstance();
  		Transformer transformer = tf.newTransformer();
  		transformer.setOutputProperty("encoding","gb2312");
  		DOMSource source = new DOMSource(doc);
  		File file = new File("newFlowers.xml");
  		StreamResult result = new StreamResult(file);
  		transformer.transform(source, result);
  		System.out.println("保存成功");
		}
	}
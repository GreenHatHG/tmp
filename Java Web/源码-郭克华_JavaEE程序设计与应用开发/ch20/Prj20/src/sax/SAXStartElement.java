package sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXStartElement {
	public static void main(String[] args) throws Exception{
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser saxParser=spf.newSAXParser();	
		saxParser.parse("flowers.xml",new SAXParse2());
	}
}

class SAXParse2 extends DefaultHandler{
	public void startElement(String uri, String localName,String qName, Attributes atts) throws SAXException{
		System.out.print("发现元素,标签名称为"  + qName + "		");
		for(int i=0;i<atts.getLength();i++){
			String attName = atts.getQName(i);
			String attValue = atts.getValue(attName);
		    System.out.print(attName + "=" + attValue + "	");	
		}
		System.out.println();
	}
}

package sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXStartDocument {
	public static void main(String[] args) throws Exception{
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser saxParser=spf.newSAXParser();	
		saxParser.parse("flowers.xml",new SAXParse1());
	}
}
class SAXParse1 extends DefaultHandler{
	public void startDocument() throws SAXException {
		System.out.println("开始解析xml文件");
	}
}


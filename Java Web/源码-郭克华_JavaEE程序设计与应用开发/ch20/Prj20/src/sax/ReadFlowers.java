package sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadFlowers {
	public static void main(String[] args) throws Exception{
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser saxParser=spf.newSAXParser();	
		saxParser.parse("flowers.xml",new SAXParseFlower());
	}
}

class SAXParseFlower extends DefaultHandler{
	public void startDocument() throws SAXException {
		System.out.println("<?xml version='1.0' encoding='gb2312'?>");
	}
	public void startElement(String namespaceURI, String localName,String qName, Attributes atts) throws SAXException{
		System.out.print("<"  + qName);
		for(int i=0;i<atts.getLength();i++){
			String attName = atts.getQName(i);
			String attValue = atts.getValue(attName);
			System.out.print(" " + attName + "='" + attValue + "'");	
		}
		System.out.print(">");
	}
	public void endElement(String namespaceURI,String localName,String qName) throws SAXException{
		System.out.print("</"  + qName + ">");
	}
	public void characters(char[] ch,int start,int length){
		System.out.print(new String(ch,start,length).trim());
	}
}

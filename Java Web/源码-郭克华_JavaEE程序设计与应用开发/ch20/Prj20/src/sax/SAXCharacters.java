package sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

public class SAXCharacters {
	public static void main(String[] args) throws Exception{
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser saxParser=spf.newSAXParser();	
		saxParser.parse("flowers.xml",new SAXParse3());
	}
}
class SAXParse3 extends DefaultHandler{
	public void characters(char[] ch,int start,int length){
		String data = new String(ch,start,length).trim();
		if(data.length()!=0){
			System.out.println("发现一个字符串:" + data);			
		}
	}
}

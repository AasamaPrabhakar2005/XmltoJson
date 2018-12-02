package com.RestFull.XmlToJson;

import java.io.StringReader;
//j  a  v a 2 s.  co  m
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLStrip {
public static void main(String[] argv) throws Exception {
  InputSource is = new InputSource();
  is.setCharacterStream(new StringReader(xmlRecords));
  
  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
  DocumentBuilder db = dbf.newDocumentBuilder();
  
  Document doc = db.parse(is);
  
  
  XPath xpath = XPathFactory.newInstance().newXPath();
  XPathExpression expr = xpath.compile("/data/text()");
  Object o = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList list = (NodeList) o;
  System.out.println(list.item(0).getFirstChild().getNodeValue());
  /*NodeList list = doc.getChildNodes();
  System.out.println(list.item));
  for (int i = 0; i < list.getLength(); i++) {
    if (list.item(i) instanceof Element) {
      Element root = (Element) list.item(i);
      System.out.println(root.getNodeName());
      break;
    }
  }*/
}
static String xmlRecords = 
    "<data>" +
    "  <employee>" +
    "    <name>Tom</name>"+ 
    "    <title>Manager</title>" +
    "  </employee>" +
    "  <employee>" +
    "    <name>Jerry</name>"+ 
    "    <title>Programmer</title>" +
    "  </employee>" +
    "</data>";
}
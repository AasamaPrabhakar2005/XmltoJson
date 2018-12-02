package com.RestFull.XmlToJson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "classify_server")
public class Classify_server {
	@JacksonXmlProperty(localName="xmlns", isAttribute = true)
	String xmlns;
	@JacksonXmlElementWrapper(localName = "classes", useWrapping = true)
	Classes classes;
public Classify_server(){
		
	}
public Classify_server(String xmlns,Classes classes){
this.xmlns=xmlns;	
this.classes=classes;
}
public Classes getClasses() {
	return classes;
}
public void setClasses(Classes classes) {
	this.classes = classes;
}
public String getXmlns() {
	return xmlns;
}
public void setXmlns(String xmlns) {
	this.xmlns = xmlns;
}
@Override public String toString() {
    return "Classify_server{" +
            "classify_server=" + classes.toString()+
            '}';
}
}

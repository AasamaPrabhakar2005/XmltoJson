package com.RestFull.XmlToJson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "author")
public class Author {
	public Author(){
		
	}
public Author(String name){
	this.name=name;
		
	}
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}

package com.RestFull.XmlToJson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "content")
public class Content {
	@JacksonXmlElementWrapper(localName = "classify_server", useWrapping = false)
	private Classify_server classify_server;
	@JacksonXmlProperty(localName="type", isAttribute = true)
	String type;

public Content(){
		
	}
public Content(Classify_server classify_server, String type){
	 this.classify_server=classify_server;
	 this.type=type;
}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public Classify_server getClassify_server() {
		return classify_server;
	}

	public void setClassify_server(Classify_server classify_server) {
		this.classify_server = classify_server;
	}
	@Override public String toString() {
	    return "Content{" +
	            "content=" + classify_server.toString() + ","+ type+
	            '}';
	}
}

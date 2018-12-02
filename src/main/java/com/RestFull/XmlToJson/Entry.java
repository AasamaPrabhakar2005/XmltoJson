package com.RestFull.XmlToJson;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "entry")
public class Entry {
	public Entry(){
		
	}
	@JacksonXmlElementWrapper(localName = "id", useWrapping = true)
	String id;
	@JacksonXmlElementWrapper(localName = "title", useWrapping = true)
	String title;
	@JacksonXmlElementWrapper(localName = "updated", useWrapping = true)
	String updated;
	@JacksonXmlElementWrapper(localName = "author", useWrapping = true)
	Author author;  
	@JacksonXmlElementWrapper(localName = "content", useWrapping = true)
	Content content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	@Override public String toString() {
	    return "Entry{" +
	            "entry=" + id.toString() +","+ 
	    		author.toString() + ","+
	            content.toString()+","+
	    		title.toString()+","+updated.toString()+
	            '}';
	}
}

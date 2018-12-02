package com.RestFull.XmlToJson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Note {
		String to;
		String from;
		String heading;
		String body;	
		String cc;
		@JacksonXmlProperty(localName="author", isAttribute = true)
		String author;
		@JacksonXmlProperty(localName="sname", isAttribute = true)
		String sname;
	public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
	public String getCc() {
			return cc;
		}
		public void setCc(String cc) {
			this.cc = cc;
		}
	public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}

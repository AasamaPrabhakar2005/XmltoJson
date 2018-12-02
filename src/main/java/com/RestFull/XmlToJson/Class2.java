package com.RestFull.XmlToJson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Class2 {
	@JacksonXmlProperty(localName="absolutescore", isAttribute = true)
	String absolutescore;
	//String classEvidence;
	@JacksonXmlProperty(localName="classid", isAttribute = true)
	String classid;
	@JacksonXmlProperty(localName="classname", isAttribute = true)
	String classname;
	@JacksonXmlProperty(localName="confidencescore", isAttribute = true)
	String confidencescore;
	@JacksonXmlProperty(localName="scoreln", isAttribute = true)
	String scoreln;
	public String getAbsolutescore() {
		return absolutescore;
	}
	public void setAbsolutescore(String absolutescore) {
		this.absolutescore = absolutescore;
	}
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getConfidencescore() {
		return confidencescore;
	}
	public void setConfidencescore(String confidencescore) {
		this.confidencescore = confidencescore;
	}
	public String getScoreln() {
		return scoreln;
	}
	public void setScoreln(String scoreln) {
		this.scoreln = scoreln;
	}
	
}

package com.RestFull.XmlToJson;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "notes")
public class Notes{
	@JacksonXmlElementWrapper(localName = "note", useWrapping = false)
private Note[] note;
	@JacksonXmlProperty(localName="for2", isAttribute = true)
	String for2;
public String getFor2() {
		return for2;
	}
	public void setFor2(String for2) {
		this.for2 = for2;
	}
public Note[] getNote() {
	return note;
}
public void setNote(Note[] note) {
	this.note = note;
}
public Notes(Note[]  note) {
    this.note = note;
}
public Notes(){
	
}
@Override public String toString() {
    return "Notes{" +
            "notes=" + Arrays.toString(note)+
            '}';
}
}

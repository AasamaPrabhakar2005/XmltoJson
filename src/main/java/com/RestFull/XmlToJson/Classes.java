package com.RestFull.XmlToJson;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "classes")
public class Classes {
@JacksonXmlElementWrapper(localName = "class2", useWrapping = false)
private Class2[] class2;
@JacksonXmlProperty(localName="monk", isAttribute = true)
String monk;
public Classes(){
	
}
public Classes(Class2[]  class2) {
    this.class2 = class2;
}
public Class2[] getClass2() {
	return class2;
}
public void setClass2(Class2[] class2) {
	this.class2 = class2;
}
public String getMonk() {
	return monk;
}
public void setMonk(String monk) {
	this.monk = monk;
}
@Override public String toString() {
    return "Classes{" +
            "classes=" + Arrays.toString(class2) +
            '}';
}
}

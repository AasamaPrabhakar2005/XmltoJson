package com.RestFull.XmlToJson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ReadXml {
 
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String xml="<notes>"+
				"<note author=\\\"mohan\\\">\n" + 
				"<to>Tove</to>\n" + 
				"<from>Jani</from>\n" + 
				"<heading>Reminder</heading>\n" + 
				"<body>Don't forget me this weekend!</body>\n" + 
				"</note>" +
				"<note author=\"sohan\">\n" + 
				"<to>Tove2</to>\n" + 
				"<from>Jani2</from>\n" + 
				"<heading>Reminder2</heading>\n" + 
				"<body>Don't forget me this weekend!2</body>\n" + 
				"</note>" +
				"<note author=\"ram\">\n" + 
				"<to>Tove3</to>\n" + 
				"<from>Jani3</from>\n" + 
				"<heading>Reminder3</heading>\n" + 
				"<body>Don't forget me this weekend!3</body>\n" + 
				"</note>" +
				"</notes>";
		XmlMapper xmlMapper = new XmlMapper();
		Notes note = xmlMapper.readValue(xml, Notes.class);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(note);
		System.out.println(json);

}
}
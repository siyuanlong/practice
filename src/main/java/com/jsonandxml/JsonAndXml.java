package com.jsonandxml;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.xml.util.PrettyXMLEventWriter;
import net.sf.json.xml.XMLSerializer;
import org.junit.Test;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class JsonAndXml {

    @Test
    public void Json2Xml() {
        //创建XMLSerializer对象
        XMLSerializer serializer = new XMLSerializer();

        String xmlStr = "<student><id>2122</id><name>named</name></student>";

        String s = serializer.read(xmlStr).toString();

        System.out.println(s);

    }

    @Test
    public void Json2Xml2() throws IOException {
        String json = "{\"student\":{\"name\":\"cherry\",\"id\":1,\"age\":666,\"desc\":{\"state\":777,"
                + "\"items\":{\"isTure\":\"ture\"}}}}";

        StringReader input = new StringReader(json);
        StringWriter output = new StringWriter();
        JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
        try {
            XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
            XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
            writer = new PrettyXMLEventWriter(writer);
            writer.add(reader);
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (output.toString().length() >= 38) {// remove <?xml version="1.0" encoding="UTF-8"?>
            System.out.println(output.toString().substring(39));
            System.out.println(output.toString().substring(39));
        }
        System.out.println(output.toString());

    }
}

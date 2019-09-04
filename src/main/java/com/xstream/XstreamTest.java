package com.xstream;

import com.domain.Cars;
import com.domain.User;
import com.thoughtworks.xstream.XStream;
import org.junit.Test;

import java.util.ArrayList;

public class XstreamTest {

    @Test
    public void test01(){
        Cars cars01 = new Cars();
        cars01.setName("luhu");
        cars01.setColor("red");
        cars01.setPrice("1000");

        Cars cars02 = new Cars();
        cars02.setName("luhu");
        cars02.setColor("red");
        cars02.setPrice("1000");

        ArrayList<Cars> list = new ArrayList();
        list.add(cars01);
        list.add(cars02);

        User user = new User();
        user.setUsername("小明");
        user.setPassword("123456");
        user.setCarsList(list);

        XStream stream = new XStream();
        //将需要的类注解激活
        stream.processAnnotations(User.class);
        stream.processAnnotations(Cars.class);
        /*stream.alias("users",User.class);
        stream.alias("car",Cars.class);*/
        String xml = stream.toXML(user);
        System.out.println(xml);

    }
}

/**
 * XmlToJson Test.java
 * 
 * File Created at 2014年4月14日 下午8:24:37
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.taobao.serial.SimplePropertyFilter;

/**
 *
 * @create 2014年4月14日 下午8:24:37
 * @author cunhan.fch
 * @version
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
      Lable layout=new Lable();
      AllStyle fs=new AllStyle();
      fs.setAlign(5);
      fs.setLines(3);
      fs.setWidth(80);
      fs.setHeight(100);
      fs.setFontSize(300);
      fs.setBackgroundColor("#FFFFFF");
      layout.setStyleBinding(fs);
      
   
    SerializeWriter sw=new SerializeWriter();
    JSONSerializer serialize=new JSONSerializer(sw);
    serialize.getPropertyFilters().add(new SimplePropertyFilter());
    serialize.write(layout);
    
       System.out.println(sw.toString());
    }

}

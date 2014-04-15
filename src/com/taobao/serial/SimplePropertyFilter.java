/**
 * XmlToJson SimplePropertyFilter.java
 * 
 * File Created at 2014年4月15日 上午10:26:01
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao.serial;

import com.alibaba.fastjson.serializer.PropertyFilter;
import com.taobao.Data;
import com.taobao.Style;

/**
 *
 * @create 2014年4月15日 上午10:26:01
 * @author cunhan.fch
 * @version
 */
public class SimplePropertyFilter implements PropertyFilter {

    /* (non-Javadoc)
     * @see com.alibaba.fastjson.serializer.PropertyFilter#apply(java.lang.Object, java.lang.String, java.lang.Object)
     */
    @Override
    public boolean apply(Object source, String name, Object value) {
        if(source instanceof Style){
            if(value instanceof Number){
                Number number=(Number)value;
                if(number.intValue()==0){
                    return false;
                }
               // System.out.println(source+":"+name+":"+": value:"+number.intValue()+":"+(number.intValue()==0));
            }
        }else if(source instanceof Data){
            if(null==value){
                return false;
            }
        }
        return true;
    }

}

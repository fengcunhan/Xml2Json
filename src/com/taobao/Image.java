/**
 * XmlToJson Image.java
 * 
 * File Created at 2014年4月14日 下午8:22:19
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao;

/**
 *
 * @create 2014年4月14日 下午8:22:19
 * @author cunhan.fch
 * @version
 */
public class Image extends View {
    
    protected ViewType type = ViewType.image;

    /**
     * @return the type
     */
    public ViewType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ViewType type) {
        this.type = type;
    }
   
}

/**
 * XmlToJson Data.java
 * 
 * File Created at 2014年4月15日 上午11:29:35
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao;

import java.util.Map;

/**
 *
 * @create 2014年4月15日 上午11:29:35
 * @author cunhan.fch
 * @version
 */
public class Data extends TaobaoObject {

    /**
     * 
     */
    private static final long serialVersionUID = -7644827089383206566L;
    
    private String value;
    private String url;
    
    private String apiName;
    private boolean needLogin;
    private Map<String,String> param;
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
}

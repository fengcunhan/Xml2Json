/**
 * XmlToJson View.java
 * 
 * File Created at 2014年4月14日 下午7:33:59
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * @create 2014年4月14日 下午7:33:59
 * @author cunhan.fch
 * @version
 */
public class View extends TaobaoObject {
    @JSONField(name="styleBinding")
    private AllStyle styleBinding;
    
    protected ViewType type=ViewType.view;
    
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

    @JSONField(name="dataBinding")
    private Data dataBinding;

    /**
     * @return the styleBinding
     */
    public AllStyle getStyleBinding() {
        return styleBinding;
    }

    /**
     * @param styleBinding the styleBinding to set
     */
    public void setStyleBinding(AllStyle styleBinding) {
        this.styleBinding = styleBinding;
    }

    /**
     * @return the dataBinding
     */
    public Data getDataBinding() {
        return dataBinding;
    }

    /**
     * @param dataBinding the dataBinding to set
     */
    public void setDataBinding(Data dataBinding) {
        this.dataBinding = dataBinding;
    }
    
   
    
}

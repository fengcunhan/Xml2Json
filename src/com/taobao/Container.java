/**
 * XmlToJson Container.java
 * 
 * File Created at 2014年4月15日 上午10:20:13
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * @create 2014年4月15日 上午10:20:13
 * @author cunhan.fch
 * @version
 */
public class Container extends View {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @JSONField(name="subViews")
    private List<View> subViews=new ArrayList<View>();

    public void addView(View view){
        subViews.add(view);
    }
    public void removeView(View view){
        subViews.remove(view);
    }
    
    public List<View> getSubViews(){
        return subViews;
    }
    public Container(){
        type=ViewType.container;
    }
}

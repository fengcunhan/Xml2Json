/**
 * XmlToJson AllStyle.java
 * 
 * File Created at 2014年4月15日 上午11:25:10
 * $Id$
 * 
 * Copyright 2013 Taobao.com Croporation Limited.
 * All rights reserved.
 */
package com.taobao;

/**
 * @create 2014年4月15日 上午11:25:10
 * @author cunhan.fch
 * @version
 */
public class AllStyle extends BasicStyle {
    /**
     * 
     */
    private static final long serialVersionUID = 8379467635087251723L;
    private String orientation;
    private int    gravity;
    private String textColor;
    private int    fontSize;
    private int    fontWeight;
    private int    fontStyle;
    private int    lines;
    private int    scroll;
    private boolean isCircle;
    
    private String layout;
    
    private int fontWight;
    
    /**
     * @return the fontWight
     */
    public int getFontWight() {
        return fontWight;
    }

    /**
     * @param fontWight the fontWight to set
     */
    public void setFontWight(int fontWight) {
        this.fontWight = fontWight;
    }

    /**
     * @return the layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     * @param layout the layout to set
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    /**
     * @return the scroll
     */
    public int getScroll() {
        return scroll;
    }

    /**
     * @param scroll the scroll to set
     */
    public void setScroll(int scroll) {
        this.scroll = scroll;
    }

   

    /**
     * @return the isCircle
     */
    public boolean isCircle() {
        return isCircle;
    }

    /**
     * @param isCircle the isCircle to set
     */
    public void setCircle(boolean isCircle) {
        this.isCircle = isCircle;
    }

    /**
     * @return the gravity
     */
    public int getGravity() {
        return gravity;
    }

    /**
     * @param gravity the gravity to set
     */
    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    /**
     * @return the textColor
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * @param textColor the textColor to set
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * @return the fontSize
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @return the fontWeight
     */
    public int getFontWeight() {
        return fontWeight;
    }

    /**
     * @param fontWeight the fontWeight to set
     */
    public void setFontWeight(int fontWeight) {
        this.fontWeight = fontWeight;
    }

    /**
     * @return the fontStyle
     */
    public int getFontStyle() {
        return fontStyle;
    }

    /**
     * @param fontStyle the fontStyle to set
     */
    public void setFontStyle(int fontStyle) {
        this.fontStyle = fontStyle;
    }

    /**
     * @return the lines
     */
    public int getLines() {
        return lines;
    }

    /**
     * @param lines the lines to set
     */
    public void setLines(int lines) {
        this.lines = lines;
    }

    /**
     * @return the orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * @param orientation the orientation to set
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

}

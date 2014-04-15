package com.taobao.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.taobao.AllStyle;
import com.taobao.Button;
import com.taobao.Container;
import com.taobao.Data;
import com.taobao.Image;
import com.taobao.Lable;
import com.taobao.LinearLayout;
import com.taobao.ListView;
import com.taobao.TextField;
import com.taobao.View;
import com.taobao.WebView;
import com.taobao.serial.SimplePropertyFilter;

public class DOMParser {
    private static View view;
    public static void main(String[] args) throws ParserConfigurationException, SAXException,
            IOException {
        // step 1:获得dom解析器工厂（工厂的作用时用于创建具体的解析器）
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // step 2:获得具体的dom解析器
        DocumentBuilder db = dbf.newDocumentBuilder();
        // step 3:解析一个xml文档，获得Document对象（根节点）
        Document document = db.parse(new File(".\\source\\fragment_1.xml"));
        // 以上三步为固定模式

        //获取根元素节点

        Element root = document.getDocumentElement();
        parseElement(root,null);
        
        println(view);
    }
    public static void setView(View v){
        view=v;
    }
    public static void setData(Data data){
        data=new Data();
        data.setUrl("fjdlsajfkdsaklf");
    }

    //定义一个静态方法，通过调用该方法完成xml解析
    private static void parseElement(Element element,Container container) {
        
        String tagName = element.getNodeName();
        View currentView=null;
        AllStyle style=new AllStyle();
        Data data=new Data();
        if(tagName.equals("TextView")){
          currentView=new Lable();
        }else if(tagName.equals("ImageView")){
            currentView=new Image();
        }else if(tagName.equals("LinearLayout")){
            currentView=new LinearLayout();
            style.setLayout("linearLayout");
        }else if(tagName.equals("Button")){
        	currentView = new Button();
        }else if(tagName.equals("EditText")){
        	currentView = new TextField();
        }else if(tagName.equals("WebView")){
        	currentView = new WebView();
        }else if(tagName.equals("ListView")){
        	currentView = new ListView();
        }else {
            currentView=new View();
        }
        
       
        
        currentView.setStyleBinding(style);
        currentView.setDataBinding(data);
        
        NodeList children = element.getChildNodes();

        //System.out.print("<" + tagName);

        // element元素的所有属性所构成的NamedNodeMap对象，需要对其进行判断
        NamedNodeMap map = element.getAttributes();
        // 如果该元素存在属性
        if (null != map) {
            for (int i = 0; i < map.getLength(); i++) {
                // 获得该元素的每一个属性
                Attr attr = (Attr) map.item(i);
                String attrName = attr.getName();
                String attrValue = attr.getValue();
               // System.out.print(" " + attrName + "=\"" + attrValue + "\"");
                if(attrName.equals("android:layout_height")){
                    if(attrValue.equals("match_parent")||attrValue.equals("fill_parent")){
                        style.setHeight(-1);
                    }else{
                        style.setHeight(-2);
                    }
                }else  if(attrName.equals("android:layout_width")){
                    if(attrValue.equals("match_parent")||attrValue.equals("fill_parent")){
                        style.setWidth(-1);
                    }else{
                        style.setWidth(-2);
                    }
                } else  if(attrName.equals("android:background")){
                   style.setBackgroundColor(attrValue);
                } else  if(attrName.equals("android:orientation")){
                    style.setOrientation(attrValue);
                } else if(attrName.equals("android:text")){
                   data.setValue(attrValue);
                } else if(attrName.equals("android:src")){
                    data.setUrl("http://gtms02.alicdn.com/tps/i2/T14LNLFxxlXXaeHbsb-100-100.png");
                }
            }
        }
        if(null==container){
            container=(LinearLayout)currentView;
        }else{
            
            container.addView(currentView);
        }
        
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            // 获得结点的类型
            short nodeType = node.getNodeType();
            if (nodeType == Node.ELEMENT_NODE) {
                // 是元素，继续递归
                Container con=(Container)currentView;
                parseElement((Element) node,con);
            } else if (nodeType == Node.TEXT_NODE) {
                // 递归出口
                //System.out.print(node.getNodeValue());
            } else if (nodeType == Node.COMMENT_NODE) {
                System.out.print("<!--");
                Comment comment = (Comment) node;
                // 注释内容
                String cmData = comment.getData();
                System.out.print(cmData);
                System.out.print("-->");
            }
        }
       // System.out.print("</" + tagName + ">");
        //println(container);
        setView(container);
    }
    
    public static void println(Object obj){
        SerializeWriter sw=new SerializeWriter();
        JSONSerializer serialize=new JSONSerializer(sw);
        serialize.getPropertyFilters().add(new SimplePropertyFilter());
        serialize.write(obj);
        System.out.println(serialize.toString());
    }
}

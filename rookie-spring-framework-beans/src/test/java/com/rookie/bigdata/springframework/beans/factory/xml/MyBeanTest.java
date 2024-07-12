package com.rookie.bigdata.springframework.beans.factory.xml;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.DefaultDocumentLoader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyBeanTest
 * @Description https://github.com/xuchengsheng/spring-reading
 * @Author rookie
 * @Date 2024/7/10 14:23
 * @Version 1.0
 */
@Slf4j
class MyBeanTest {

    @Test
    void getMessage() throws Exception{

        ClassLoader classLoader = MyBean.class.getClassLoader();


        //创建要加载的资源对象
        Resource resource=new ClassPathResource("sample.xml");

        //创建DocumentLoader实例
        DefaultDocumentLoader documentLoader=new DefaultDocumentLoader();

        //加载和解析XML文档
        Document document = documentLoader.loadDocument(new InputSource(resource.getInputStream()), null, null, 0, true);

        //打印xml文档内容
        printDetailedDocumentInfo(document);


    }

    /**
     * 打印详细的XML文档信息，包括元素、属性和文本内容。
     *
     * @param document 要打印的XML文档对象
     */
    private static void printDetailedDocumentInfo(Document document) {
        Element rootElement = document.getDocumentElement();
        printElementInfo(rootElement, "");
    }

    /**
     * 递归打印XML元素的详细信息，包括元素名称、属性和子节点。
     *
     * @param element 要打印的XML元素
     * @param indent  当前打印的缩进
     */
    private static void printElementInfo(Element element, String indent) {
        // 打印元素名称
        System.out.println(indent + "Element: " + element.getNodeName());

        // 打印元素的属性
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node attribute = attributes.item(i);
            System.out.println(indent + "  Attribute: " + attribute.getNodeName() + " = " + attribute.getNodeValue());
        }

        // 打印元素的子节点（可能是元素或文本）
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                // 如果子节点是元素，递归打印它
                printElementInfo((Element) childNode, indent + "  ");
            } else if (childNode.getNodeType() == Node.TEXT_NODE) {
                // 如果子节点是文本，打印文本内容
                System.out.println(indent + "  Text: " + childNode.getNodeValue().trim());
            }
        }
    }

    @Test
    void setMessage() {
    }
}

package org.mybatis.generator.api;

import java.util.Properties;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;

public abstract interface CommentGenerator
{
  public abstract void addConfigurationProperties(Properties paramProperties);

  public abstract void addFieldComment(Field paramField, IntrospectedTable paramIntrospectedTable, IntrospectedColumn paramIntrospectedColumn);

  public abstract void addFieldComment(Field paramField, IntrospectedTable paramIntrospectedTable);

  public abstract void addClassComment(InnerClass paramInnerClass, IntrospectedTable paramIntrospectedTable);

  public abstract void addClassComment(InnerClass paramInnerClass, IntrospectedTable paramIntrospectedTable, boolean paramBoolean);

  public abstract void addEnumComment(InnerEnum paramInnerEnum, IntrospectedTable paramIntrospectedTable);

  public abstract void addGetterComment(Method paramMethod, IntrospectedTable paramIntrospectedTable, IntrospectedColumn paramIntrospectedColumn);

  public abstract void addSetterComment(Method paramMethod, IntrospectedTable paramIntrospectedTable, IntrospectedColumn paramIntrospectedColumn);

  public abstract void addGeneralMethodComment(Method paramMethod, IntrospectedTable paramIntrospectedTable);

  public abstract void addJavaFileComment(CompilationUnit paramCompilationUnit);

  public abstract void addComment(XmlElement paramXmlElement);

  public abstract void addRootComment(XmlElement paramXmlElement);
}
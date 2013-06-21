<?xml version="1.0" ?>
<%@ page contentType="text/xml; charset=UTF-8"%>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-logic" prefix="logic" %>
<data>
    <logic:iterate id="userBean" name="_userManagerForm" property="users">
    <row>
        <id>
          <bean:write name="userBean" property="id"/>
        </id>
        <name>
          <bean:write name="userBean" property="name"/>
        </name>
        <age>
          <bean:write name="userBean" property="age"/>
        </age>
        <birth>
          <bean:write name="userBean" property="birth"/>
        </birth>
    </row>
    </logic:iterate>
</data>

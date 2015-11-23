<%@ include file="/html/init.jsp" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<h2>Add Student</h2>
<s:if test="hasActionMessages()">
   <div class="message">
      <s:actionmessage/>
   </div>
</s:if>
<s:if test="hasFieldErrors()">
   <div class="errors">
      <s:fielderror />
   </div>
</s:if>
<s:form action="adduserrecord">
      <s:textfield name="name" label="Student Name" value=""/>
      <s:textfield name="place" label="Student Place" value=""/>
      <s:textfield name="state" label="Student State" value=""/>
      <s:submit value="Add User" align="center"/>
</s:form>
<br/>
<s:if test="userList.size() > 0">
	<table cellpadding="25px" border="1" width="100%">
		<tr >
			<th>Name</th>
			<th>Place</th>
			<th>State</th>
		</tr>
		<s:iterator value="userList" status="userStatus">
			<tr>
				<td><s:property value="name" /></td>
				<td><s:property value="place" /></td>
				<td><s:property value="state" /></td>
			</tr>
		</s:iterator>
	</table>
</s:if>
<p><a href="<s:url action='index'/>">Home</a></p>

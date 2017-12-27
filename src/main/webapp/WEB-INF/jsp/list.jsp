<%-- Source project: sip03, branch: 01 (Maven Project) --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<title>Faktury</title>
	</head>
	
	<body style="font-family: Arial; font-size: smaller;">
  		<h3 align="center">Faktury</h3>
  		<form:form method="post" action="find" commandName="fakturaForm">
             <table>
                <tr>
                    <td><form:label path="fNumerFaktury" onkeyup="Wpisz nr faktury">Wpisz nr faktury</form:label></td>
                    <td><form:input path="fNumerFaktury"/></td>
                </tr>
                <tr>
                	<td><form:label path="" onkeyup="Wybierz operatora">Wpisz nr faktury</form:label></td>
                    <td><form:select path="">
                    	<form:option value="BRAK" label="Wybierz..."/>
                    	<form:options items="${operatorList}" />
                   	</form:select></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Szukaj"/></td>
                </tr>
              </table>
	  </form:form>
	  
	  <table style="border-collapse: collapse;" border="1" bordercolor="#006699" width="1000">
	   <tr bgcolor="lightblue">
	    <th>Nr faktury</th>
	   	<th>Operator</th>
	    <th>Matrix</th>
	    <th>Rodzaj wysylki</th>
	    <th>Data nadania</th>
	   </tr>
	   <c:if test="${empty SEARCH_PAKIET_RESULTS_KEY}">
	    <tr>
	     <td colspan="5">No Results found</td>
	    </tr>
	   </c:if>
	   <c:if test="${! empty SEARCH_PAKIET_RESULTS_KEY}">
	    <c:forEach var="faktury" items="${SEARCH_PAKIET_RESULTS_KEY}">
	     <tr>
	      <td width="125"><c:out value="${faktury.fNumerFaktury}"></c:out></td>
	      <td width="125"><c:out value="${faktury.pakiet.pOperator}"></c:out></td>
	      <td width="450"><c:out value="${faktury.pakiet.pMatrix}"></c:out></td>
	      <td width="175"><c:out value="${faktury.pakiet.pWysylka}"></c:out></td>
	      <td width="125"><c:out value="${faktury.pakiet.pDataNadania}"></c:out></td>	      
	     </tr>
	    </c:forEach>
	   </c:if>
	  </table>
	</body>
</html>

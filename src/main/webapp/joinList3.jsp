<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri = "http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JoinList3</title>
</head>
<body>
<div align="center"> 
	<h2>조인(Join) 정보 출력 3</h2>
	<hr> 
	
	<table border = "1" width = "700" cellspacing="0" cellpadding="0">
		<tr> 
			<td>ENO</td>
			<td>ENAME </td>
			<td>JOB</td>
			<td>MANAGER </td>
			<td>HIREDATE</td>
			<td>SALARY </td>
			<td>COMMISSION </td>
			<td>DNO </td>
			<td>DNAME </td>
			<td>LOC </td>	
			<td>RETIREDATE </td>	
			<td>STREET_ADDRESS </td>	
			<td>POST_CODE </td>	
			<td>CITY </td>	
			<td>STATE_PROVINCE </td>	
			<td>COUNTRY </td>	
		</tr>
		
		<!-- Loop 시작  -->
		<c:forEach items ="${joinList}" var="join">
		<tr> 
			<td> ${join.emp1.employee_id }</td>
			<td>${join.emp1.first_name } </td>
			<td> ${join.emp1.job_id }</td>
			<td>${join.emp1.manager_id } </td>
			<td> ${join.emp1.start_date }</td>
			<td> ${join.jobJ.end_date }</td>
			<td>${join.emp1.salary } </td>
			<td>${join.emp1.commission_pct } </td>
			<td>${join.dept1.department_id } </td>
			<td>${join.dept1.department_name } </td>		
			<td>${join.dept1.location_id} </td>		
			<td>${join.locJ.street_address} </td>	
			<td>${join.locJ.postal_code} </td>	
			<td>${join.locJ.city} </td>	
			<td>${join.locJ.state_province} </td>	
			<td>${join.locJ.country_id} </td>	
			
		</tr>
		</c:forEach>
	
	</table>

</div>
</body>
</html>
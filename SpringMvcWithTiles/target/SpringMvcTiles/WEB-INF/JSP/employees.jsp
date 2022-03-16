<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <body style="padding-left:30px">
      <h3 style="margin-top:0px">Add / Edit Employee</h3 >
      <form:form method="post" action="${pageContext.request.contextPath}/employee/add"  modelAttribute="employee">
        <div class="table-responsive">
          <table class="table table-bordered" style="width: 350px">
            <tr>
              <td>Id :</td>
              <td><form:input type="text" path="id" /></td>
            </tr>
            <tr>
              <td>Name :</td>
              <td><form:input type="text" path="name" /></td>
            </tr>
            <tr>
              <td>Department :</td>
              <td><form:input type="text" path="dept" /></td>
            </tr>
            <tr>
              <td>Age :</td>
              <td><form:input type="text" path="age" /></td>
            <tr>
              <td></td>
              <td><input class="btn btn-primary btn-sm" type="submit" value="Submit" /></td>
            </tr>
          </table>
        </div>
      </form:form>
     <br>
     <h3 style="margin-top:0px">List of Employees</h3>
       <table class="table table-bordered" style="width: 500px">
         <tr>
           <th style="background-color:DimGray; color:#fff;">Id</th>
           <th style="background-color:DimGray; color:#fff;">Name</th>
           <th style="background-color:DimGray; color:#fff;"> Age </th>
           <th style="background-color:DimGray; color:#fff;">Department</th>
           <th style="background-color:DimGray; color:#fff;">Edit/Delete</th>
         </tr>
         <c:forEach items="${employeeList}" var="employee">
         <tr>
           <td width="70" align="center" style="background-color:#bdb76b;">${employee.id}</td>
           <td width="120" align="left" style="background-color:#fffacd;">${employee.name}</td>
           <td width="70" align="center" style="background-color:#fffacd;">${employee.age}</td>
           <td width="70" align="center" style="background-color:#fffacd;">${employee.dept}</td>
           <td width="70" align="center" style="background-color:#ffdabb9;"><a href="${pageContext.request.contextPath}/edit/${employee.id}">Edit</a>/<a href="${pageContext.request.contextPath}/delete/${employee.id}">Delete</a></td>
         </tr>
      </c:forEach>
    </table>
  </body>
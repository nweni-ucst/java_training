<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper" id="std-update-page">
  <div class="row">
    <div class="col-12">
      <div class="forms-mr">
        <div class="col-sm-6 col-md-6 form-detail">

          <!-- Student Edition form START -->
          <c:url var="addAction" value="/confirmEditStudent"></c:url>
          <form:form class="form-create" action="${addAction}"
            method="POST" id="form" modelAttribute="student">
            <form:hidden path="id" />
            <div class="card card-primary card-outline">
              <div class="card-body box-profile">
                <h4 class="text-center forms-header">Student Edition</h4>

                <!-- Show Error Message -->
                <c:if test="${errorMsg != null }">
                  <div class="alert alert-danger">
                    <strong>${errorMsg }</strong>
                  </div>
                </c:if>

                <div class="form-group">
                  <form:label path="rollNumber">Roll Number</form:label>
                  <form:input path="rollNumber" class="form-control"
                    placeholder="Enter Roll Number" />
                  <form:errors path="rollNumber" class="text-danger" />
                </div>

                <div class="form-group">
                  <form:label path="name">Name</form:label>
                  <form:input path="name"
                    class="form-control" placeholder="Enter Name" />
                  <form:errors path="name" class="text-danger" />
                </div>

                <div class="form-group">
                  <form:label path="major">Major</form:label>
                  <form:input path="major"
                    class="form-control" placeholder="Enter Major" />
                  <form:errors path="major" class="text-danger" />
                </div>

                <div class="form-group">
                  <form:label path="year">Year</form:label>
                  <form:input path="year"
                    class="form-control" placeholder="Enter Year" />
                  <form:errors path="year" class="text-danger" />
                </div>

                <div class="form-group">
                  <form:label path="email">Email</form:label>
                  <form:input path="email"
                    class="form-control" placeholder="Enter Email" />
                  <form:errors path="email" class="text-danger" />
                </div>

                <div class="form-group">
                  <form:label path="dob">Date Of Birth</form:label>
                  <div class="input-group date datepicker"
                    data-provide="datepicker">
                    <form:input path="dob" type="text"
                      class="form-control" autocomplete="off"
                      placeholder="Enter Date Of Birth" />
                    <div class="input-group-addon">
                      <span class="glyphicon glyphicon-th"></span>
                    </div>
                  </div>
                  <form:errors path="dob" class="text-danger" />
                </div>

                <button type="submit" class="btn btn-info">Update</button>
                <a class="btn btn-secondary"
                  href="${pageContext.request.contextPath}/students">Back</a>
                <a class="btn btn-secondary"
                  href="${pageContext.request.contextPath}/editStudent?id=${student.id}">Reset</a>
              </div>
            </div>
          </form:form>
          <!-- Student Edition form END -->
        </div>
      </div>
    </div>
  </div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper" id="std-create-confirm-page">
  <div class="row">
    <div class="col-12">
      <div class="forms-mr">
        <div class="col-sm-6 col-md-6 form-detail">

          <!-- Student Creation Confirm form START -->
          <c:url var="addAction" value="/registerStudent"></c:url>
          <form:form class="form-create" action="${addAction}"
            method="POST" id="form" modelAttribute="studentForm">
            <input type="hidden" name="id" value="${studentForm.id }">
            <div class="card card-primary card-outline">
              <div class="card-body box-profile">
                <h4 class="text-center forms-header">Student
                  Registration Confirm</h4>

                <!-- Show Error Message -->
                <c:if test="${errorMsg != null }">
                  <div class="alert alert-danger">
                    <strong>${errorMsg }</strong>
                  </div>
                </c:if>

                <ul class="list-group list-group-unbordered mb-3">
                  <li class="list-group-item">Roll Number 
                    <a class="float-right">${studentForm.rollNumber } 
                      <form:hidden path="rollNumber" class="form-control" />
                    </a>
                  </li>

                  <li class="list-group-item">Name 
                    <a class="float-right">${studentForm.name } 
                      <form:hidden path="name" class="form-control" />
                    </a>
                  </li>

                  <li class="list-group-item">Major 
                    <a class="float-right">${studentForm.major } 
                      <form:hidden path="major" class="form-control" />
                    </a>
                  </li>

                  <li class="list-group-item">Year 
                    <a class="float-right">${studentForm.year } 
                      <form:hidden path="year" class="form-control" />
                    </a>
                  </li>

                  <li class="list-group-item">Email 
                    <a class="float-right">${studentForm.email } 
                      <form:hidden path="email" class="form-control" />
                    </a>
                   </li>
                  <li class="list-group-item">Date Of Birth
                    <a class="float-right">${studentForm.dob } 
                      <form:hidden path="dob" class="form-control" />
                    </a>
                  </li>
                </ul>

                <button type="submit" class="btn btn-info" name="addStudent">Add</button>
                <button type="submit" class="btn btn-secondary" name="cancel">Cancel</button>
              </div>
            </div>
          </form:form>
          <!-- Student Creation Confirm form END -->

        </div>
      </div>
    </div>
  </div>
</div>
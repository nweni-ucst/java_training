<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper" id="student-list">
  <div class="row">
    <div class="col-12">
      <div class="card">
        <div class="card-header">
          <h3 class="card-title">Student List</h3>
        </div>

        <!-- Show Success Message -->
        <c:if test="${successMsg != null }">
          <div class="alert alert-success">
            <strong>${successMsg }</strong>
          </div>
        </c:if>
        <c:remove var="successMsg" />

        <div class="card-body">
          <div class="row">
            <div class="col-sm-12 col-md-12">
              <div class="search-sec">
                <a
                  href="${pageContext.request.contextPath}/registerStudent"
                  class="btn btn-info">Add</a>
              </div>
            </div>
          </div>

          <!-- Student List START -->
          <div class="row">
            <div class="col-sm-12">
              <table id="example1"
                class="table table-bordered table-striped">
                <thead>
                  <tr>
                    <th>ID</th>
                    <th>Roll Number</th>
                    <th>Name</th>
                    <th>Major</th>
                    <th>Year</th>
                    <th>Email</th>
                    <th>Date of Birth</th>
                    <th>Actions</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach items="${StudentList}" var="student"
                    varStatus="loop">
                    <tr>
                      <td>${loop.index + 1 }</td>
                      <td>${student.rollNumber }</td>
                      <td>${student.name}</td>
                      <td>${student.major }</td>
                      <td>${student.year }</td>
                      <td>${student.email}</td>
                      <td>${student.dob}</td>
                      <td class="text-right py-0 align-middle">
                        <div class="btn-group btn-group-sm">
                          <a
                            href="${pageContext.request.contextPath}/editStudent?id=${student.id}"
                            class="btn btn-secondary"><i
                            class="fas fa-edit"></i></a> <a href="#"
                            data-toggle="modal"
                            data-href="${pageContext.request.contextPath}/deleteStudent?id=${student.id }"
                            data-target="#myModal"
                            class="btn btn-danger"><i
                            class="fas fa-trash"></i></a>
                        </div>
                      </td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>
          </div>
          <!-- Student List END -->
        </div>
      </div>
    </div>
  </div>

  <!-- Delete Confirmation dialog START -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <h4 class="modal-title">Delete Student Confirmation</h4>
        </div>
        <div class="modal-body">
          <p>Do you want to delete?</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default"
            data-dismiss="modal">Cancel</button>
          <a class="btn btn-danger btn-ok">Delete</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Delete Confirmation dialog END -->
</div>

<script src='<c:url value="/resources/js/student_list.js"/>'></script>
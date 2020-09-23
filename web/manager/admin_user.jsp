<%-- 
    Document   : admin_user
    Created on : Sep 23, 2020, 2:43:25 PM
    Author     : komei
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file = "admin_menu.jsp" %>
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="admin_menu.jsp">Home</a><span class="crumb-step">&gt;</span><span class="crumb-name">User Management</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="#" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="70">Keywords:</th>
                            <td><input class="common-text" placeholder="Enter Email" name="keywords" value="" id="" type="text"></td>
                            <td><input class="btn btn-primary btn2" name="sub" value="Search" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="insert.html"><i class="icon-font"></i>Add User</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <tr>
                            <th>Email</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Date of Birth</th>
                            <th>Phone Number</th>
                            <th>Password</th>
                            <th>Is Admin</th>
                            <th>Process</th>
                        </tr>
                        <c:forEach var="u" items="${users}">
                        <tr>
                            <td>${u.getEmail()}</td>
                            <td>${u.getFirstName()}</td>
                            <td>${u.getLastName()}</td>
                            <td>${u.getDOB()}</td>
                            <td>${u.getPhoneNumber()}</td>
                            <td>${u.getPassword()}</td>
                            <td>${u.getIsAdmin()}</td>
                            <td>
                                <a class="link-update" href="#">Edit</a>
                                <a class="link-del" href="adminUserDelete?id=">Delete</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
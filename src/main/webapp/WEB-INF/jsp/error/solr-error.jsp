<%--
  Created by IntelliJ IDEA.
  User: yuyufeng
  Date: 2017/8/1
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh">
<head>
    <%@include file="/WEB-INF/jsp/include/head.jsp" %>
</head>
<body>
<!-- Navigation -->
<%@include file="/WEB-INF/jsp/include/nav.jsp" %>

<!-- Page Content -->
<div class="container">
    <h1 class="page-header">
        博客
        <small>yuyufeng's blog</small>
    </h1>
    <div class="row">
        <!-- Blog Entries Column -->
        <div class="login-panel panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title"><a href="javascript:history.go(-1)">返回</a></h3>
            </div>
            <div class="panel-body">
                <div class="alert alert-danger" role="alert"><i class="glyphicon glyphicon-warning-sign"></i> 搜索服务异常
                </div>
            </div>
        </div>

    </div>
    <!-- /.row -->
    <hr>
</div>
<!-- /.container -->
<%@include file="/WEB-INF/jsp/include/foot.jsp" %>

</body>
</html>

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
    <title>关于 -- 心得站点</title>
    <%@include file="/WEB-INF/jsp/include/head.jsp" %>
</head>
<body>
<!-- Navigation -->
<%@include file="/WEB-INF/jsp/include/nav.jsp" %>

<!-- Page Content -->
<div class="container">

    <div class="row">
        <!-- Blog Entries Column -->
        <div class="col-md-12">

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3>关于网站</h3>
                </div>
                <div class="panel-body">
                    <p>
                        开发人员：本站由yuyufeng个人独自开发
                    </p>

                    <p>
                        网站架构：本网站采用了SpringMVC+JPA+Hibernate的框架开发，并且集成了Solr搜索引擎服务。前端基于Bootstrap+jQuery设计。
                    </p>

                    <p>
                        主要功能：提供个人的学习心得，供大家一起学习讨论，后期将会提供一些接口服务。
                    </p>

                    <br>
                    <h4>感谢您的访问！</h4>
                    <p class="text-left">yuyufeng</p>
                </div>
                <!-- /.panel-body -->
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
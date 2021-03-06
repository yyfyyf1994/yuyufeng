<%--
  Created by IntelliJ IDEA.
  User: yuyufeng
  Date: 2017/5/31
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="${appServer}/admin/index">yuyufeng.top's Admin</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i> ${SESSION_USER.userName}  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
               <%-- <li>
                    <a href="${appServer}/admin/index"><i class="glyphicon glyphicon-home"></i> 主页</a>
                </li>
                <li>
                    <a href="${appServer}/admin/blog/list/0"><i class="glyphicon glyphicon-text-background"></i> 文章</a>
                </li>--%>
                <li class="divider"></li>
                <li>
                    <a href="${appServer}/admin/quit"><i class="fa fa-sign-out fa-fw"></i> 退出</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->

    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <%--<li class="sidebar-search">
                    <div class="input-group custom-search-form">
                        <input type="text" class="form-control" placeholder="Search...">
                        <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                    </div>
                    <!-- /input-group -->
                </li>--%>
                <li>
                    <a href="${appServer}/admin/index"><i class="fa fa-dashboard fa-fw"></i> 后台首页</a>
                </li>
                <li>
                    <a href="${appServer}/admin/blog"><i class="glyphicon glyphicon-text-background"></i> 博客管理 <span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <%--<li>
                            <a href="${appServer}/admin/article/new?pageNo=1">发表文章</a>
                        </li>--%>
                        <li>
                            <a href="${appServer}/admin/blog/list/1">博客列表</a>
                        </li>

                    </ul>
                    <!-- /.nav-second-level -->
                </li>


                <li>
                    <a href="${appServer}/admin/catalog"><i class="fa fa-bar-chart-o fa-list-ul"></i> 目录管理 <span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="${appServer}/admin/develop">目录列表</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>

                <li>
                    <a href="${appServer}/admin/user"><i class="fa fa-bar-chart-o fa-users"></i> 用户管理 <span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="${appServer}/admin/user/list/1">用户列表</a>
                        </li>
                        <li>
                            <a href="${appServer}/admin/develop">用户审核</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>

            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>
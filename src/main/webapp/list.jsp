<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/8/17
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/index_work.css">
    <script type="text/javascript" src="js/jQuery.3.5.1.js"></script>
</head>
<body>
<table>
    <tr>
        <td colspan="10">
            <form action="list">
                姓名:<input type="text" name="name">
                <input type="submit" value="查找">
                <a href="add.jsp">添加</a>
            </form>
        </td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>确诊疾病</td>
        <td>性别</td>
        <td>确诊日期</td>
        <td>年龄</td>
        <td>状态</td>
        <td>存活时长</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${plist.list}" var="tt">
        <tr>
            <td>${tt.id}</td>
            <td>${tt.name}</td>
            <td>${tt.disease.dname}</td>
            <td>${tt.gender}</td>
            <td>${tt.diagnosed}</td>
            <td>
                <c:if test="${tt.diedate!=null}">
                    ${tt.diedate}-${tt.birthday}
                </c:if>
                <c:if test="${tt.diedate==null}">
                    new Date()-${tt.birthday}
                </c:if>
            </td>
            <td>
                <c:if test="${tt.diedate!=null}">
                离世
                </c:if>
                <c:if test="${tt.diedate==null} ">
                在世
                </c:if>
            </td>
            <td>
                <c:if test="${tt.diedate !=null}">
                    ${tt.diedate}-${tt.diagnosed}
                </c:if>
                <c:if test="${tt.diedate==null} ">
                    new Date()-${tt.diagnosed}
                </c:if>
            </td>
            <td><a href="find?id=${tt.id}">更新</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="10">
            当前 ${plist.pageNum} / ${plist.pages} 页 ,
            共 ${plist.total} 条记录,
            <a href="list?pageNum=${plist.firstPage}">首页</a>
            <a href="list?pageNum=${plist.pageNum-1}">上一页</a>
            <a href="list?pageNum=${plist.pageNum+1}">下一页</a>
            <a href="list?pageNum=${plist.lastPage}">尾页</a>
        </td>
    </tr>
</table>
</body>
</html>

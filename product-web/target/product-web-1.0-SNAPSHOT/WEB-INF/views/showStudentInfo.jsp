<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
    <title>Spring MVC Demo</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="/static/js/bootstrap.min.js"></script>
</head>
 
<body>
    <h2>All Students</h2>
 
    <table border="1">
        <tr>
            <th>Student Id</th>
            <th>Student Name</th>
            <th>Student Classid</th>
            <th>Student Scoreid</th>
            <th>Student Gender</th>
            <th>Student Scid</th>
            <th>Student Age</th>
            <th>Student Address</th>
            <th>Student Tel</th>
            <th>Student Createtime</th>
            <th>Student Createuser</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.stuName}</td>
                <td>${student.stuClassid}</td>
                <td>${student.stuScoreid}</td>
                <td>${student.stuGender}</td>
                <td>${student.stuScid}</td>
                <td>${student.stuAge}</td>
                <td>${student.stuAddress}</td>
                <td>${student.stuTel}</td>
                <td>${student.stuCreatetime}</td>
                <td>${student.stuCreateuser}</td>
            </tr>
        </c:forEach>
    </table>

<script>

    $(document).ready(function(){
        $("#btn1").click(function(){
            $("#test1").load("demo_test.txt",function(responseTxt,statusTxt,xhr){
                if(statusTxt=="success")
                    alert("外部内容加载成功！");
                if(statusTxt=="error")
                    alert("Error: "+xhr.status+": "+xhr.statusText);
            });
        });

        $.post("/Student/getStudent",
            {
                id:110928
            },
            function(data){
                alert("Data: " + data );
            });
    });
</script>
</body>
</html>

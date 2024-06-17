<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
  <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3307/revature" user = "root"  password = "root"/>
       <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from students;
         </sql:query>
      <table border = "1" width = "70%">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
           
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.id}"/></td>
               <td> <c:out value = "${row.name}"/></td>
               <td> <c:out value = "${row.age}"/></td>
               
            </tr>
         </c:forEach>
      </table>

   </body>
</html>
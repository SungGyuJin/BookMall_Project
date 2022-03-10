<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ include file="../includes/header.jsp" %>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Tables</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">Board List Page</div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                    	<th>#번호</th>
                                    	<th>제목</th>
                                    	<th>작성자</th>
                                    	<th>작성일</th>
                                    	<th>수정일</th>
                                    </tr>
                                </thead>
                                
                                <c:forEach items="${list }" var="board">
									<tr>
										<td><a href="register"><c:out value="${board.bno }" /></a></td>
										<td><c:out value="${board.title }" /></td>
										<td><c:out value="${board.writer }" /></td>
										<td><fmt:formatDate pattern="yyyy-MM-dd"
										value="${board.regdate }" /></td>
										<td><fmt:formatDate pattern="yyyy-MM-dd"
											value="${board.updateDate }" /></td>
									</tr>                                
                                </c:forEach>
                            </table> <!-- end table -->
                        </div>
                        <!-- end panel-body -->
                    </div>
                    <!-- end panel -->
                </div>
            </div>
            <!-- /.row -->
<%@ include file="../includes/footer.jsp" %>

<script type="text/javascript">
$(document).ready(function(){
	
	var result = '<c:out value="${result}"/>';
}

</script>
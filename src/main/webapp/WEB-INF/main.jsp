<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RSSAggregator</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/inc/style.css"/>" />
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div style="width: 300px;" class="leftDiv">
		<c:forEach items="${sessionScope.user.folders }" var="folder">
		${folder.title }
		<div>
				<ul>
					<c:forEach items="${folder.feeds }" var="feed">
						<li><a href="<c:url value="/main?rss="/>${feed.url}">${feed.url }</a></li>
					</c:forEach>
				</ul>
			</div>
		</c:forEach>
	</div>
	<div style="margin-left: 300px;" class="rightDiv">
		<c:if test="${not empty feed}">
			<c:forEach items="${feed.messages}" var="message">
				<div class="message">
					<div class="title">${message.title }</div>
					<div>${message.description }</div>
					<div>
						<b>Written by : </b><i>${message.author }</i>
					</div>
					<a href="${message.url}">${message.url }</a>
				</div>
			</c:forEach>
		</c:if>
	</div>

</body>
</html>
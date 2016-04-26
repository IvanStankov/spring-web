<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="root" value="${pageContext.request.contextPath}"/>
<div class="row header distance-padding-top distance-padding-bottom">
    <div class="col-md-8 col-md-offset-2">
         <ul class="nav nav-pills">
             <li><a href="${root}">Time sheet</a></li>
             <li><a href="${root}/create-movie">Create movie</a></li>
             <li><a href="${root}/create-time-sheet">Create time sheet</a></li>
             <li><a href="${root}/headers">Headers</a></li>
         </ul>
    </div>
    <div class="col-md-2">
        <form:form method="post" action="${root}/logout">
            <button type="submit" class="btn btn-warning">Logout</button>
        </form:form>
    </div>
</div>

<div class="row distance-margin-top">
    <div class="col-md-8 col-md-offset-2">
        <tiles:insertAttribute name="body" />
    </div>
</div>
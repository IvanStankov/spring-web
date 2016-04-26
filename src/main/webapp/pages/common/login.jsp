<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="root" value="${pageContext.request.contextPath}"/>
<div class="row form-login">
    <div class="col-md-4 col-md-offset-2">
        <form:form action="${root}/login" method="post">
            <div class="form-group">
                <label for="username">Username</label>
                <input class="form-control" id="username" name="username">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input class="form-control" id="password" name="password">
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form:form>
    </div>
</div>
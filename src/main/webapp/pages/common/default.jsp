<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
  <head>
    <meta charset="utf-8">
    <c:set var="root" value="${pageContext.request.contextPath}"/>
    <title>Movie booking</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="${root}/css/common.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
    <script src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
    <script src="https://cdn.jsdelivr.net/momentjs/2.12.0/moment.min.js"></script>
    <script src="https://cdn.jsdelivr.net/momentjs/2.12.0/locales.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
    <script src="${root}/js/common.js"></script>
  </head>
  <body>
    <div class="container-fluid">
        <div class="row header distance-padding-top distance-padding-bottom">
            <div class="col-md-8 col-md-offset-2">
                 <ul class="nav nav-pills">
                   <li><a href="${root}">Time sheet</a></li>
                   <li><a href="${root}/create-movie">Create movie</a></li>
                   <li><a href="${root}/create-time-sheet">Create time sheet</a></li>
                   <li><a href="${root}/headers">Headers</a></li>
                 </ul>
             </div>
         </div>

         <div class="row distance-margin-top">
             <div class="col-md-8 col-md-offset-2">
                 <tiles:insertAttribute name="body" />
             </div>
         </div>
     </div>
  </body>
</html>
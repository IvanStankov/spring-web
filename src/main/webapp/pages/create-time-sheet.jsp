<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form action="create-time-sheet" method="post">
    <div class="row">
        <div class="form-group col-md-4">
            <div class="input-group">
                <input id="search" name="search" class="form-control" placeholder="Search for...">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="button" id="searchButton">
                        <span class="glyphicon glyphicon-search"></span>
                    </button>
                </span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-md-4">
            <label for="movieId">Movie</label>
            <select multiple class="form-control" id="movieId" name="movieId">
                <c:forEach var="movie" items="${movies}">
                    <option value="${movie.id}">${movie.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-md-4">
            <label for="startTime">Start time</label>
            <div class="input-group date" id="startTime">
                <input type="text" class="form-control" name="startTime"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="form-group col-md-4">
            <label for="price">Price</label>
            <input id="price" name="price" class="form-control" placeholder="Type price here">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Save movie</button>
</form>
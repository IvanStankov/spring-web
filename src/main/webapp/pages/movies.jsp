<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>Name</th>
                <th>Start time</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="timeSheet" items="${moviesTimeSheet}">
                <tr>
                    <td><a class="btn btn-link" href="movie/${timeSheet.movie.id}">${timeSheet.movie.name}</a></td>
                    <td>${timeSheet.startTime}</td>
                    <td>${timeSheet.price}</td>
                    <td><a class="btn btn-success" href="create-booking/${timeSheet.id}">Book</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
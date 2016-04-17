<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="jmp" uri="http://com.ivan.jmp/jsp/tags" %>

<div id="bookings">
    <input type="hidden" value="${timeSheet.id}" id="timeSheetId"/>
    <c:forEach begin="0" end="3" varStatus="row">
        <div>
            <c:forEach begin="${row.index * 10}" end="${row.index * 10 + 9}" varStatus="col">
                <c:set var="spotNum" value="${row.index * 10 + col.index}"/>
                <span id="${spotNum}" class="spot ${col.last ? '' : 'spot-margin-right'}
                    ${jmp:isBooked(spotNum, timeSheet.movieSessionList) ? 'bg-danger' : 'bg-success'}">
                    <c:if test="${jmp:isBooked(spotNum, timeSheet.movieSessionList)}">
                        <button type="button" class="close" aria-label="Close" id="close${spotNum}">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </c:if>
                </span>
            </c:forEach>
        </div>
    </c:forEach>
</div>
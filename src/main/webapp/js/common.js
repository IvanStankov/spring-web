$(function() {
    $("#searchButton").click(function() {
        var searchString = $("#search").val();
        $.getJSON("/spring-web-1.0-SNAPSHOT/searchMovie?q=" + searchString, function(data) {
            $("#movieId option").remove();
            $.each(data, function(i, item) {
                $('#movieId').append($("<option></option>")
                     .attr("value",item.id)
                     .text(item.name));
            });
        });
    });

    $('#startTime').datetimepicker({
        locale: 'ru'
    });

    $("#bookings").click(function(event) {
        if (event.target.tagName === 'SPAN' && event.target.parentElement.tagName === 'BUTTON') {
            var timeSheetId = $("#timeSheetId").val();
            var spotId = event.target.parentElement.parentElement.id;
            $.post("/spring-web-1.0-SNAPSHOT/book", "spotNum=" + spotId + "&timeSheetId=" + timeSheetId + "&booked=false",
            function() {
                $("#" + spotId).removeClass("bg-danger");
                $("#" + spotId).addClass("bg-success");
                $("#close" + spotId).remove();
            });
        } else  if (event.target.tagName === 'SPAN') {
            var timeSheetId = $("#timeSheetId").val();
            var spotId = event.target.id;
            $.post("/spring-web-1.0-SNAPSHOT/book", "spotNum=" + spotId + "&timeSheetId=" + timeSheetId + "&booked=true",
            function() {
                $("#" + spotId).removeClass("bg-success");
                $("#" + spotId).addClass("bg-danger");
                $("#" + spotId).append("<button type='button' class='close' aria-label='Close' id='close"
                         + spotId + "'><span aria-hidden='true'>&times;</span></button>");
            });
        }
    });

});
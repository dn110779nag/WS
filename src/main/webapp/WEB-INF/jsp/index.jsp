<%-- 
    Document   : index
    Created on : 18.11.2015, 18:08:25
    Author     : Новомлинов Александр
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="resources/sockjs.js"></script>
        <script src="resources/stomp.js"></script>
        <script>
            var socket = new SockJS("/WS/portfolio");
            var stompClient = Stomp.over(socket);
            stompClient.connect({}, function (frame) {
                console.log('!!!Connected ' + frame);
                stompClient.subscribe("/app/ping", function (message) {
                    console.log(JSON.parse(message.body));
                });
                
//                stompClient.subscribe("/topic/inf", function (message) {
//                    console.log(message.body);
//                });
                
//                stompClient.subscribe("/queue/errors", function (message) {
//                    console.log(JSON.parse(message.body));
//                });
            }, function (error) {
                console.log("STOMP protocol error " + error);
            });


        </script>
    </head>
    <body>
        <h1>Hello World from Spring!</h1>
    </body>
</html>

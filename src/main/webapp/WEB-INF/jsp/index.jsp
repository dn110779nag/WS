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
            });
        </script>
    </head>
    <body>
        <h1>Hello World from Spring!</h1>
    </body>
</html>

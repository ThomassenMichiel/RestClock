var stompClient = null;

document.addEventListener('DOMContentLoaded', function() {
    connect();
}, false);

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/time', function (greeting) {
            showGreeting(JSON.parse(greeting.body).time);
        });
    });
}

function showGreeting(message) {
    $("#greetings").html(message);
}

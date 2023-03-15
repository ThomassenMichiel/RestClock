package com.thomassenmichiel.restclock;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TimeController {

    @MessageMapping("/time")
    @SendTo("/topic/time")
    public Time time(TimeMessage timeMessage) {
        return new Time(timeMessage.getTime());
    }
}

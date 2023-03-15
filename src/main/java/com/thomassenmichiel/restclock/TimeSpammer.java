package com.thomassenmichiel.restclock;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class TimeSpammer {
    private SimpMessagingTemplate template;

    public TimeSpammer(SimpMessagingTemplate template) {
        this.template = template;
    }

    @Scheduled(fixedRate = 1000)
    public void trololol() {
        TimeMessage message = new TimeMessage(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        template.convertAndSend("/topic/time", message);
    }
}

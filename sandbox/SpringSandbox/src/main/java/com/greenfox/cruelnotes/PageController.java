package com.greenfox.cruelnotes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private NotificationService notificationService;

    public PageController() {
        notificationService = new NotificationService();
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Page Controller...";
    }
}

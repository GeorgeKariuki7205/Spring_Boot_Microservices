package com.microservices.notifications.Controller;

import com.microservices.notifications.Service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/notifications")
@AllArgsConstructor
public class NotificationController {
    private  final NotificationService notificationService;
    @PostMapping
    public ResponseEntity<Object> notification(@RequestBody Map notificationsMap){

        return new ResponseEntity<Object>( notificationService.createNotifications(notificationsMap), HttpStatus.OK);

    }

}

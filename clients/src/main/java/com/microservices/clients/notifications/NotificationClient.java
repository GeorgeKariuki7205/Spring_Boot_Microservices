package com.microservices.clients.notifications;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient("notifications")
public interface NotificationClient {

    @PostMapping(path = "api/v1/notifications")
    public ResponseEntity<Object> notification(@RequestBody Map notificationsMap);


}

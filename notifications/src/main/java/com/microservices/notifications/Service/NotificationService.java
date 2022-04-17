package com.microservices.notifications.Service;

import com.microservices.notifications.Entity.NotificationEntity;
import com.microservices.notifications.Repository.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;
    public List createNotifications(Map notificationsMap) {

        NotificationEntity notificationEntity = NotificationEntity.builder()
                .firstName( (String) notificationsMap.get("fist_name"))
                .lastName((String) notificationsMap.get("last_name"))
                .sendNotification((Boolean) notificationsMap.get("send_notification"))
                .typeOfNotification((String) notificationsMap.get("type_of_notification"))
                .build();
        notificationRepository.save(notificationEntity);
        return notificationRepository.findAll();

    }
}

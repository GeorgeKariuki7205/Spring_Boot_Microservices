package com.microservices.notifications.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "notifications")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class NotificationEntity {
    @Id
    @SequenceGenerator(name = "z_notification_sequence", allocationSize = 1, sequenceName = "z_notification_sequence")
    @GeneratedValue(generator = "z_notification_sequence",strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long notificationId;

    @Column(name = "fist_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private  String lastName;

    @Column(name = "send_notification", nullable = false)
    private Boolean sendNotification;

    @Column(name = "type_of_notification", nullable = false)
    private String typeOfNotification;
}

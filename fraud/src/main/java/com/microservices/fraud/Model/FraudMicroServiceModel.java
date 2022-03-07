package com.microservices.fraud.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fraud_microservice_fraud")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FraudMicroServiceModel {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "customer_microservice_fraud_id", sequenceName = "customer_microservice_fraud_id")
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator ="customer_microservice_fraud_id")
    private Long id;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

}

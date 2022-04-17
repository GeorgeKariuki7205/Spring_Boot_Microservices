package com.microservices.clients.fraud;

import com.microservices.fraud.Model.FraudMicroServiceModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.Map;

@FeignClient("fraud")
public interface FraudClient {

    @PostMapping(path = "api/v1/fraud_reporting")
    ResponseEntity<Object> addingRequestToDatabase(@RequestBody Map fraudDetails);


}

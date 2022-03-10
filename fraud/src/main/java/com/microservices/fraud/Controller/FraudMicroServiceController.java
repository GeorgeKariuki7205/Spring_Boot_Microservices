package com.microservices.fraud.Controller;

import com.microservices.fraud.Model.FraudMicroServiceModel;
import com.microservices.fraud.Service.FraudMicroServiceService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@Slf4j
@Builder
@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/fraud_reporting")
public class FraudMicroServiceController {

    private  final FraudMicroServiceService fraudMicroServiceService;

    @PostMapping
    public ResponseEntity<Object> addingRequestToDatabase(@RequestBody Map fraudDetails){

        FraudMicroServiceModel fraudMicroServiceModel =  FraudMicroServiceModel.builder().customerId((Long)  ((Number) (fraudDetails.get("customerId"))).longValue() ).createdAt(LocalDateTime.now()).build();
        return new ResponseEntity<>(fraudMicroServiceService.addNewClient(fraudMicroServiceModel), HttpStatus.OK);

    }

    @GetMapping
    public Boolean samplePost(){
        return true;
    }


}

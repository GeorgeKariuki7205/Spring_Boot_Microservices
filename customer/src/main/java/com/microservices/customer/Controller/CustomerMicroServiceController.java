package com.microservices.customer.Controller;

import com.microservices.customer.Model.CustomerMicroServiceModel;
import com.microservices.customer.Service.CustomerMicroServiceService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerMicroServiceController {

    private final CustomerMicroServiceService customerMicroServiceService;
    @PostMapping
    public ResponseEntity<Object>  storeCustomerToDatabase(@RequestBody CustomerMicroServiceModel customerMicroServiceModel){

        return new ResponseEntity<>(customerMicroServiceService.addNewClient(customerMicroServiceModel), HttpStatus.OK);

    }

}

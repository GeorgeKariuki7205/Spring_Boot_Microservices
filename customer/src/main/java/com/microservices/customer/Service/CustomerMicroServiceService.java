package com.microservices.customer.Service;

import com.microservices.clients.fraud.FraudClient;
import com.microservices.customer.Config.CustomerMicroServiceConfiguration;
import com.microservices.customer.FraudMicroserviceResponse.FraudCheckResponse;
import com.microservices.customer.Model.CustomerMicroServiceModel;
import com.microservices.customer.Repository.CustomerMicroserviceRepository;
import com.netflix.discovery.DiscoveryClient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
@Service
@AllArgsConstructor
@Builder
public class CustomerMicroServiceService {

//    @Autowired
//    DiscoveryClient discoveryClient;

    private final CustomerMicroserviceRepository customerMicroserviceRepository;
    private final RestTemplate restTemplate;
    private final FraudClient fraudClient;
    public Object addNewClient(CustomerMicroServiceModel customerMicroServiceModel) {

//        This function adds the application customers used to save the application
        CustomerMicroServiceModel customerMicroServiceModel2 =  CustomerMicroServiceModel.builder()
                .email(customerMicroServiceModel.getEmail())
                .firstName(customerMicroServiceModel.getFirstName())
                .secondName(customerMicroServiceModel.getSecondName())
                .build();
        customerMicroserviceRepository.saveAndFlush(
                customerMicroServiceModel2
        );

//        ! adding the microservice to send the request.

        HashMap request = new HashMap();
        request.put("customerId", customerMicroServiceModel2.getId());

        Map data = new HashMap<>();
        data.put("customerId",customerMicroServiceModel2.getId());
        fraudClient.addingRequestToDatabase(data);



        return this.gettingALlCustomersInApplication();
    }

    public Object gettingALlCustomersInApplication(){
        return customerMicroserviceRepository.findAll();
    }
}

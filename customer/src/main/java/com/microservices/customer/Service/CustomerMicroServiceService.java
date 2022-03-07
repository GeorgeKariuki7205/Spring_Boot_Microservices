package com.microservices.customer.Service;

import com.microservices.customer.Model.CustomerMicroServiceModel;
import com.microservices.customer.Repository.CustomerMicroserviceRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Builder
public class CustomerMicroServiceService {

    private final CustomerMicroserviceRepository customerMicroserviceRepository;

    public Object addNewClient(CustomerMicroServiceModel customerMicroServiceModel) {

//        THis function adds the application customers used to save the application
        CustomerMicroServiceModel customerMicroServiceModel2 =  CustomerMicroServiceModel.builder()
                .email(customerMicroServiceModel.getEmail())
                .firstName(customerMicroServiceModel.getFirstName())
                .secondName(customerMicroServiceModel.getSecondName())
                .build();
        customerMicroserviceRepository.saveAndFlush(
                customerMicroServiceModel2
        );
        return this.gettingALlCustomersInApplication();
    }

    public Object gettingALlCustomersInApplication(){
        return customerMicroserviceRepository.findAll();
    }
}

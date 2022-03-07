package com.microservices.fraud.Service;

import com.microservices.fraud.Model.FraudMicroServiceModel;
import com.microservices.fraud.Repository.FraudMicroServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraudMicroServiceService {
    private final FraudMicroServiceRepository fraudMicroServiceRepository;
    public Object addNewClient(FraudMicroServiceModel fraudMicroServiceModel) {

        return fraudMicroServiceRepository.saveAndFlush(fraudMicroServiceModel);

    }
}

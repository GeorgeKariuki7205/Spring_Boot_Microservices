package com.microservices.customer.Model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerMicroServiceEntity {
    private Integer id;
    private String first_name;
    private  String second_name;
    private String email;
}

package amir.boss.sn.msccbrewery.services;

import amir.boss.sn.msccbrewery.web.models.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Amir")
                .build();
    }
}

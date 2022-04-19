package amir.boss.sn.msccbrewery.services;

import amir.boss.sn.msccbrewery.web.models.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);
}

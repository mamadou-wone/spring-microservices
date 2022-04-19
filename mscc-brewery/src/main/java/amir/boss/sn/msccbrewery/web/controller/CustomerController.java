package amir.boss.sn.msccbrewery.web.controller;

import amir.boss.sn.msccbrewery.services.CustomerService;
import amir.boss.sn.msccbrewery.web.models.BeerDta;
import amir.boss.sn.msccbrewery.web.models.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID id){
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }
}

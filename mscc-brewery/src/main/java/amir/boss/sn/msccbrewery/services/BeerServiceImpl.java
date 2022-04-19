package amir.boss.sn.msccbrewery.services;

import amir.boss.sn.msccbrewery.web.models.BeerDta;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDta getBeerById(UUID beerId) {
        return BeerDta.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale").build();
    }
}

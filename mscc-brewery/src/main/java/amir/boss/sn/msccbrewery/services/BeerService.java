package amir.boss.sn.msccbrewery.services;

import amir.boss.sn.msccbrewery.web.models.BeerDta;

import java.util.UUID;

public interface BeerService {
    BeerDta getBeerById(UUID beerId);
}

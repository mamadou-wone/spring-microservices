package amir.boss.sn.msccbrewery.web.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDta {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}

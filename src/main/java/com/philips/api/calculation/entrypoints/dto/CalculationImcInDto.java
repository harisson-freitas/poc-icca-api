package com.philips.api.calculation.entrypoints.dto;

import lombok.*;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculations
 * @since 04/05/20 - 13:44
 **/

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class CalculationImcInDto {
    private Double height;
    private Double weight;
}

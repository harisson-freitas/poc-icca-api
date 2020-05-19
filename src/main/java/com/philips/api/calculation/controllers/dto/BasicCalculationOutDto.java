package com.philips.api.calculation.controllers.dto;

import lombok.*;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculations
 * @since 04/05/20 - 13:50
**/
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class BasicCalculationOutDto {
    private Long result;
}

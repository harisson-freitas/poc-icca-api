package com.philips.api.calculation.entrypoints.controllers;

import com.philips.api.calculation.entrypoints.controllers.documentations.CalculationControllerDocumentation;
import com.philips.api.calculation.entrypoints.dto.CalculationImcInDto;
import com.philips.api.calculation.entrypoints.dto.CalculationImcOutDto;
import com.philips.api.calculation.infrastructure.services.CalculationImcClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculations
 * @since 04/05/20 - 15:00
 **/
@AllArgsConstructor
@RestController
@RequestMapping("v1/calculation")
public class CalculationController implements CalculationControllerDocumentation {

    private final CalculationImcClientService service;

    @Override
    @GetMapping("imc/{height}/height/{weight}/weight")
    public ResponseEntity<CalculationImcOutDto> calculateImc(@PathVariable Double height,
                                                             @PathVariable Double weight) {
        return service.calculateImc(CalculationImcInDto
                .builder()
                .height(height)
                .weight(weight)
                .build()).map(ResponseEntity::ok)
                .orElseThrow(InternalError::new);
    }
}

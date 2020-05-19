package com.philips.api.calculation.controllers;

import com.philips.api.calculation.controllers.documentations.BasicCalculationControllerDocumentation;
import com.philips.api.calculation.controllers.dto.BasicCalculationOutDto;
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

@RestController
@RequestMapping("v1/basic-calculation")
public class BasicCalculationController implements BasicCalculationControllerDocumentation {

    @Override
    @GetMapping("sum/{firstValue}/first-value/{secondValue}/second-value")
    public ResponseEntity<BasicCalculationOutDto> calculateBasicSum(@PathVariable Long firstValue, @PathVariable Long secondValue) {
        return null;
    }
}

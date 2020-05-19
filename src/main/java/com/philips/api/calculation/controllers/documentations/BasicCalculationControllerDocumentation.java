package com.philips.api.calculation.controllers.documentations;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculations
 * @since 04/05/20 - 15:15
 **/

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import javax.websocket.server.PathParam;

/*
 * Controller documentation of BasicCalculation
 * API version v1/0.0.1
 * */

@Tag(name = "Basic Calculation", description = "Basic calculation manipulation resource")
public interface BasicCalculationControllerDocumentation {

    @Operation(summary = "Perform a sum", description = "Perform a sum between numbers", tags = {"sum"})
    @ApiResponses({@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR"),
            @ApiResponse(responseCode = "409", description = "CONFLICT"),
            @ApiResponse(responseCode = "200", description = "OK")})
    ResponseEntity calculateBasicSum(
            @Parameter(description = "First value to be informed") @PathParam("{firstValue}") Long firstValue,
            @Parameter(description = "Second value to be informed") @PathParam("{secondValue}") Long secondValue);
}

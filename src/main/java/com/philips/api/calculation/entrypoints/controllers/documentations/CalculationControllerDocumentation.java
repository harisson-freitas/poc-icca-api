package com.philips.api.calculation.entrypoints.controllers.documentations;

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
 * Controller documentation of Calculation
 * API version v1/0.0.1
 * */

@Tag(name = "Calculation", description = "Calculation manipulation resource")
public interface CalculationControllerDocumentation {

    @Operation(summary = "Calculation IMC", description = "Perform IMC calculation - body mass index", tags = {"imc"})
    @ApiResponses({@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR"),
            @ApiResponse(responseCode = "409", description = "CONFLICT"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "200", description = "OK")})
    ResponseEntity calculateImc(
            @Parameter(description = "height value to be informed ") @PathParam("{height}") Double height,
            @Parameter(description = "weight value to be informed ") @PathParam("{weight}") Double weight);
}

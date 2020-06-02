package com.philips.api.calculation.infrastructure.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 12:44
 **/
public interface HelperHandler {
    default ResponseEntity<Object> createReturn(String message, HttpStatus httpStatus) {
        return new ResponseEntity<>(new HandlerResponse(message), httpStatus);
    }
}

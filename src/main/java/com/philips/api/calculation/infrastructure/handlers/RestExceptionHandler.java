package com.philips.api.calculation.infrastructure.handlers;

import com.philips.api.calculation.infrastructure.exceptions.ConflictException;
import com.philips.api.calculation.infrastructure.exceptions.RpcConnectionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 12:50
 **/
@ControllerAdvice
@RestController
public class RestExceptionHandler extends ResponseEntityExceptionHandler implements HelperHandler {

    @ExceptionHandler(RpcConnectionException.class)
    public final ResponseEntity<Object> handleInternalServerError(RuntimeException ex) {
        return createReturn(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ConflictException.class)
    public final ResponseEntity<Object> handleConflict(RuntimeException ex) {
        return createReturn(ex.getMessage(), HttpStatus.CONFLICT);
    }
}

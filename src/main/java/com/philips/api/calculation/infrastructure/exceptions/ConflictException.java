package com.philips.api.calculation.infrastructure.exceptions;

import com.philips.api.calculation.Components.messages.MessagesComponent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 22:42
 **/
@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException{
    public ConflictException() {
        super(MessagesComponent.get("numberNotZeroOrNotNull.clientError.exception"));
    }
}

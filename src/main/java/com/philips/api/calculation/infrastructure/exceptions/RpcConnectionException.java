package com.philips.api.calculation.infrastructure.exceptions;

import com.philips.api.calculation.Components.messages.MessagesComponent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 13:08
 **/
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class RpcConnectionException  extends RuntimeException {
    public RpcConnectionException() {
        super(MessagesComponent.get("grpc.internalServerError.exception"));
    }
}

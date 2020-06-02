package com.philips.api.calculation.entrypoints.clients.grpc.stubs;

import com.philips.api.calculation.CalculationImcServiceGrpc;
import com.philips.api.calculation.CalculationImcServiceGrpc.CalculationImcServiceBlockingStub;
import io.grpc.ManagedChannel;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 27/05/20 - 16:29
 **/
@Component
public class CalculationImcStub {

    public CalculationImcServiceBlockingStub create(ManagedChannel channel) {
        return CalculationImcServiceGrpc
                .newBlockingStub(channel);
    }
}

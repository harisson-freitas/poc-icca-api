package com.philips.api.calculation.entrypoints.clients.grpc.protos.consumers;

import com.philips.api.calculation.CalculationImc;
import com.philips.api.calculation.CalculationImcRequest;
import com.philips.api.calculation.CalculationImcResponse;
import com.philips.api.calculation.CalculationImcServiceGrpc;
import com.philips.api.calculation.entrypoints.clients.grpc.channels.CalculationChannel;
import com.philips.api.calculation.entrypoints.dto.CalculationImcInDto;
import io.grpc.ManagedChannel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 27/05/20 - 16:03
 **/
@AllArgsConstructor
@Component
public class CalculationImcConsumer {

    private CalculationChannel channel;

    public CalculationImcResponse getResponse(CalculationImcInDto inDto) {
        CalculationImcServiceGrpc.CalculationImcServiceBlockingStub stub = CalculationImcServiceGrpc
                .newBlockingStub(channel.managedChannel());


        return stub.calculation(CalculationImcRequest.newBuilder().build());
    }


}

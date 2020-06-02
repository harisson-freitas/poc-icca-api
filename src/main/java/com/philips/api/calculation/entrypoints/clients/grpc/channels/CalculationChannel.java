package com.philips.api.calculation.entrypoints.clients.grpc.channels;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 27/05/20 - 15:34
 **/
@Component
public class CalculationChannel {

    public ManagedChannel managedChannel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 5000)
                .usePlaintext()
                .build();
    }

    public void shutDownChannel(ManagedChannel channel) {
        channel.shutdown();
    }
}

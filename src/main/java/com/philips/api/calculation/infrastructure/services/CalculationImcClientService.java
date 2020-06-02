package com.philips.api.calculation.infrastructure.services;

import com.philips.api.calculation.CalculationImc;
import com.philips.api.calculation.CalculationImcRequest;
import com.philips.api.calculation.CalculationImcResponse;
import com.philips.api.calculation.Components.Utils.ValidateNumber;
import com.philips.api.calculation.entrypoints.clients.grpc.channels.CalculationChannel;
import com.philips.api.calculation.entrypoints.clients.grpc.stubs.CalculationImcStub;
import com.philips.api.calculation.entrypoints.dto.CalculationImcInDto;
import com.philips.api.calculation.entrypoints.dto.CalculationImcOutDto;
import com.philips.api.calculation.infrastructure.exceptions.RpcConnectionException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 26/05/20 - 16:44
 **/
@AllArgsConstructor
@Slf4j
@Service
public class CalculationImcClientService {

    private final CalculationChannel channel;
    private final CalculationImcStub stub;

    public Optional<CalculationImcOutDto> calculateImc(CalculationImcInDto inDto) {

        ValidateNumber.validateNotZeroOrNotNullDoubleValue(inDto.getHeight());
        ValidateNumber.validateNotZeroOrNotNullDoubleValue(inDto.getWeight());

        CalculationImcResponse response = getResponse(createMessageProto(inDto));

        log.info("Result: " + response.getResult() + " " + "Mensagem: " +
                response.getMessage());

        return Optional.of(CalculationImcOutDto.builder()
                .result(response.getResult())
                .message(response.getMessage())
                .build());
    }

    private CalculationImcResponse getResponse(CalculationImc calculationImc) {
        try{
            return stub.create(channel.managedChannel())
                    .calculation(CalculationImcRequest
                            .newBuilder()
                            .setCalc(calculationImc)
                            .build());
        } catch (Exception e) {
            throw new RpcConnectionException();
        }
    }

    private CalculationImc createMessageProto(CalculationImcInDto inDto) {
        return CalculationImc.newBuilder()
                .setHeight(inDto.getHeight())
                .setWeight(inDto.getWeight())
                .build();
    }
}

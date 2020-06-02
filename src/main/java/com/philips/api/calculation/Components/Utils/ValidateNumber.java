package com.philips.api.calculation.Components.Utils;

import com.philips.api.calculation.infrastructure.exceptions.ConflictException;
import lombok.experimental.UtilityClass;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 22:24
 **/
@UtilityClass
public class ValidateNumber {

    public void validateNotZeroOrNotNullDoubleValue(Double value) {
        if(value < 1) throw new ConflictException();
    }
}

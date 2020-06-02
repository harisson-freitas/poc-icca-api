package com.philips.api.calculation.Components.messages;

import com.philips.api.calculation.infrastructure.configurations.messages.MessagesConfiguration;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 14:37
 **/
@Component
public class MessagesComponent {

    private static MessagesConfiguration messages;

    private MessagesComponent() {}

    public static void setMessages(MessagesConfiguration messages) {
        MessagesComponent.messages = messages;
    }

    public static String get(String code) {
        return messages.get(code);
    }
}

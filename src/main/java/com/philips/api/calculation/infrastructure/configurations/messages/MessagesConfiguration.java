package com.philips.api.calculation.infrastructure.configurations.messages;

import com.philips.api.calculation.Components.messages.MessagesComponent;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;

import javax.annotation.PostConstruct;

/**
 * @author <a href="mailto:harisson.freitas@gmail.com">Harisson Freitas∴</a>
 * @project calculation
 * @since 01/06/20 - 14:34
 **/
@Configuration
public class MessagesConfiguration {

    private final MessageSource messageSource;
    private MessageSourceAccessor accessor;


    public MessagesConfiguration(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @PostConstruct
    private void init() {
        accessor = new MessageSourceAccessor(messageSource);
        MessagesComponent.setMessages(this);
    }

    public String get(String code) {
        return accessor.getMessage(code);
    }
}

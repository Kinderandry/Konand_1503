package com.it.messages;

import com.it.utils.QAUtils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MessagesFactory {


    public static Message getRandomMessage(String address) {
        String subject = Stream.generate(() ->
                QAUtils.getRandomString(10))
                .limit(1)
                .collect(Collectors.joining());
        String body = Stream.generate(() ->
                QAUtils.getRandomString(50))
                .limit(5)
                .collect(Collectors.joining());
        return new Message(address, subject, body);
    }
}

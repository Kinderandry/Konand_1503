package com.it.messages;
import java.util.Objects;

public class Message {
    public String address;
    public String subject;
    public String body;

    public Message(String address, String subject, String body) {
        this.address = address;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(address, message.address) &&
                Objects.equals(subject, message.subject) &&
                Objects.equals(body, message.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, subject, body);
    }
}

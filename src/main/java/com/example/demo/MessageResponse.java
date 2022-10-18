package com.example.demo;

import java.util.Objects;

public class MessageResponse {
    private String msg;
    public MessageResponse(String s) {
        this.msg=s;
    }

    public MessageResponse() {
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "msg='" + msg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageResponse that = (MessageResponse) o;
        return Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

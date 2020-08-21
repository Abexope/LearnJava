package com.Abe02.FunctionalProgramming;

@FunctionalInterface
public interface MessageBuilder {
    // 定义一个凭借消息的抽象方法，返回被拼接的消息
    String buildMessage();
}

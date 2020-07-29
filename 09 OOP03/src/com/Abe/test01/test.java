package com.Abe.test01;

public class test {

    public static void main(String[] args) {
        Boy boy = new Boy(30, "鹿晗");
        Girl girl = new Girl("关晓彤", 100);

        girl.love(boy);
        girl.chatMom();
    }

}

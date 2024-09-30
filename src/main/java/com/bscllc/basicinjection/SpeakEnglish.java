package com.bscllc.basicinjection;

public class SpeakEnglish implements Speak {
    @Override
    public String sayHi() {
        return "Hello";
    }

    @Override
    public String sayBye() {
        return "Goodbye";
    }

    @Override
    public String language() {
        return "English";
    }
}

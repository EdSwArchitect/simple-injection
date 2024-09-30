package com.bscllc.basicinjection;

public class SpeakCreole implements Speak {

    public SpeakCreole() {

    }

    @Override
    public String sayHi() {
        return "Wah gwaan";
    }

    @Override
    public String sayBye() {
        return "Walk gud";
    }

    @Override
    public String language() {
        return "Jamaican Patois";
    }
}

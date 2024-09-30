package com.bscllc;

import com.bscllc.basicinjection.Speak;
import com.bscllc.basicinjection.SpeakEnglish;

/**
 * This form of injection uses setting the attribute at construction time
 */
public class SimpleIngection {
    private Speak language;

    public SimpleIngection(Speak language) {
        this.language = language;
    }

    public String salutation() {
        return language.sayHi();
    }

    public String weOut() {
        return language.sayBye();
    }

    public static void main(String args[]) {
        System.out.println("Simple injection using a constructor");

        SpeakEnglish english  = new SpeakEnglish();

        SimpleIngection simpleIngection = new SimpleIngection(english);

        System.out.println(simpleIngection.salutation());

        System.out.println(simpleIngection.weOut());
    }
}

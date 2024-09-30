package com.bscllc;

import com.bscllc.basicinjection.Speak;
import com.bscllc.basicinjection.SpeakCreole;
import com.bscllc.basicinjection.SpeakEnglish;

/**
 * This form of injection uses setting the attribute with a setter
 */
public class SimpleSetterIngection {
    private Speak language;

    public SimpleSetterIngection() {

    }

    public void setLanguage(Speak language) {
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

        SpeakCreole patois  = new SpeakCreole();
        SimpleSetterIngection simpleIngection = new SimpleSetterIngection();
        simpleIngection.setLanguage(patois);

        System.out.println(simpleIngection.salutation());

        System.out.println(simpleIngection.weOut());
    }
}

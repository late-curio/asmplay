package com.baeldung.examples.asm.instrumentation;

import asm.lib.Library;
import com.baeldung.examples.asm.CustomClassWriter;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author baeldung
 */
public class Premain {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Premain!!!");
        inst.addTransformer((l, name, c, d, b) -> {
            if (!name.startsWith("java") && !name.startsWith("sun") && !name.startsWith("jdk")) {
                System.out.println("Got " + name);
                //System.out.println(Arrays.toString(b));
                CustomClassWriter cr = new CustomClassWriter(b);
                System.out.println("Adding field...");
                return cr.addField();
            }
            return b;
        });
        System.out.println("After Premain!!!");
    }

}

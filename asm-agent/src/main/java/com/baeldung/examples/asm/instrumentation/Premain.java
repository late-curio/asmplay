package com.baeldung.examples.asm.instrumentation;

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

        Arrays.stream(Integer.class.getDeclaredFields())
                        .forEach((field) -> System.out.println(field.getName()));

        inst.addTransformer(new ClassFileTransformer() {

            @Override
            public byte[] transform(ClassLoader l, String name, Class c,
                    ProtectionDomain d, byte[] b)
                    throws IllegalClassFormatException {
                System.out.println("Got " + name);
                if (name.equals("java/lang/Integer")) {
                    System.out.println("Got Integer!");
                    CustomClassWriter cr = new CustomClassWriter(b);
                    return cr.addField();
                }
                return b;
            }
        });
        System.out.println("After Premain!!!");
        Arrays.stream(Integer.class.getDeclaredFields())
                .forEach((field) -> System.out.println(field.getName()));
    }

}

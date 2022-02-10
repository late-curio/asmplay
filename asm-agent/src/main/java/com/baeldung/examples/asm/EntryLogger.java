package com.baeldung.examples.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class EntryLogger extends ClassVisitor {

    private String className;

    public EntryLogger(ClassWriter writer,
                       String className) {
        super(Opcodes.ASM5, writer);
        this.className = className;
    }
}

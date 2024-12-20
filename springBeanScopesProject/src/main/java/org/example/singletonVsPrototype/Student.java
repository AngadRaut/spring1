package org.example.singletonVsPrototype;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Student {
    public Student(){
        System.out.println("student class default constructor");
    }
}

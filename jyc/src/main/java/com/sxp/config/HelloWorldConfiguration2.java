package com.sxp.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;

public class HelloWorldConfiguration2 implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> list = SpringFactoriesLoader.loadFactoryNames(HelloWorldConfiguration2.class,null);
        for (String str: list
             ) {
            System.out.println(str);
        }
        return list != null ? (String[]) list.toArray() : null;
    }
}

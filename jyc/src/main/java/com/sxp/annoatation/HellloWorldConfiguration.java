package com.sxp.annoatation;

import com.sxp.config.HelloWorldConfig;
import com.sxp.config.HelloWorldConfiguration2;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(HelloWorldConfiguration2.class)
public @interface HellloWorldConfiguration {
}

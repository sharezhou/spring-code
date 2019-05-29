package com.sgsino.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: zterry
 * @date: 2019/2/25 上午10:20
 * @description:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EMRequestMapping {
    String value() default "";
}

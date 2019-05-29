package com.sgsino.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: zterry
 * @date: 2019/2/25 上午10:20
 * @description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EMController {
    String value() default "";
}

package com.sgsino.springmvc.framework.annotation;

import java.lang.annotation.*;

/**
 * @author: zterry
 * @date: 2019/2/25 上午10:21
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EMResponseBody {
}

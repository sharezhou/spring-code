package com.sgsino.springmvc.demo.controller;

import com.sgsino.springmvc.demo.service.INamedService;
import com.sgsino.springmvc.demo.service.IService;
import com.sgsino.springmvc.framework.annotation.EMController;
import com.sgsino.springmvc.framework.annotation.EMRequestMapping;
import com.sgsino.springmvc.framework.annotation.EMRequestParam;
import com.sgsino.springmvc.framework.annotation.EMAutowired;
import com.sgsino.springmvc.framework.servlet.EModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zterry
 * @date: 2019/2/25 上午10:48
 * @description:
 */
@EMController
@EMRequestMapping("/web")
public class FirstController {

    @EMAutowired
    private IService service;

    @EMAutowired private INamedService namedService;

    @EMRequestMapping("/query/.*.json")
//    @EMResponseBody
    public EModelAndView query(HttpServletRequest request, HttpServletResponse response,
                               @EMRequestParam("name") String name,
                               @EMRequestParam("addr") @Deprecated String addr) {
//        out(response, "get params name =" + name);
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", name);
        model.put("addr", addr);
        return new EModelAndView("first.emml", model);
    }

    @EMRequestMapping("/add.json")
//    @EMResponseBody
    public EModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        out(response, "this is json str");
        return null;
    }

    public void out(HttpServletResponse response, String str) {
        try {
            response.getWriter().write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

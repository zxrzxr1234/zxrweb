package com.zxr.componemt;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        System.out.println("11111111111111111111AAA");
        Locale locale = httpServletRequest.getLocale();
        if(!StringUtils.isEmpty(locale)){
            String[] param = httpServletRequest.getParameter("locale").split("_");
            locale =new Locale(param[0],param[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}

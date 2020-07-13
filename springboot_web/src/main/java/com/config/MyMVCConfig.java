package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//如果要扩展springmvc，官方建议我们这样去做！
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    //视图跳转

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/t").setViewName("test");
    }
}

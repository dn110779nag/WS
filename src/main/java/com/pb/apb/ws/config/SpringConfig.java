/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.apb.ws.config;

import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author Новомлинов Александр
 */
@EnableWebMvc
@ComponentScan(basePackages = {"com.pb.apb.ws.config.spring"})
//@Import(WsConfig.class)
public class SpringConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("classpath:/resources/").setCachePeriod(31556926);
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
//    @Bean
//    public ViewResolver addViewResolverResolver(){
//        InternalResourceViewResolver res = new InternalResourceViewResolver();
//        res.setPrefix("WEB-INF/jsp");
//        res.setSuffix(".jsp");
//        return res;
//    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setPrefix("WEB-INF/jsp/");
        res.setSuffix(".jsp");
        registry.viewResolver(res);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //super.configureMessageConverters(converters); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}

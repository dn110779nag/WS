/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.apb.ws.config;

import javax.servlet.Filter;
import javax.servlet.ServletRegistration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Новомлинов Александр
 */
public class AppWebApplicationInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer{
    
    	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringConfig.class };
                //return new Class[] { WsConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

//	@Override
//	protected Filter[] getServletFilters() {
//		return new Filter[] { new HiddenHttpMethodFilter() };
//	}
        
        @Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		registration.setInitParameter("dispatchOptionsRequest", "true");
	}
}

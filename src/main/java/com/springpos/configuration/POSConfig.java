/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class POSConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    static {
        System.out.println("POSConfig.static initializer");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

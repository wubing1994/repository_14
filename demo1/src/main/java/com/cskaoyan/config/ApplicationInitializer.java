package com.cskaoyan.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*替代web.xml*/
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*加载Spring容器的配置类*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /*加载SpringMVC容器的配置类*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /*配置servlet-mapping*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

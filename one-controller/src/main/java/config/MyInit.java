package config;/**
 * @author: fs
 * @create: 2019/11/24 20:01
 */

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @program spring-text-one
 * @description:
 * @author: fs
 * @create: 2019/11/24 20:01
 */
//public class MyInit implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext configWebApplicationContext =
//                new AnnotationConfigWebApplicationContext();
//        configWebApplicationContext.register();
//
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(configWebApplicationContext);
//        ServletRegistration.Dynamic registration = servletContext.addServlet("fs",dispatcherServlet);
//        registration.addMapping("/");
//    }
//}

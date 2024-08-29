package com.rookie.bigdata.springframework;

import com.rookie.bigdata.springframework.config.RootConfig;
import com.rookie.bigdata.springframework.config.WebConfig;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @Author rookie
 * @Description https://segmentfault.com/a/1190000044224716
 * @Date 2024/8/29 22:49
 * @Version 1.0
 */
public class JettyServerApplication {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();

        // 服务器根目录，类似于tomcat部署的项目。 完整的访问路径为ip:port/contextPath/realRequestMapping
        //ip:port/项目路径/api请求路径
        handler.setContextPath("/");

        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(WebConfig.class);
        applicationContext.register(RootConfig.class);

        //相当于web.xml中配置的ContextLoaderListener
        handler.addEventListener(new ContextLoaderListener(applicationContext));

        //springmvc拦截规则 相当于web.xml中配置的DispatcherServlet
        handler.addServlet(new ServletHolder(new DispatcherServlet(applicationContext)), "/*");

        server.setHandler(handler);
        server.start();
        server.join();
    }


//
//        private static String CONTEXT_PATH = "/";
//
//        private static String MAPPING_URL  = "/*";
//
//        public static void main(String[] args) throws Exception {
//            Server server = new Server();
//            ServerConnector connector = new ServerConnector(server);
//            connector.setPort(8090);
//            server.setConnectors(new Connector[] { connector });
//
//            WebAppContext context = new WebAppContext();
//            ServletContextHandler handler = servletContextHandler(webApplicationContext());
//
//            server.setHandler(handler);
//            // 启动
//            server.start();
//            // 打印dump时的信息
//            System.out.println(server.dump());
//            // join当前线程
//            server.join();
//        }
//
//        private static ServletContextHandler servletContextHandler(WebApplicationContext context) {
//            ServletContextHandler handler = new ServletContextHandler();
//            handler.setContextPath(CONTEXT_PATH);
//            DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
//
//
//
//            handler.addServlet(new ServletHolder(DispatcherServlet.class), MAPPING_URL);
//            handler.addEventListener(new ContextLoaderListener(context));
//            return handler;
//        }
//
//        private static WebApplicationContext webApplicationContext() {
//            AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//            context.register(MvcConfig.class);
//            return context;
//        }








}

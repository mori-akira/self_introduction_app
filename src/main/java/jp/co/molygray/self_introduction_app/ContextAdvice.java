package jp.co.molygray.self_introduction_app;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextAdvice implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
	try {
	    Class.forName("jp.co.molygray.self_introduction_app.config.DBConfig");
	} catch (Exception ex) {
	    System.err.println("failed to initialize context");
	    ex.printStackTrace();
	}
    }
}

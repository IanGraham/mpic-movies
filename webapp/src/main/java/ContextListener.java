import config.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.lang.invoke.MethodHandles;

/**
 * Created by vitaly on 3/16/14.
 */
public class ContextListener implements ServletContextListener {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("load config");

        log.info(Configuration.DB.toString());
        log.info(Configuration.OAUTH.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("context destroyed");
    }
}
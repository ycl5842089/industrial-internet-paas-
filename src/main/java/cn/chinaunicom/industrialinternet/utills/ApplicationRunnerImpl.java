package cn.chinaunicom.industrialinternet.utills;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 控制打印台的启动信息
 */

@Component
//可灵活配置不配置默认优先读取 application.properties
//@PropertySource("classpath:mail.properties")
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Value("${server.port}")
    private String serverPort;

    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String url = "http://localhost:"+serverPort+"/battery/welcome";
        logger.info("项目启动成功！！！");
        logger.info(url);

    }
}
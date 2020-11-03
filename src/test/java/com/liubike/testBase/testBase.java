package com.liubike.testBase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.util.Properties;

public class testBase{

    private static org.apache.log4j.Logger logger = Logger.getLogger(testBase.class);

    @BeforeTest
    public void beforeTest(){

        logger.info("=== 功 能 模 块 开 始 执 行 ！！");
    }

    @AfterTest
    public void afterTest(){

        logger.info("=== 功 能 模 块 执 行 结 束 ！！");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.setProperty("env","sit");
        System.setProperty("ip", "http://localhost:8086");
        System.setProperty("project","pms");
    }

    public Properties loadFromEnvProperties(String propFileName) {
        Properties prop = null;
        String path = testBase.class.getClassLoader().getResource(propFileName).getPath();
        //String path = System.getProperty("src\\test\\resources\\iInterface.properties");

        //读入envProperties属性文件
        try {
            prop = new Properties();
            InputStream in = new BufferedInputStream(
                    new FileInputStream(path));
            prop.load(in);
            in.close();
        } catch (IOException ioex) {
            logger.error("配置文件加载失败，请检查 " + path + "文件是否存在！");
        }
        return prop;
    }

    public static void main(String[] args) {

    }
}

package org.easyerp.common.util;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public class MyBatisGeneratorUtils {

    public static void main(String[] args) {
        System.out.println("start...........................");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //读取配置文件
        File configFile = new File(MyBatisGeneratorUtils.class.getResource("/generatorConfig.xml").getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config;
        try {
            config = cp.parseConfiguration(configFile);

            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator;
            try {
                myBatisGenerator = new MyBatisGenerator(config, callback,
                        warnings);
                myBatisGenerator.generate(null);

                //打印结果,打印出打印失败的
                for(String str : warnings){
                    System.out.println(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        System.out.println("end...........................");
    }
}

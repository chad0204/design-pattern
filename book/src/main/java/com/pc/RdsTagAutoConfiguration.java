package com.pc;

import com.youzan.rds.tag.interceptor.MybatisInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import java.util.Map;

@Slf4j
@Configuration
@EnableConfigurationProperties(RdsTagProperties.class)
public class RdsTagAutoConfiguration implements ApplicationContextAware {

    private final RdsTagProperties rdsTagProperties;

    public RdsTagAutoConfiguration(RdsTagProperties rdsTagProperties) {
        this.rdsTagProperties = rdsTagProperties;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (!rdsTagProperties.isEnabled()) {
            return;
        }

        try {
            //noinspection unchecked
            Class<SqlSessionFactory> clazz = (Class<SqlSessionFactory>) Class.forName(SqlSessionFactory.class.getName());
            Map<String, SqlSessionFactory> sqlSessionFactoryMap = applicationContext.getBeansOfType(clazz);
            if (!sqlSessionFactoryMap.isEmpty()) {
                MybatisInterceptor mybatisInterceptor = new MybatisInterceptor();
                for (SqlSessionFactory ssf : sqlSessionFactoryMap.values()) {
                    ssf.getConfiguration().addInterceptor(mybatisInterceptor);
                }
            }
        } catch (Throwable t) {
//            log.warn("This application do not have SqlSessionFactory, do not config HotUpdateInterceptor");
        }
    }
}

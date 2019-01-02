package com.lmz.hc.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: Scarecrow
 * Date: 2018/11/6
 * Time: 12:20
 * Description:
 */
@Configuration
@MapperScan("com.lmz.hc.mapper")
public class MybatisConfig {

    /***
     * plus 的性能优化及调试
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        //SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长
        performanceInterceptor.setMaxTime(1000);
        //SQL是否格式化 默认false
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
//        page.setLocalPage(true);//自动识别数据库类型
        return page;
    }


    //配置的是mybatis plus的SqlSessionFactoryBean 可以使用yml属性文件配置，也可以使用下面的方法来配置
//    @Bean("sqlSessionFactory")
//    public SqlSessionFactory getFactory(DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource);
//        sqlSessionFactory.setPlugins(new Interceptor[]{paginationInterceptor()});
//
//        MybatisConfiguration configuration = new MybatisConfiguration();
//        configuration.setMapUnderscoreToCamelCase(true);
//        configuration.setJdbcTypeForNull(JdbcType.NULL);
//        configuration.setCacheEnabled(false);
//        // configuration.setLogImpl(Log4j2Impl.class);
//        //configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
//        sqlSessionFactory.setConfiguration(configuration);
//        // 动态获取SqlMapper
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource[] mapperLocations = resolver.getResources("classpath:mapper/*.xml");
//        sqlSessionFactory.setMapperLocations(mapperLocations);
//        //sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*/*Mapper.xml"));
//        //sqlSessionFactory.setGlobalConfig(globalConfiguration());
//        return sqlSessionFactory.getObject();
//    }
}

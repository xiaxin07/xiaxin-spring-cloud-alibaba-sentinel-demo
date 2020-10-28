//package com.xiaxin.config;
//
//import io.seata.rm.datasource.DataSourceProxy;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//import com.alibaba.druid.pool.DruidDataSource;
//
//@Configuration
//public class DataSourceProxyAutoConfiguration {
//    /**
//     * 数据源属性配置
//     * {@link DataSourceProperties}
//     */
//    private DataSourceProperties dataSourceProperties;
//
//    public DataSourceProxyAutoConfiguration(DataSourceProperties dataSourceProperties) {
//        this.dataSourceProperties = dataSourceProperties;
//    }
//
//    /**
//     * 配置数据源代理，用于事务回滚
//     *
//     * @return The default datasource
//     * @see DataSourceProxy
//     */
//    @Primary
//    @Bean("dataSource")
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(dataSourceProperties.getUrl());
//        dataSource.setUsername(dataSourceProperties.getUsername());
//        dataSource.setPassword(dataSourceProperties.getPassword());
//        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
//        return new DataSourceProxy(dataSource);
//    }
//}
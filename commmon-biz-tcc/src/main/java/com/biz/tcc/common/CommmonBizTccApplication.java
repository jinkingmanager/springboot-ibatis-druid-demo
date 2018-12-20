package com.biz.tcc.common;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@ServletComponentScan
public class CommmonBizTccApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommmonBizTccApplication.class, args);
	}


	/**
	 * 数据源配置
	 */

	@Bean("druidDatasource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource druidDataSource() { return new DruidDataSource(); }

}


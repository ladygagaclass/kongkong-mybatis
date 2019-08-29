package com.kongkong.mybatis.config;

import javax.sql.DataSource;
import java.util.Map;

public class Configuration {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}

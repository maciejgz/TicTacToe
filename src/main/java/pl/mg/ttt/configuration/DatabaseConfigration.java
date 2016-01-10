package pl.mg.ttt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by m on 2016-01-10.
 */
@Configuration
public class DatabaseConfigration {


    @Bean(name = "authorizationDatasource")
    public DriverManagerDataSource authorizationDatasource() {

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/tictactoe");
        driverManagerDataSource.setUsername("admin");
        driverManagerDataSource.setPassword("qaz123");
        return driverManagerDataSource;
    }

}
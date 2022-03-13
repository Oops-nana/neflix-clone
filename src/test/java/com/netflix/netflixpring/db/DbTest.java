package com.netflix.netflixpring.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.assertj.core.api.Fail.fail;

@DataJpaTest
public class DbTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void dbTest() throws SQLException {
        try(Connection connection = dataSource.getConnection()){
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE TESTTABLE( ID INTEGER NOT NULL, VALUE VARCHAR(255), PRIMARY KEY (ID) )";
            statement.execute(sql);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

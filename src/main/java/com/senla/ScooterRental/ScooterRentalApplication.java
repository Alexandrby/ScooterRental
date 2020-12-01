package com.senla.ScooterRental;

import liquibase.database.jvm.JdbcConnection;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class ScooterRentalApplication {

	public ScooterRentalApplication() throws SQLException {
	}

	public static void main(String[] args) {
		SpringApplication.run(ScooterRentalApplication.class, args);
	}
	StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
	MetadataSources metaDataSrc = new MetadataSources(reg);

	// Get database connection
	Connection con = metaDataSrc.getServiceRegistry().getService(ConnectionProvider.class).getConnection();
	JdbcConnection jdbcCon = new JdbcConnection(con);
}

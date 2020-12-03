

import com.mysql.cj.jdbc.JdbcConnection;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.relational.Database;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.Connection;
import java.sql.SQLException;

@EnableTransactionManagement
@EntityScan ("com.senla.entity")
@SpringBootApplication(scanBasePackages = {"com.senla","com.senla.repos",
		"com.senla.controllers", "com.senla.dto", "com.senla.services"}, exclude = JpaRepositoriesAutoConfiguration.class)
public class ScooterRentalApplication {

	public ScooterRentalApplication() throws SQLException {
	}

	public static void main(String[] args) {
		SpringApplication.run(ScooterRentalApplication.class, args);
	}
	StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
	MetadataSources metaDataSrc = new MetadataSources(reg);





}

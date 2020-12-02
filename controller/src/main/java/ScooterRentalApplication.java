
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.senla")
public class ScooterRentalApplication {

	public ScooterRentalApplication()  {
	}

	public static void main(String[] args) {
		SpringApplication.run(ScooterRentalApplication.class, args);
	}
	/*StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
	MetadataSources metaDataSrc = new MetadataSources(reg);

	// Get database connection
	Connection con = metaDataSrc.getServiceRegistry().getService(ConnectionProvider.class).getConnection();
	JdbcConnection jdbcCon = new JdbcConnection(con);*/
}

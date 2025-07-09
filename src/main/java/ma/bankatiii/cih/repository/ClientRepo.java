package ma.bankatiii.cih.repository;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {


}

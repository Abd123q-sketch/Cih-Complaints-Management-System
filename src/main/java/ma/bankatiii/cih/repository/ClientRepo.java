package ma.bankatiii.cih.repository;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import ma.bankatiii.cih.models.clients;

public interface ClientRepo extends JpaRepository<clients, Long> {


}

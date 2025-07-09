package ma.bankatiii.cih.repository;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import ma.bankatiii.cih.models.groupe;

public interface GroupeRepo extends JpaRepository<groupe, Long > {


}

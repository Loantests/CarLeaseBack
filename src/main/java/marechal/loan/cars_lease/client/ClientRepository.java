package marechal.loan.cars_lease.client;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>{
	Optional<Client> findByFnameAndLname(String fname, String lname);
}

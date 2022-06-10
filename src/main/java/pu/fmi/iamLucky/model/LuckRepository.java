package pu.fmi.iamLucky.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuckRepository extends JpaRepository<Luck, Long>{

}

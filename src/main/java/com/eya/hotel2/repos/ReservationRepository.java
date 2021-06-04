package com.eya.hotel2.repos;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eya.hotel2.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	
	
	@Query(value = "select count(r.num_chambre=:chambreNum) from reservation r where r.date_debut<=:datedebut and r.date_fin>= :datedebut", nativeQuery = true)
	Long getAllBetweenDates(@Param("chambreNum") Long numChambre,@Param("datedebut") Date date_debut );
	

}

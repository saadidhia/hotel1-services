package com.eya.hotel2.service;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.hotel2.entities.Reservation;
import com.eya.hotel2.repos.ReservationRepository;



@Service

public class ReservationService {
        

	@Autowired
	private ReservationRepository reservationRepository;
	
	public String saveReservation(Reservation reservation) {
		Long chambreRsrv = reservationRepository.getAllBetweenDates(reservation.getNumChambre(),reservation.getDateDebut());
		
        if (chambreRsrv!=0) {
        	return  "Le nombre de la chambre existe déja";
        }
         reservationRepository.save(reservation);
         return "Réservation enregistrer avec succès";
	}
	public List<Reservation> getAllReservations() {
		return reservationRepository.findAll();
	}


	public Optional<Reservation> getReservationsById(Long id) {
		return reservationRepository.findById(id);
	}
  
	public Reservation updateReservation(Reservation reservation) {
	   Reservation resv=reservationRepository.findById(reservation.getIdResrv()).orElse(null);
	   resv.setDateDebut(reservation.getDateDebut());
	   resv.setDateFin(reservation.getDateFin());
	   resv.setNumChambre(reservation.getNumChambre());
	   resv.setClient(reservation.getClient());
	   return reservationRepository.save(reservation);
	}

	public String deleteReservation(Long id) {
		 reservationRepository.deleteById(id);
		 return "La reservation"+" "+id+" "+"est supprimée avec succès";
	}


	public String deleteAllReservation(Reservation reservation) {
		reservationRepository.deleteAll();
		return "Les réservations sont supprimés";
	}


	
	
	
	
	
	
	
	
	
	/* @Autowired
		private RéservationRepository repository;
	
			 public Reservation saveReservation(Reservation reservation) {
			 return repository.save(reservation);
		}



		public Reservation updateReservation(Reservation reservation) {
			Reservation existingReservation =repository.findById(reservation.getIdResrv()).orElse(null);
			existingReservation.setDateDebut(reservation.getDateDebut());
			existingReservation.setDateFin(reservation.getDateFin());
			return repository.save(existingReservation);
		}
		
		public String deleteReservation(long id) {
			repository.deleteById(id);
		return "Reservation supprimé" +id;
		}
		
		public List<Reservation>getReservations() {
			 return repository.findAll();
		}
		
		public Reservation getReservationById(long id) {
			 return repository.findById(id).orElse(null);
		}

      */
}

package com.bits.ss.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.ss.model.Bookings;

@Repository
public interface BookingRepository extends JpaRepository<Bookings, Long> {
	Bookings findBookingsByBookingId(Long id);
	
}

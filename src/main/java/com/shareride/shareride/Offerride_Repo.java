package com.shareride.shareride;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Offerride_Repo extends JpaRepository<OfferRide_Pojo, Long> {
	// @Query(value="SELECT * FROM OfferRide_Pojo p WHERE p.source=?1 AND
	// destination=?2")
	// List<OfferRide_Pojo> findBySourceDest(String source,String destination);
	/*@Query(value = "SELECT * FROM Offer_Ride_Pojo ", nativeQuery = true)
	List<OfferRide_Pojo> findBySourceDest();*/


	@Query("select u from OfferRide_Pojo u where u.source = :source and u.destination = :destination")
	List<OfferRide_Pojo> findBySourceDest(@Param("source") String source,
            @Param("destination") String destination);
	}


package com.duing.repository;

import com.duing.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GuestRepository extends JpaRepository<Guest,Long> {
    //public Optional<Guest> findById(Long userId);
}

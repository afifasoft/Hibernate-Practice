package com.cloudsoftware.association.repository;

import com.cloudsoftware.association.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

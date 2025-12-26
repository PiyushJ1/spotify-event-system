package com.piyush.spotify_event_system.repo;

import com.piyush.spotify_event_system.model.ListeningEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ListeningEventRepo extends JpaRepository<ListeningEvent, UUID> {
    // db functions are handled automatically
}

package com.piyush.spotify_event_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "listening_events")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListeningEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "track_id", nullable = false)
    private String trackId;

    private String trackName;
    private String artistName;
    private String albumName;

    @Column(nullable = false)
    private LocalDateTime playedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}


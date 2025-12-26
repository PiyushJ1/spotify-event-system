package com.piyush.spotify_event_system.dto;

import java.time.LocalDateTime;
import java.util.UUID;

// data transfer object sent to kafka as a JSON packet
public record SpotifyEvent(
    UUID userId,
    String trackId,
    String trackName,
    String artistName,
    String albumName,
    LocalDateTime playedAt
) {}

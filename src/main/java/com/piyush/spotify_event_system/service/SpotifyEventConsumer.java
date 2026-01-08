package com.piyush.spotify_event_system.service;

import com.piyush.spotify_event_system.dto.SpotifyEvent;
import com.piyush.spotify_event_system.model.ListeningEvent;
import com.piyush.spotify_event_system.repo.ListeningEventRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpotifyEventConsumer {
    private final ListeningEventRepo repo;

    @KafkaListener(topics = "spotify-listening-events", groupId = "spotify-analytics-group")
    public void consume(SpotifyEvent event) {
        System.out.println("event received from Kafka: " + event.trackName());

        ListeningEvent entity = ListeningEvent.builder()
                .userId(event.userId())
                .trackId(event.trackId())
                .trackName(event.trackName())
                .artistName(event.artistName())
                .albumName(event.albumName())
                .playedAt(event.playedAt())
                .build();

        repo.save(entity);
        System.out.println("saved event to db: " + entity.getId());
    }
}

package com.piyush.spotify_event_system.service;

import com.piyush.spotify_event_system.dto.SpotifyEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpotifyEventProducer {
    private final KafkaTemplate<String, SpotifyEvent> kafkaTemplate;
    private static final String TOPIC = "spotify-listening-events";

    public void sendEvent(SpotifyEvent event) {
        kafkaTemplate.send(TOPIC, event.userId().toString(), event);
        System.out.println("sent event to Kafka: " + event.trackName());
    }
}

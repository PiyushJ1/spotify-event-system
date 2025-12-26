# Spotify Event Analytics Pipeline

**Tech Stack:**  
- Java + Spring Boot  
- Apache Kafka
- PostgreSQL

## Phase 1: Minimum Viable Pipeline

**Goal:**  
Have something that works end-to-end.

**Features:**  
- Simulate Spotify events (user ID, song ID, timestamp, action type like play/pause/skip)  
- Produce events into Kafka topics  
- Simple consumer that counts plays per song or user  
- Store results in a lightweight DB (Postgres or H2 for simplicity)  
- Expose basic REST API to query analytics  

**Deliverable:**  
- A working event pipeline with basic analytics.

---

## Phase 2: Add Realism and Complexity

**Enhancements:**  
- Introduce Kafka partitions and consumer groups to show scalability  
- Handle fault tolerance: retry mechanisms, dead-letter topics  
- Implement windowed aggregations (e.g., plays per user per hour)  
- Add sessionization: group user activity into sessions  

**Deliverable:**  
- Demonstrates understanding of stream processing nuances, reliability, and stateful analytics.

---

## Phase 3: Make It Portfolio-Worthy

**Enhancements:**  
- Add dashboard with charts (React/Angular + Spring Boot API)  
- Include complex metrics: skip rates, top artists per region, trending songs  
- Measure latency, throughput, and resilience under load  
- Optional: add Redis or Cassandra for fast analytics  
- Document scaling strategy, architecture diagram, and rationale for design choices  

**Deliverable:**  
- A project that looks like a real-world system, demonstrating backend skill, system design knowledge, and practical execution.

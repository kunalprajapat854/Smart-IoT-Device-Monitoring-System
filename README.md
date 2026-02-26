# 🚀 Smart IoT Device Monitoring System

A scalable IoT ingestion and monitoring platform built using **Spring Boot**, **MySQL**, and **Docker**, deployed on **AWS EC2**.

This system simulates multiple IoT devices sending real-time telemetry data (temperature, battery, and location), processes it through a backend service, stores it in a database, and generates automated alerts when threshold conditions are breached.

---

## 📌 Project Overview

The Smart IoT Device Monitoring System demonstrates:

- IoT ingestion architecture
- Backend API design
- Real-time alert processing
- Cloud deployment
- Containerized application design
- Scalable system thinking

This project is designed to reflect real-world IoT backend systems used in industries such as drone monitoring, industrial automation, and smart infrastructure.

---

## 🏗 System Architecture

### High-Level Architecture


+----------------------+
| Simulated IoT |
| Devices (N Devices) |
| - Temperature |
| - Battery Level |
| - GPS Location |
+----------+-----------+
|
| HTTP / MQTT
v
+--------------------------+
| Spring Boot Backend |
| - REST Controller |
| - Service Layer |
| - Alert Engine |
+------------+-------------+
|
v
+--------------------------+
| MySQL Database |
| - Device Table |
| - Telemetry Table |
| - Alert Logs |
+------------+-------------+
|
v
+--------------------------+
| Monitoring Dashboard |
| - Device Status |
| - Alerts View |
| - Health Metrics |
+--------------------------+


---

## 🔁 Data Flow

1. IoT devices send telemetry data.
2. Backend receives data via `POST /device/data`.
3. Data is validated and stored in MySQL.
4. Alert engine evaluates threshold conditions.
5. Alerts are generated if:
   - Temperature exceeds limit
   - Battery is below threshold
6. Dashboard fetches data using REST APIs.

---

## ✨ Features

- 📡 Simulated multi-device telemetry ingestion
- 🌡 Real-time temperature monitoring
- 🔋 Battery health tracking
- 📍 GPS location tracking
- 🚨 Automatic alert generation
- 🗄 Persistent storage using MySQL
- 🐳 Dockerized for container deployment
- ☁️ Cloud deployment on AWS EC2
- 📊 REST APIs for dashboard integration

---

## 📡 Core API Endpoint

### POST `/device/data`

### Request Body

```json
{
  "deviceId": "device-101",
  "temperature": 72.5,
  "batteryLevel": 18,
  "latitude": 22.7196,
  "longitude": 75.8577
}
🚨 Alert Rules
Condition	Action
Temperature > 80°C	High Temperature Alert
Battery < 20%	Low Battery Alert
Device inactive > threshold	Offline Alert
🛠 Tech Stack
Backend

Java

Spring Boot

Spring Data JPA

REST APIs

Database

MySQL

DevOps & Cloud

Docker

AWS EC2

Git & GitHub

Optional Enhancements

MQTT Protocol

WebSocket (real-time dashboard updates)

React Frontend

Prometheus & Grafana Monitoring

🚀 Running Locally
1. Clone Repository
git clone https://github.com/yourusername/iot-monitoring-system.git
cd iot-monitoring-system
2. Build Docker Image
docker build -t iot-monitor .
3. Run Container
docker run -p 8080:8080 iot-monitor

Application runs at:

http://localhost:8080
☁️ AWS Deployment Steps

Launch EC2 instance

Install Docker

Clone repository

Build Docker image

Run container

Open port 8080 in Security Group

📊 Real-World Applications

This architecture can be adapted for:

🚁 Drone fleet monitoring

🏭 Industrial equipment monitoring

🚗 Vehicle telemetry systems

🏠 Smart home automation

❄ Cold storage temperature tracking

🏥 Medical device monitoring

📈 Future Improvements

Integrate MQTT broker for real device communication

Implement WebSocket-based live dashboard

Add JWT-based authentication

Deploy using Kubernetes

Add monitoring with Prometheus + Grafana

👨‍💻 Author

Kunal Prajapat
Java Backend Developer | Cloud & DevOps Enthusiast

# 🚀 Smart IoT Device Monitoring System

A scalable IoT ingestion and monitoring platform built using **Spring Boot**, **MySQL**, and **Docker**, deployed on **AWS EC2**.

This system simulates multiple IoT devices sending real-time telemetry data (temperature, battery level, and location), processes it through a backend service, stores it in a database, and generates automated alerts when threshold conditions are breached.

---

## 📌 Project Overview

The **Smart IoT Device Monitoring System** demonstrates:

- IoT ingestion architecture  
- Backend API design  
- Real-time alert processing  
- Cloud deployment  
- Containerized application design  
- Scalable system thinking  

This project reflects real-world IoT backend systems used in drone monitoring, industrial automation, and smart infrastructure.

---

## 🏗 System Architecture

### High-Level Architecture

```text
IoT Devices (Simulated)
    - Temperature
    - Battery Level
    - GPS Location
            │
            │  HTTP / MQTT
            ▼
Spring Boot Backend
    - REST Controller
    - Service Layer
    - Alert Engine
            │
            ▼
MySQL Database
    - Device Table
    - Telemetry Table
    - Alert Logs
            │
            ▼
Monitoring Dashboard
    - Device Status
    - Alerts View
    - Health Metrics




---

## 🔁 Data Flow

1. IoT devices send telemetry data.
2. Backend receives data via `POST /device/data`.
3. Data is validated and stored in MySQL.
4. Alert engine evaluates threshold conditions.
5. Alerts are generated if:
   - Temperature exceeds limit
   - Battery is below threshold.
6. Dashboard fetches data using REST APIs.

---

## ✨ Features

- Simulated multi-device telemetry ingestion
- Real-time temperature monitoring
- Battery health tracking
- GPS location tracking
- Automatic alert generation
- MySQL persistent storage
- Dockerized deployment
- AWS EC2 hosting

---

## 📡 Core API

### POST `/device/data`

Example request:

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
Device inactive	Offline Alert
🛠 Tech Stack

Backend: Java, Spring Boot, REST APIs
Database: MySQL
Cloud: AWS EC2
Containerization: Docker
Version Control: Git & GitHub

🚀 Run Locally
git clone https://github.com/yourusername/iot-monitoring-system.git
cd iot-monitoring-system
docker build -t iot-monitor .
docker run -p 8080:8080 iot-monitor

Application runs at:

http://localhost:8080
☁️ Deployment Steps

Launch EC2 instance

Install Docker

Clone repository

Build Docker image

Run container

Open port 8080

📊 Real-World Applications

Drone fleet monitoring

Industrial equipment monitoring

Vehicle telemetry systems

Smart home automation

Cold storage monitoring

👨‍💻 Author

Kunal Prajapat
Java Backend Developer | Cloud & DevOps Enthusiast

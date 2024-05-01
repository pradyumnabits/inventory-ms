docker run  -p 8081:8081 -e "POSTGRES_URL=192.168.1.5:5432" -e "KAFKA_URL=192.168.1.5:9092" bits/inventory-ms

#!/bin/bash

# Stop the containers 
docker-compose down

# Remove the external network
docker network rm mynetwork

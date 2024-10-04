#!/bin/bash
docker network create mynetwork || true
#building the all images mentioned in docker compose 
docker-compose up -d --build

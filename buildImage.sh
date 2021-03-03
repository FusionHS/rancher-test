#!/usr/bin/env bash

docker build -t gcr.io/fusionhs-web/example/rancher-test-gateway:latest -f src/main/docker/Dockerfile .

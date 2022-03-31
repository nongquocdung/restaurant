#!/bin/sh
mvn clean package
cp ./target/restaurant.war C:/Sun/wildfly-26.0.0.Final/standalone/deployments
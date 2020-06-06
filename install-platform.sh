#!/bin/bash

echo "---------------------"
echo "Installing Petclinic Platform to local maven repository"
echo "---------------------"

cd petclinic-platform
./gradlew install

echo "---------------------"
echo "Petclinic Platform install complete. Dependencies can be used from the application"
echo "---------------------"

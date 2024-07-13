#!/bin/bash

# Define the paths for frontend and backend
FRONTEND_PATH="./Frontend"
BACKEND_PATH="./Backend"

# Update package list and install Node.js and npm
echo "Updating package list and installing Node.js and npm..."
sudo apt-get update
sudo apt-get install -y nodejs npm

# Change directory to frontend, install dependencies
echo "Installing frontend dependencies..."
cd $FRONTEND_PATH
npm install

# Change directory to backend, install dependencies
echo "Installing backend dependencies..."
cd ../$BACKEND_PATH
npm install

echo "Installation of Node.js, npm, and project dependencies completed."
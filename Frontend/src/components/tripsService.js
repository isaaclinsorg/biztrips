import axios from 'axios';
import React from 'react';


export async function getBusinessTrips() {
  const response = await fetch("http://localhost:8080/v1/trips");
  if (response.ok) {
    return response.json();
  }
  throw new Error(`Error ${response.status}: ${await response.text()}`);
}

export async function getUsers() {
  try {
    const response = await fetch("http://localhost:8080/api/users/");
    if (!response.ok) {
      throw new Error(`Error ${response.status}: ${await response.text()}`);
    }
    return await response.json();
  } catch (error) {
    console.error("Failed to fetch users:", error);
    throw error;
  }
}

export async function getWishlistItems() {
  const response = await fetch("http://localhost:8080/v1/trips");
  if (response.ok) {
    return response.json();
  }
  throw new Error(`Error ${response.status}: ${await response.text()}`);
}

export async function getAllTickets () {
  try {
    const response = await axios.get('http://localhost:3000/planes');
        const planesData = response.data;
        console.log(planesData);
    // Verarbeiten Sie die Daten (z. B. speichern Sie sie im Zustand Ihrer Komponente)
  } catch (error) {
    console.error('Fehler beim Abrufen der Daten:', error);
  }
}

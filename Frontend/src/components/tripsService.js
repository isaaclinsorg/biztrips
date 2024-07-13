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

export async function getAllTickets() {
  // Fügen Sie hier die Logik hinzu, um die Ticketdaten abzurufen
  return [
    { id: 1, title: 'Ticket 1', description: 'Beschreibung 1', startTrip: '2024-01-01', endTrip: '2024-01-10' },
    { id: 2, title: 'Ticket 2', description: 'Beschreibung 2', startTrip: '2024-02-01', endTrip: '2024-02-10' },
  ];
}

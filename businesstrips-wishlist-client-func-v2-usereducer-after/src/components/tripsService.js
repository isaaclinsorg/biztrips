export async function getBusinessTrips() {
  const response = await fetch("http://localhost:8080/v1/trips");
  if (response.ok) return response.json();
  throw response;
}
export async function getWishlistItems() {
  // fetch carts from api
  const response = await fetch("http://localhost:8080/v1/trips");
  if (response.ok) return response.json();
  throw response;
}

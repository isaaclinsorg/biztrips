export default function tripsReducer(wishlist, action) {
  switch (action.type) {
    case "empty":
      return [];
    case "add":
      // deconstructing props
      const { id, title, description, startTrip, endTrip } = action.trip;
      const itemInWishlist = wishlist.find((i) => i.id === id);
      if (itemInWishlist) {
        // Return new array with the matching item replaced
        return wishlist.map((i) =>
          i.id === id
            ? {
                ...i,
                title,
                description,
                startTrip,
                endTrip,
              }
            : i
        );
      } else {
        // Return new array with the new item appended
        console.log("appende");
        return [...wishlist, { id, title, description, startTrip, endTrip }];
      }

    case "deleteItem": {
      // deconstructing action
      const { id } = action;

      let newArray = wishlist.slice(0);
      let indexToRemove;
      newArray.some((it, index) => {
        if (it.id === id) {
          indexToRemove = index;
          return true;
        }
        return false;
      });
      newArray.splice(indexToRemove, 1);
      //newArray = newArray.filter((_, i) => i !== indexToRemove);
      return newArray;
    }
    default:
      throw new Error("Unhandled action: " + action.type);
  }
}

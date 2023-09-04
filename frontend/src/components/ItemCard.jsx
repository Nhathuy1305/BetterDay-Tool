import React from "react";
import placeholder from "../assets/400.png";

const ItemCard = ({ image }) => {
  return (
    <div className="image-container">
      <img
        src={image.Poster !== "N/A" ? image.Poster : placeholder}
        alt={image.Title}
      />
    </div>
  );
};

export default ItemCard;

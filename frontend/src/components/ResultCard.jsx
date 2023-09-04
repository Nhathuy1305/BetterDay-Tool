import React, { useContext, useEffect, useState } from "react";
import ItemCard from "./ItemCard";

const API_URL = "http://www.omdbapi.com?apikey=6a9fecfd";

const ResultCard = ({ queries }) => {
  return (
    <div className="right-section-container">
      <h1>This is the result section</h1>
      {queries?.length > 0 ? (
        <div className="img-container">
          {" "}
          {queries.map((query) => (
            <ItemCard image={query} />
          ))}
        </div>
      ) : (
        <div className="empty-container">
          <h2>No movies found</h2>
        </div>
      )}
    </div>
  );
};

export default ResultCard;

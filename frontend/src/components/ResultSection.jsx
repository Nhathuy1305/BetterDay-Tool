import React from "react";
import NotFoundImg from "../assets/400.png";
import "../css/SearchSection.css";

const ResultCard = ({ queries }) => {
  return (
    <div className="container result-card">
      {queries?.length > 0 ? (
        <div className="img-container">
          <div className="img-title">🤖 Generated Product Summary</div>
          <div div className="img-item">
            {" "}
            {queries.map((query) => (
              <img
                src={query.Poster !== "N/A" ? query.Poster : NotFoundImg}
                alt={query.Title}
              />
            ))}
          </div>
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

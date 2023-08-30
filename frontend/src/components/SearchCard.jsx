import React, { useState } from "react";

const SearchCard = () => {
  const [searchTerm, setSearchTerm] = useState([]);

  return (
    <div>
      <h1>This is the search section</h1>
      <div className="search">
        <textarea placeholder="Enter query">{searchTerm}</textarea>
        <button className="generate query">Generate</button>
      </div>
    </div>
  );
};

export default SearchCard;

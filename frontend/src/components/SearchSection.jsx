import React, { useState } from "react";
import ResultCard from "./ResultCard";
import TitleCard from "./TitleCard";

const API_URL = "http://www.omdbapi.com?apikey=6a9fecfd";

const SearchSection = () => {
  const [searchTerm, setSearchTerm] = useState([]);
  const [queries, setQuery] = useState();

  const searchData = async (title) => {
    const reponse = await fetch(`${API_URL}&s=${title}`);
    const data = await reponse.json();

    setQuery(data.Search);
  };

  return (
    <div>
      <TitleCard />
      <h1>This is the search section</h1>
      <div className="search-container">
        <div className="input-container">
          <input
            placeholder="enter query"
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
          ></input>
        </div>
        <button
          className="generate-query"
          onClick={() => {
            searchData(searchTerm);
          }}
        >
          Generate
        </button>
      </div>
      <ResultCard queries={queries} />
    </div>
  );
};

export default SearchSection;

import React, { useState } from "react";

const query1 = "src/assets/400.png";

const SearchCard = () => {
  const [searchTerm, setSearchTerm] = useState([]);
  const [query, setQuery] = useState([]);
  const searchData = async (data) => {
    setQuery(query1);
  }

  return (
    <div>
      <h1>This is the search section</h1>
      <div className="search-container">
        <div className="input-container">
          <input
            placeholder="enter query"
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
          >
          </input>
        </div>
          <div className="card suggestion-bar" style={{width: 18 +'em'}}>
            <img src="..." className="card-img-top" alt="..."></img>
              <div className="card-body">
                <h5 className="card-title">Card title</h5>
                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <a href="#" className="btn btn-primary">Go somewhere</a>
              </div>
          </div>
        <button
          className="generate query"
          onClick={() => searchData(searchTerm)}>
          Generate
        </button>
      </div>
    </div>
  );
};

export default SearchCard;

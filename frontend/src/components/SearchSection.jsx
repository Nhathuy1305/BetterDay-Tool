import React, { useState } from "react";
import ResultSection from "./ResultSection";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import "../css/SearchSection.css";
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
    <div className="container search-section">
      <div className="search-main">
        <div className="title">
          <div className="title-item title-logo">
            <h1>BetterDay</h1>
          </div>
          <div className="title-item title-icon">
              <a href="https://github.com/Nhathuy1305/BetterDay-Tool">
                <FontAwesomeIcon icon="fa-brands fa-github" spin spinReverse size="sm" />
              </a>
          </div>
          <div className="title-item title-intro">
            <p>Our AI-driven solution is here to simplify and enhance your experience.</p>
            <br/>
            <p className="title-intro-border">Join us on this journey as we explore the incredible potential of AI in extracting queries from your input and efficiently finding them within videos. Embrace the future of content interaction, and unlock a world of possibilities with our innovative technology. Start discovering, exploring, and creating with us today!</p>
          </div>
          <div className="title-item title-credit">
            <span className="credit-name">Made by BetterDay Team</span>
            <span className="credit-name">Demo Online</span>
          </div>
        </div>
        <div className="input">
          <p><FontAwesomeIcon icon="fa-solid fa-thought-bubble" /> Natural Language Query</p>
          <input
            placeholder="enter query"
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
          ></input>
          <span><FontAwesomeIcon icon="fa-solid fa-comment-question" /><i class="fa-light fa-seal-question"></i></span>
          <button
            className="generate-query"
            onClick={() => {
              searchData(searchTerm);
            }}
          >
            Generate
          </button>
        </div>
      </div>
      <div className="result-main">
        <ResultSection queries={queries} />
      </div>
    </div>
  );
};

export default SearchSection;

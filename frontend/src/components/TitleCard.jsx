import React from "react";
import github from "../assets/github.png";

const TitleCard = () => {
  return (
    <div className="title-container">
      <img></img>
      <div className="icon-link">
        <span>
          <a href="https://github.com/Nhathuy1305/BetterDay-Tool">
            <img src={github} alt="Github" />
          </a>
        </span>
      </div>
    </div>
  );
};

export default TitleCard;

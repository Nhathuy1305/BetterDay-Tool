import React from 'react'
import SearchCard from './SearchCard'
import TitleCard from './TitleCard';

const LeftSection = () => {
    return (
        <div className='left-section-container'>
            <TitleCard />
            <SearchCard />
        </div>
    )
}

export default LeftSection;

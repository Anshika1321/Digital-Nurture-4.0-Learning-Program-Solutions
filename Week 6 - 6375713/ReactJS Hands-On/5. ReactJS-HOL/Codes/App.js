import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'INTADMDF10 -.NET FSD',
      status: 'Scheduled',
      startDate: '22-Feb-2022',
      coach: 'Aathma',
      trainer: 'Jojo Jose'
    },
    {
      name: 'ADM21JF014 - Java FSD',
      status: 'Ongoing',
      startDate: '10-Sep-2021',
      coach: 'Apoorv',
      trainer: 'Elisa Smith'
    },
    {
      name: 'CDBJF21025 - Java FSD',
      status: 'Ongoing',
      startDate: '24-Dec-2021',
      coach: 'Aathma',
      trainer: 'John Doe'
    }
  ];

  return (
    <div className="App">
      <h2 style={{ textAlign: 'left', marginLeft: '30px' }}>Cohorts Details</h2>
      <div style={{ border: '1px solid black', padding: '20px' }}>
        {cohorts.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;

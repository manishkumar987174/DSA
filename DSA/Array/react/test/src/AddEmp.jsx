import React from "react";
import "./App.css";
const AddEmp = () => {
  return (
    <>
      <div className="form flex justify-center color-red-400 p-2 text-center m-2 border border-black">
        <input className="p-2" type="text" placeholder="Enter your user-name" />
        <input className="p-2" type="text" placeholder="Enter your E-mail" />
        <input className="p-2" type="text" placeholder="Enter your Password" />
        <input type="submit" />
      </div>
    </>
  );
};

export default AddEmp;

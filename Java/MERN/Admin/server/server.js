const express = require("express");
const app = express();

app.get("/", (req, res) => {
  res.status(200).send("WELCOME TO MERN");
});
app.get("/register", (req, res) => {
  res.status(200).send("WELCOME TO register");
});

const PORT = 5000;

app.listen(PORT, () => {
  console.log(`server is running on port no ${PORT}`);
});

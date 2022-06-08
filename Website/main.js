const http = require("http");
const fs = require("fs");
const url = require("url");
const path = require("path");
const express = require("express");
const app = express();
// const router = require("./routes/indexRouter");
const router = require("./routes/k_shopRouter");
const cookieParser = require("cookie-parser");
const session = require("express-session");

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "ejs");
// app.use(express.static(path.join(__dirname, "/public")));
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(
  session({ secret: "my secret key", resave: false, saveUninitialized: false })
);
app.use(router);
app.use(express.static(path.join(__dirname, "/k-shop")));

app.listen(8080, () => {
  console.log("Server started on port 8080");
});

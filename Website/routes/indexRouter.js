const path = require("path");
const express = require("express");
const request = require("express");
const router = express.Router();

let router_get = (rout, file_path) => {
  router.get(rout, (req, res) => {
    console.log("Request URL: " + req.url);
    res.status(200);
    res.sendFile(path.join(__dirname, file_path));
  });
};
 
router_get(["/", "/home"], "../public/index.html");
router_get("/paragraph", "../public/paragraph.html");
router_get("/image", "../public/image.html");
router_get("/list", "../public/list.html");
router_get("/table", "../public/table.html");
router_get("/form", "../public/form.html");
router_get("/responsive", "../public/responsive.html");
router_get("/flexbox", "../public/flexbox.html");
router_get("/grid", "../public/grid.html");

// router.get(["/","/home"],(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/index.html"));

// });

// router.get("/paragraph",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/paragraph.html"));

// });

// router.get("/image",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/image.html"));

// });

// router.get("/list",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/list.html"));

// });

// router.get("/table",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/table.html"));

// });

// router.get("/form",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/form.html"));

// });

// router.get("/responsive",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/responsive.html"));

// });

// router.get("/flexbox",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/flexbox.html"));

// });

// router.get("/form",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/form.html"));

// });

// router.get("/grid",(req, res) => {
//   console.log("Request URL: " + req.url);
//   res.status(200);
//   res.sendFile(path.join(__dirname, "../public/grid.html"));

// })

module.exports = router;

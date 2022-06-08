const path = require("path");
const express = require("express");
const router = express.Router();

const Product = require("../models/products");

const multer = require("multer");
const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    cb(null, "./k-shop/images/products");
  },
  filename: (req, file, cb) => {
    cb(null, Date.now() + ".jpg");
  },
});
const upload = multer({ storage: storage });

router.get("/", (req, res) => {
  console.log("Request : " + req.url);
  res.status(200);
  Product.find().exec((err, doc) => {
    if (err) res.end(err);
    else res.render("index", { products: doc });
  });
});

router.get("/login/to-page/:page", (req, res) => {
  console.log("Request : " + req.url);
  res.status(200);
  res.render("login", { page: req.params.page });
});

router.get("/login/:_page", (req, res) => {
  console.log("Request : " + req.url);
  const _page = req.params._page;
  res.status(200);
  if (req.session.login) res.redirect("/" + _page);
  else res.redirect("/login/to-page/" + _page);
});

router.post("/login-page/:_page", (req, res) => {
  console.log("Request : " + req.url);
  console.log(req.body.username);
  console.log(req.body.password);
  res.status(200);
  if (req.body.username === "admin" && req.body.password === "admin") {
    console.log("Admin login success");
    req.session.login = true;
    req.session.username = "admin";
    req.session.password = "admin";
    req.session.cookie.maxAge = 20000;
    res.redirect("/" + req.params._page);
  } else {
    res.render("404");
  }
});

router.get("/logout", (req, res) => {
  console.log("Request : " + req.url);
  req.session.destroy((err) => {
    if (err) res.end(err);
    else res.redirect("/");
  });
});

router.get("/add-product", (req, res) => {
  console.log("Request : " + req.url);
  res.status(200);
  res.render("form");
});

router.get("/manage", (req, res) => {
  console.log("Request : " + req.url);
  res.status(200);
  Product.find().exec((err, doc) => {
    if (err) res.end(err);
    else res.render("manage", { products: doc });
  });
});

router.post("/insert", upload.single("image"), (req, res) => {
  console.log("Request : " + req.url);

  let product = new Product({
    name: req.body.name,
    price: req.body.price,
    image: req.file.filename,
    description: req.body.description,
  });

  console.log(product);
  Product.saveProduct(product, (err) => {
    if (err) console.log(err);
    res.redirect("/");
  });
});

router.get("/delete/:id", (req, res) => {
  console.log("Request : " + req.url);
  Product.findByIdAndDelete(req.params.id, { useFindAndModify: false }).exec(
    (err) => {
      if (err) console.log(err);
      else res.redirect("/manage");
    }
  );
});

router.post("/updateManage", (req, res) => {
  console.log("Request : " + req.url);
  Product.findById(req.body._id, (err, doc) => {
    if (doc) res.render("update", { item: doc });
    else res.render("404");
  });
});

router.post("/updateData", (req, res) => {
  console.log("Request : " + req.url);
  Product.findByIdAndUpdate(
    req.body._id,
    {
      name: req.body.name,
      price: req.body.price,
      description: req.body.description,
    },
    { useFindAndModify: false }
  ).exec((err) => {
    if (err) console.log(err);
    else res.redirect("/manage");
  });
});

router.get("/:id", (req, res) => {
  console.log("Request : " + req.url);
  Product.findById(req.params.id).exec((err, doc) => {
    if (doc) res.render("product", { product: doc });
    else res.render("404");
  });
});

module.exports = router;

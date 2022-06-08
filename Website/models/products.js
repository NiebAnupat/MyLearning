const mongoose = require('mongoose');

const dbUrl = "mongodb://127.0.0.1:27017/k-shopDB";
mongoose.connect(dbUrl, {
      useNewUrlParser: true,
      useUnifiedTopology: true
}).catch(err => console.log(err));

let productSchema = mongoose.Schema({
      name: String,
      price: Number,
      image: String,
      description: String,      
});

let Product = mongoose.model('products', productSchema);

module.exports = Product;

module.exports.saveProduct =(model,data)=>{
      model.save(data);
};

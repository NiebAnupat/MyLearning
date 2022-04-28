void main(List<String> args) {
  var map1 = new Map<String, String>();
  map1["firstName"] = "Anupat";
  map1["lastName"] = "Kaewmee";
  map1["age"] = "19";
  map1["address"] = "Ayutthaya";
  print(map1);

  print("\n"); //---------------------------------------------------------------
  var map2 = {
    "firstName": "Anupat",
    "lastName": "Kaewmee",
    "age": "19",
    "address": "Ayutthaya"
  };
  print(map2);

  print("\n"); //---------------------------------------------------------------
  Map<int, String> map3 = {1: "Anupat", 2: "Kaewmee", 3: "19", 4: "Ayutthaya"};
  print(map3);

  print("\n"); //---------------------------------------------------------------
  // List to Map
  var info = ["Anupat", "Kaewmee", "19"];
  Map<int, String> map4 = info.asMap();
  print(map4);

  print("\n"); //---------------------------------------------------------------
  // Map to List
  var keys = map1.keys.toList();
  var values = map1.values.toList();
  print(keys);
  print(values);

}

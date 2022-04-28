void main(List<String> args) {
  var x = 100, y = 50;

  if (x < y) {
    print("x is less than y");
  } else if (x > y) {
    print("x is greater than y");
  } else {
    print("x is equal to y");
  }

  if ("a" == "b") {
    print("a is equal to b");
  }

  if (false) {
    print("This is false");
  } else {
    print("This is true");
  }

  if (true && false) {
    print("This is true & false");
  } else {
    print("This is false");
  }

  if (true || false) {
    print("This is true or false");
  } else {
    print("This is false");
  }

  if (true || !false) {
    print("This is true or !false");
  } else {
    print("This is false");
  }

  if (true && !false) {
    print("This is true and !false");
  } else {
    print("This is false");
  }

  var result = (x > y) ? "x is greater than y" : "x is less than y";
  print(result);
}

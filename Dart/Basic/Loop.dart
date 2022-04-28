void main(List<String> args) {
  var round = 0;
  while (true) {
    if (round == 10) break;
    print("WhileLoop Round : $round");
    round++;
  }

  print("\n");
  var count = 10;
  for (var i = 0; i < count; i++) {
    if (i == 5) continue;
    print("ForLoop : $i");
  }

  print("\n");
  var round1 = 0;
  do {
    print("DoWhileLoop : $round1");
    round1++;
  } while (round1 < 10);

  print("\n");
  var list = [1, 2, 3, 4, 5];
  for (var i in list) {
    print("ForEachLoop : $i");
  }
}

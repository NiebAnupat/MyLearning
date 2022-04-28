void main(List<String> args) {
  List info = ["Anupat", "Kaewmee", 19];
  print(info); // Will print [Anupat, Kaewmee, 19]
  print(info[0]); // Will print Anupat
  print(info[1]); // Will print Kaewmee
  print(info[2]); // Will print 19

  print("\n"); //---------------------------------------------------------------
  List number = [1, 2, 3, 4, 5, 6, 7];
  print(number); // Will print [1, 2, 3, 4, 5, 6, 7]
  print(number[0] + number[6]); // Will print 8

  print("\n"); //---------------------------------------------------------------
  List<String> number1 = ["1", "2", "3", "4", "5", "6", "7"];
  print(number1); // Will print [1, 2, 3, 4, 5, 6, 7]
  print(number1[0] + number1[6]); // Will print 17

  print("\n"); //---------------------------------------------------------------
  var list1 = [1, 2, 3, 4, 5, 6, 7];
  print(list1); // Will print [1, 2, 3, 4, 5, 6, 7]

  print("\n"); //---------------------------------------------------------------
  number.add(8);
  print(number); // Will print [1, 2, 3, 4, 5, 6, 7, 8]

  print("\n"); //---------------------------------------------------------------
  number1.add("8");
  print(number1); // Will print [1, 2, 3, 4, 5, 6, 7, 8]

  print("\n"); //--------------------------------------------------------------
  info.add("Programmer");
  print(info); // Will print [Anupat, Kaewmee, 19, Programmer]

  print("\n"); //---------------------------------------------------------------
  info.remove(19);
  print(info); // Will print [Anupat, Kaewmee, Programmer]

  // For Loop Wtiht List
  print("\n"); //---------------------------------------------------------------
  for (int i = 0; i < info.length; i++) {
    print(info[i]);
  }

  // ForEech Loop With List
  print("\n"); //---------------------------------------------------------------
  for (var item in info) {
    print(item);
  }

  // Add Function
  print("\n"); //---------------------------------------------------------------
  number.addAll([9, 10]);
  print(number); // Will print [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  print("\n"); //---------------------------------------------------------------
  number.insert(0, 0);
  print(number); // Will print [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  print("\n"); //---------------------------------------------------------------
  number.insertAll(0, [-1, -2, -3]);
  print(number); // Will print [-1, -2, -3, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // Remove Function
  print("\n"); //---------------------------------------------------------------
  number.remove(0);
  print(number); // Will print [-1, -2, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  print("\n"); //---------------------------------------------------------------
  number.removeAt(0);
  print(number); // Will print [-2, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  print("\n"); //---------------------------------------------------------------
  number.removeRange(3, 7);
  print(number); // Will print [-2, -3, 1, 6, 7, 8, 9, 10]

  print("\n"); //---------------------------------------------------------------
  number.removeWhere((i) => i < 5);
  print(number); // Will print [6, 7, 8, 9, 10]

  print("\n"); //---------------------------------------------------------------
  number.clear();
  print(number); // Will print []
}

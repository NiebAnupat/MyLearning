// ignore_for_file: unused_local_variable

void main(List<String> args) {
  // Declare a variable

  var message =
      'Hello Dart!'; // var is a dynamic type when used in a variable declaration
  var a = 0;
  var b = 1.1;
  var c = true;
  var d = null;
  var e = [1, 2, 3];
  var f = {'x': 1, 'y': 2};

  num n1 = 0; // n1 is int
  num n2 = 0.1; // n2 is double
  int i = 0;
  String s = 'Hello Dart!';
  double d2 = 0.0;
  bool bo = true;
  List<String> list = ['Hello', 'Dart'];
  Map<String, String> map = {
    'Keyword': 'Hello Dart',
    'Keyword2': 'Hello World'
  }; // Map<String, String> is a Map type with String key and String value
  dynamic dy = null; // dynamic is a dynamic type variable
  dy = 2;
  dy = 'Hello Dart';
  dy = true;
  dy = [1, 2, 3];
  dy = {'Keyword': 'Hello Dart'};

  // Print the message
  print(message);
  print(list[0]); // list[0] is Hello, list[1] is Dart
  print(map[
      "Keyword2"]); // map["Keyword"] is Hello Dart, map["Keyword2"] is Hello World

  const int num1 = 1; // num is const int can not be changed
  // num = 3; // Error: num is const
  final int num2 = 1; // num2 is final int can not be changed
  // num2 = 3; // Error: num2 is final

  // const int num3 = 10 + i; // num3 is const int can not use i to calculate
  final int num4 = 10 + i; // num4 is final int can use i to calculate
}

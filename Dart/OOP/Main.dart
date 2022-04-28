import 'MyFunc.dart';

void main(List<String> args) {
  MyFunc().display("Hello Dart!");

  var thisFunc = new MyFunc();
  thisFunc.display("Hello Dart! 2");
  print(thisFunc.getName());

  MyFunc myFunc = new MyFunc();
}

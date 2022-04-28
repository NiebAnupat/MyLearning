class MyFunc {
  MyFunc() {
    print("This is constructor");
  }

  String _name = "Anupat"; // make variable private
  void display(String message) {
    print(message);
    _privateFunction("This is a private function");
  }

  String getName() => _name;
  void _privateFunction(String message) => print(message);
}

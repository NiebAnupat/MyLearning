void main(List<String> args) {
  display();

  // First Class Function
  var displayFunc = displayArrow;
  displayFunc();

  var cal = calculate;
  print(cal(100, 20));
}

void display() {
  print('Hello Dart!');
  print(calculate(10, 20));
  print(getName());

  // Default parameter
  displayDefault("Anupat"); // Will print Name: Anupat, Age: 0
  displayDefault(
      "Anupat Kaewmee", 19); // Will print Name: Anupat Kaewmee, Age: 19

  // Named parameter
  displayNamed(); // Will print Name: name, Age: age
  displayNamed(name: "Anupat", age: "19"); // Will print Name: Anupat, Age: 19
  displayNamed(
      age: "19",
      name: "Anupat Kaewmee"); // Will print Name: Anupat Kaewmee, Age: 19
}

int calculate(int a, int b) {
  return a + b;
}

String getName() {
  return 'Anupat';
}

// Arrow functions
String getNameArrow() => 'Anupat';
int cal(x, y) => x + y;
bool compare(x, y) => x > y;
void displayArrow() => print('Hello Dart!');

// Default parameter
void displayDefault(String name, [int age = 0]) {
  print('Name: $name, Age: $age');
}

void displayDefault2(var name, [int age = 0]) =>
    print('Name: $name, Age: $age');

// Named parameter
void displayNamed({String name = "name", String age = "age"}) {
  print('Name: $name, Age: $age');
}

void displayNamed2({String name = "name", String age = "age"}) =>
    print('Name: $name, Age: $age');

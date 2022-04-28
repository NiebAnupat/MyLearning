void main(List<String> args) {
  int x = 100, y = 50;

  num r = x / y; // r is double
  num r1 = x ~/ y; // r1 is int
  num r2 = (x / y).toInt(); // r3 is int

  print(r);
  print(r1);
  print(r2);
  print(x / y);
  print("\n");

  var a = 10 + 2; // 12
  var b = 10 * 2; // 20
  var c = 10 - 2; // 8
  var d = 10 / 2; // 5.0
  var e = 10 % 2; // 0
  var f = 10 ~/ 2; // 5
  var g = 10 << 2; // 40
  var h = 10 >> 2; // 2
  var i = 10 & 2; // 2
  var j = 10 | 2; // 10
  var k = 10 ^ 2; // 8

  print(
      "a = $a\nb = $b\nc = $c\nd = $d\ne = $e\nf = $f\ng = $g\nh = $h\ni = $i\nj = $j\nk = $k");
  print("\n");

  print(x == y);
  print(x != y);
  print(x > y);
  print(x < y);
  print(x >= y);
  print(x <= y);
  print("\n");

  print("x : $x , y : $y");
  print("++x = ${++x}");
  print("y++ = ${y++}");
  print("y = $y");
}

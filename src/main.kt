fun main() {
    var a = Fraction(10, 20);
    var b = Fraction(2,2);
    var c = a.multiply(b);
    c.round();
    print(c.toString())
}
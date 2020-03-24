class Fraction(private var numerator: Int, private var denominator: Int) {

    init {
        if (denominator == 0) {
            throw Exception("denominator can't be 0");
        }
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun multiply(other: Fraction): Fraction {
        return Fraction(this.numerator * other.numerator, this.denominator * other.denominator)
    }

    fun round() {
        var gcd = calculateGCD(this.numerator, this.denominator)
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    fun calculateGCD(a: Int, b: Int): Int {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

}
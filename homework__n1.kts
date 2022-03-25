 fun main() {

    var f1 = Fraction(4F,5F)
    var f2 = Fraction(1F,2F)

    println(f1.addition(f1, f2))
    println(f1.Subtraction(f1, f2))
    println(f1.gamravleba(f1, f2))
    println(f1.gayofa(f1, f2))

}

class Fraction(private var numerator: Float, private var denominator: Float) {

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }
    override fun toString(): String {
        return "$numerator/$denominator"
    }
    fun addition (a: Fraction, b: Fraction): String {
        var num1 = b.denominator * a.numerator
        var num2 = a.denominator * b.numerator
        var denom1 = a.denominator * b.denominator
        var jami = num1 + num2

            return "mimatebis shedegi: $jami/$denom1"
    }
    fun Subtraction (a: Fraction, b: Fraction): String {
        var num1 = b.denominator * a.numerator
        var num2 = a.denominator * b.numerator
        var denom1 = a.denominator * b.denominator
        var gamok1 = num1 - num2

            return "gamoklebis shedegi: $gamok1/$denom1"
    }
    fun gamravleba (a:Fraction, b:Fraction): String {
        var num1 = a.numerator * b.numerator
        var denom1 = a.denominator * b.denominator

            return "gamravlebis shedegi: $num1/$denom1"
    }
    fun gayofa (a:Fraction, b:Fraction): String {
        var num1 = a.numerator * b.denominator
        var denom1 = a.denominator * b.numerator

            return "gayofis shedegi: $num1/$denom1"
    }


}
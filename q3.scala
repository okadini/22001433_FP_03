object q3 {
    def main(args:Array[String]) = {

        def Average(num1:Int,num2:Int):Float ={
            (num1 + num2) / 2.0f
        }

        var num1 = 67
        var num2 = 78
        printf("Arithmetic mean of %d and %d = %.2f\n",num1,num2,Average(num1,num2))
    }
}
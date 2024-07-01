object q4 {
    def main(args : Array[String]) = {

        def sumOfEvens(numList:List[Int]):Int = {

            var sum = 0

            for(i <- numList.indices) {
                if(numList(i) % 2 == 0) {
                    sum += numList(i)
                }
            }

            sum
        }

        var numberList = List(4,1,7,8,12,19,56,35,78)

        var sum = sumOfEvens(numberList);

        printf("Sum of all the even numbers in the list = %d\n",sum)
    }
}
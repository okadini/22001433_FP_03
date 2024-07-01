object q1{
    def main(args:Array[String]) = {
        def reverseString(inputStr:String) : String = {
            if(inputStr == "") {
                ""
            }
            else {
                reverseString(inputStr.tail) + inputStr.head
            }
        }

        println(reverseString("hello"))
        println(reverseString("scala"))
    }
}
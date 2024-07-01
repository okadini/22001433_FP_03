object q2 {
    def main(args : Array[String]) = {

        def StrMoreThan5(strList:List[String]):List[String] = {
            strList.filter(_.length > 5)
        }

        var stringList = List("hello","pineapple","happy","world","banana","dreams","programming","awesome")
        var filteredList = StrMoreThan5(stringList)
        println(s"Strings with length greater than 5 : $filteredList\n")
    }
}
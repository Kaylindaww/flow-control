

fun main(){
    number()
    names()
    party(5)
    party(13)
    party(19)
    Numbers()



}
fun number(){
    for (num in 1..100)
        if (num%2!==0)
            println(num)
}
fun names(){
     var names = arrayOf("KAY","LINDA","AKULLU","HARRIET")
    var countNames=0
    for (countNames in names){
        if (countNames.length>5){
            println(countNames)

        }
    }
}
fun party(age:Int){
    if (age<6){
        println("give them milk")
    }else{
        if (age<15){
            println("give them fanta orange")
        }else{
            if (age>1){
                println("go for coca-cola")
            }
        }
    }

}
fun Numbers(){
    for(k in 1..100)
        if(k%3!=0&& k%5!=0){
            println(k)
        }
    else if(k%3!=0){
            println("Fizz")
    }
    else if(k%5!=0){
        println("Buzz")
        }
    else{
        println("FizzBuzz")
        }

}





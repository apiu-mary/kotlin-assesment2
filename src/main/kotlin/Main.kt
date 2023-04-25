import sun.security.util.Password

fun main(){
    var w=randomString("Woderful")
    println(w)
    multiplication()
}
fun randomString(word:String):Any{
    var letter=word[0]
    var letter2=word[7]
    var lonstring=word.length
    var all= mutableListOf(letter,letter2,lonstring



}
fun checkPassword(password:String):String {
    if (password.length>16){
        return "maximum number is 16"
    }
    else{
        "password"
    }
    else if (password.length<8){
        "mininum of eight characters needed"
    }

    else if ("password"){
        "invalid"
    }
}
fun multiplication(){
    var range1=1..1000
    for (i in range1){
        if (i%2==0 && i*3==0){
            println(i)
        }
        else if (i%8==0){
            println(i)
        }
        else(i%2==0 && i%3==0 && i%8==0){
            kotlin.io.println("bingo")
        }


    }
}


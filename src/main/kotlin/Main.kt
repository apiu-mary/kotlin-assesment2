

fun main(){
    var w=randomString("Woderful")
    println(w)
  multiplication()
    var current =CurrentAccount(30,"Mary",30000.0,)
    current.details()
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomString(word:String):Any{
   var letter=word[0]
    var letter2=word[7]
 var lonstring=word.length
    var all= mutableListOf(letter,letter2,lonstring

}
//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
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
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
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
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
 open class CurrentAccount(var accountNumber: Number,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance=+amount
    }
    fun withdraw(amount: Double){
        balance=-amount
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by accountname $accountName")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountNumber: Number, accountName: String, balance: Double,var withdrawals:Int):CurrentAccount(accountNumber:Number,accountName:String,balance:Double){

    withdrawals+=
}
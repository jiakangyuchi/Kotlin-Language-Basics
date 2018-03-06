
fun getUnsignedByte(value: Byte): Int {
    return value.toInt() and 0xFF
}

val sample1= getUnsignedByte(0x3A)

var sample2=getUnsignedByte(58)

var heartRate:Int = 85

var deposits:Double = 135002796.0

val acceleration:Float = 9.800f

var mass:Float = 14.6f

var distance:Double = 129.763001

var lost:Boolean = true

var expensive:Boolean = true

var choice:Int = 2

var integral:Char = '\u222b'

val greeting:String = "Hello"

var name:String ="Karen"

fun main(args: Array<String>) {
     
    if(sample1==sample2){
        println("The samples are equal");
    }else{
        println("The samples are not equal")
    }
    
    if(heartRate>=40&&heartRate<=80){
        println("Heart rate is normal.")
    }else{
        println("Heart rate is not normal")
    }
    
    if(deposits>=100000000){
        println("You are exceedingly")
    }else{
        println("Sorry you are so poor")
    }
    
    var force=mass*acceleration
    println("force = $force")
    
    println("$distance is the distance.")
    
    if(lost&&expensive){
        println("I am really sorry! I will get the manager.")
    }else if(lost&&!expensive){
        println("Here is the coupon for 10% off")
    }
    
    when(choice){
        1->println("You choose 1")
        2->println("You choose 2")
        3->println("You made an unknown choice")
        else->println("$integral is an integral")
    }
    
    for (i in (5..10)){
        println("i = $i")
    }
   
    var age:Int = 0
    while(age<6){
        println("age = $age")
        age++
    }
    
    println("$greeting, $name")
}


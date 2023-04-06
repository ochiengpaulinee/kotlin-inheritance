fun main(){
val Banker = banker("Samuel",30)
    Banker.eat()
    Banker.introduction()
//    Banker.sleep()
//    println(Banker.countMoney(arrayOf(20,65,5,6,90)))
//    Banker.talk("I am coming")


    val doctor = Doctor("Bridget",24)
    doctor.eat()
    doctor.introduction()
//    doctor.sleep()
//    doctor.treatPatient("Rebecca","malaria")
//    doctor.talk("You will feel okay")
//    println(doctor.countMoney(arrayOf(1,2,4,90,23)))



    val Farm = farm("Pauline",24,"female")
    Farm.eat()
    Farm.introduction()
//    Farm.sleep()
//    Farm.talk("I will reap my crops tomorrow")
//    Farm.cultivateLand()
//


}

 open class person(var name:String, var age:Int){
    fun talk(words:String){
        println(words)
    }

    open fun eat(){
        println("yummy")
    }
    fun sleep(){
        println("zzzzzzzzzzzzzzzzzzzzzz")
    }
     open fun introduction(){
         println("Hi, my name is $name")
     }
}

open class banker(name:String, age:Int):person(name,age){

    fun countMoney(notes:Array<Int>):Int{
        return notes.sum()
    }
}


class Doctor( name:String, age:Int):banker(name,age){

    fun treatPatient(patient:String,disease:String){
        println("treating $patient for $disease")
    }

    override fun introduction(){
        //super.introduction()
        println("Doctor: Hi,my name is Dr.Bridget")
    }
}

class farm(name:String,  age:Int, gender:String):person(name,age){ //child class can have other objects that the parent class doesn't have

    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
//        super.eat()//invokes the eat function in the parent class(super=parent)
        println("farmer: eating")
    }
}


//FLOW CONTROL
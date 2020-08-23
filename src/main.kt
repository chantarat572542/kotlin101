fun main(){
    var animal = Animal()
    animal.makeNoise()

    println("------------------------")
    var myHippo = Hippo()
    myHippo.makeNoise()

   //นี่คือ Hippo = Hippo()
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()

    println("")
    //สร้างแมวของเรา
    var mycat = Cat()
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()
}
    println("")
    //สร้างตัวแปรสุนัข
var myDog = Dog()
myDog.eat()
myDog.roam()
myDog.makeNoise()
myDog.sleep()

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise (){
        println("คลาส Animal กำลัง ส่งเสียงร้อง")
    }
    open fun eat () {
        println("คลาส Animal กำลัง กิน")
    }
    open fun roam (){
        println("คลาส Animal กำลัง เดิน")
    }
    open fun sleep () {
        println("คลาส Animal กำลัง นอน")
    }
}

class Hippo : Animal() {

    override val image: String
        get() = "hippo.jpg"

    override val food: String
        get() = "หญ้า"

    override val habitat: String
        get() = "น้ำ"

    override fun makeNoise() {
        println("คลาส Hippo ร้อง ฮิป ฮิป")
    }

    override fun eat() {
        println("คลาส Hippo กิน $food")

    }
}
    class Cat : Animal() {
        override val image = "cat.jpg"
        override val food = "อาหารแมว"
        override val habitat = "บ้าน"

        override fun makeNoise(){
            println("Meow Meow")
        }
        override fun eat(){
            println("The Cat is eating $food")
        }
}
class Dog : Animal() {
    override val image = "Dog.jpg"
    override val food = "อาหารสุนัข"
    override val habitat = "บ้านสุนัข"
}
    override fun makeNoise(){
        println("โฮ้ง โฮ้ง ")
    }
    override fun eat(){
        println("คลาส Dog อาหารสุนัข $food")
    }

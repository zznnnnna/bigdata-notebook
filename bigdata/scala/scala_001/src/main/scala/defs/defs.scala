package defs

/**
 * @Author z
 * @create 2022/8/2 21:39
 *         需求：
 */
object defs {
 //单行函数
  def sayHello(name: String)=println("hello ,"+name)
//多行函数
  def sayHelloM(name: String,age: Int)={
    println(name+"'s age is "+age)
  }

  def sayHello1(name: String) = "Hello, " + name
  def sayHello2(name: String): String = "Hello, " + name
  def sayHello3(name: String) { "Hello, " + name }
  def sayHello4(name: String): Unit = "Hello, " + name

  def main(args: Array[String]): Unit = {
    sayHello("Rex")
    sayHelloM("Rex",24)

  }

}

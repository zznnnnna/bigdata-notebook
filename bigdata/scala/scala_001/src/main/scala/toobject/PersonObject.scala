package toobject

/**
 * @Author z
 * @create 2022/8/2 21:21
 *         需求：
 */
object PersonObject {
  def main(args: Array[String]): Unit = {
    val p = new Person();
    p.sayHell()

    println(p.getName)
  }
}

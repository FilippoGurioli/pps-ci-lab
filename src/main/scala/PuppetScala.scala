class PuppetScala:
    def hello = "Hello from Scala"

object Main extends App:
    val ps = new PuppetScala()
    val pj = new puppetJava()
    println(ps.hello())
    println(pj.hello())
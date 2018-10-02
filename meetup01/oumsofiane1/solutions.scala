import scala.io.Source
import scala.collection.mutable.Stack
import java.io._

object Solution{

  def main(args: Array[String]) = {
    time {
      ex1()
    }
  }


  val filename = "../big.txt"

  def ex1(): Unit ={
    var text = Stack[String]()
    for (line <- Source.fromFile(filename).getLines) {
      text.push(line)
    }

    val file = new File("solution1.txt")
    val bw = new BufferedWriter(new FileWriter(file))
    while(! text.isEmpty)
      bw.write(text.pop())

    bw.close()

  }


  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / 1000000 + "ms")
    result
  }
}

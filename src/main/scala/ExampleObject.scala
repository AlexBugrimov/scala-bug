object ExampleObject {

  def frequencyChanges(start: Int, input: String): Int = {
    val splitInput = input.split('\n').toList
    splitInput.foldLeft(start) { (acc, line) =>
      val head = line.head
      val num = line.tail.trim
      head match {
        case '+' => acc + num.toInt
        case '-' => acc - num.toInt
        case _ => acc
      }
    }
  }
}

import org.scalatest.FunSuite

class ExampleObjectSuite extends FunSuite {

  test("Рассчитываем изменения для строки") {
    val testString =
      """
        |+1
        |-2
        |+3
        |+1
      """.stripMargin
    assert(ExampleObject.frequencyChanges(0, testString) === 3)
  }

  test("Рассчитываем изменения для нескольких строк") {
      val s1 =
      """
        |+1
        |+1
        |+1
      """.stripMargin
    assert(ExampleObject.frequencyChanges(0, s1) === 3)

    val s2 =
      """
        |+1
        |+1
        |-2
      """.stripMargin
    assert(ExampleObject.frequencyChanges(0, s2) === 0)

    val s3 =
      """
        |-1
        |-2
        |-3
      """.stripMargin
    assert(ExampleObject.frequencyChanges(0, s3) === -6)
  }
}

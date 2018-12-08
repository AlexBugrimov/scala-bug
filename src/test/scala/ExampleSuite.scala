import org.scalatest.FunSuite

class ExampleSuite extends FunSuite {

  test("Мы можем писать тесты") {
    assert(new ExampleClass().getValue === 0, "Ошибка теста")
  }
}

import org.scalatest._

class ScalaTestStyle extends FlatSpec with Matchers {

  //FlatSpec
  "Multiplying 2 * 2 " should "be 4 " in {
    assert(MyScalaTest.multiply(2, 2) == 4)
  }

  "divide 30/5 " should "be 6 " in {
    MyScalaTest.divide(30, 5)
  }

  it should "throw ArithmiticException if attemeped to divide by 0" in {
    a [java.lang.ArithmeticException] should be thrownBy {
      MyScalaTest.divide(10, 0)
    }
  }

  "An empty Set" should "have size 0" in {
    MyScalaTest.getSize(Set())
  }

  // FunSpec
  // This is with FunSpec  , where my class should be extends FunSuite
  //  describe("multiply 2 to 2 "){
  //    it ("should be equal 4"){
  //      assert (2*2 ==4 )
  //    }
  //  }
}

import kotlin.test.Test
import kotlin.test.assertEquals

class ReversibleNumbersTest {
  @Test
  fun testOneThousand() {
    assertEquals(120, reversibleNumbers(1000))
  }
}

import kotlin.test.assertEquals
import net.jqwik.api.Arbitraries
import net.jqwik.api.Arbitrary
import net.jqwik.api.ForAll
import net.jqwik.api.Property
import net.jqwik.api.Provide

class ReversibleNumbersPropertyBasedTest {
  @Property
  fun positiveNumbersAreGreaterThanZero(@ForAll("positiveNumbers") value: Int) {
    assertEquals(true, value > 0)
  }

  @Provide
  fun positiveNumbers(): Arbitrary<Int> {
    return Arbitraries.integers().between(1, 10000)
  }
}

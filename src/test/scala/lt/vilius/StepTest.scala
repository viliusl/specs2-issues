package lt.vilius

import org.specs2.mutable.Specification

/**
 * @author viliusl
 * @since 02/06/15
 */
class StepTest extends Specification {

  step {
    throw new ExceptionInInitializerError("boom")
  }

  "Tests" should {
    "run" in {
      success
    }
  }

}

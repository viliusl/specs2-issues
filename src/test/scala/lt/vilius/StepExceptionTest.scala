package lt.vilius

import org.specs2.mutable.SpecWithJUnit

class StepExceptionTest extends SpecWithJUnit {

  step {
    throw new RuntimeException("boom")
  }

  "Tests" should {
    "run" in {
      success
    }
  }
}

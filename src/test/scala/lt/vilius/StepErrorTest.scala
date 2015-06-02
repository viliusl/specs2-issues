package lt.vilius

import org.specs2.mutable.SpecWithJUnit

class StepErrorTest extends SpecWithJUnit {

   step {
     throw new ExceptionInInitializerError("boom")
   }

   "Tests" should {
     "run" in {
       success
     }
   }
 }

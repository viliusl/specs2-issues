package lt.vilius

import org.specs2.matcher.Matcher
import org.specs2.mock.Mockito
import org.specs2.mutable.SpecWithJUnit

/**
 * @author viliusl
 * @since 20/07/15
 */
class MockitoVerifyTest extends SpecWithJUnit with Mockito {

  "verify with containTheSameElementsAs should work" in {
    val ids = Seq("2", "1", "3")
    val collab = mock[Collaborator]

    new UnitUnderTest(collab).performAction(ids)

//    Error:(20, 31) type mismatch;
//    found   : org.specs2.matcher.Matcher[Traversable[String]]
//    required: Seq[String]
//    containTheSameElementsAs(ids)
//    ^
    there was one(collab).call(
      containTheSameElementsAs(ids)
    )

    //WORKS
//    there was one(collab).call(
//      containTheSameElementsAs(ids).asInstanceOf[Matcher[Seq[String]]]
//    )
  }
}

trait Collaborator {
  def call(ids: Seq[String]): Unit = {}
}

class UnitUnderTest(collab: Collaborator) {
  def performAction(ids: Seq[String]): Unit = collab.call(ids)
}

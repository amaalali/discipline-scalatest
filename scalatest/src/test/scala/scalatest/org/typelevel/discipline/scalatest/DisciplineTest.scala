package org.typelevel.discipline
package scalatest

import org.scalatest.funsuite.AnyFunSuiteLike

class LawTests extends AnyFunSuiteLike with Discipline {
  checkAll("Dummy", DummyLaws.dummy)
}

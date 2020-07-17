class Validate extends org.scalatest.FunSuite {
  var r1 = Practice_4.Sum(1,2);
  var r2 = Practice_4.Sum(1,3);
  var r3 = Practice_4.Sum(1,4);
  var r4 = Practice_4.Sum(1,5);

  test("Sum should Return 3") {
    assert(r1 === 3)
  }
  test("Sum should Return 4") {
    assert(r2 === 4)
  }
  test("Sum should Return 5") {
    assert(r3 === 5)
  }
  test("Sum should Return 6") {
    assert(r4 === 6)
  }

  
  test("Sum should fail") {
    assert(r1 === 6)
  }
  test("Sum should fail2 4") {
    assert(r2 === 5)
  }
  test("Sum should fail3 5") {
    assert(r3 === 4)
  }
  test("Sum should fail4 6") {
    assert(r4 === 3)
  }
}

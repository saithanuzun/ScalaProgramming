  import org.junit.Test
  import junit.framework.TestCase
  import org.junit.Assert._
  import org.junit.Before
  
  class TestLimitCounter {
    
    @Before def init(): Unit = {
      LimitCounter.reset(0, 10)
    }
    
    @Test def testInitialValues1(): Unit = {
      assertEquals("Lower should be 0", 0, LimitCounter.getLowerLimit)
      assertEquals("Upper should be 10", 10, LimitCounter.getUpperLimit)
      assertEquals("Counter should be 0", 0, LimitCounter.getValue)
    }
    
    @Test def testSetGetLower1(): Unit = {
      LimitCounter.setLowerLimit(5)
      assertEquals("Lower should be 5", 5, LimitCounter.getLowerLimit)
    }
    
    @Test def testSetGetUpper1(): Unit = {
      LimitCounter.setUpperLimit(12)
      assertEquals("Upper should be 12", 12, LimitCounter.getUpperLimit)
    }
    
    @Test def testSetCounterLower1(): Unit = {
      LimitCounter.setLowerLimit(5)
      LimitCounter.setToLowerLimit()
      assertEquals("Counter should be 5", 5, LimitCounter.getValue)
    }
    
    @Test def testSetCounterUpper1(): Unit = {
      LimitCounter.setUpperLimit(12)
      LimitCounter.setToUpperLimit()
      assertEquals("Counter should be 12", 12, LimitCounter.getValue)
    }
    
    @Test def testResetUpperLimit1(): Unit = {
      LimitCounter.setUpperLimit(12)
      LimitCounter.setToUpperLimit()
      LimitCounter.setUpperLimit(8) // i.e. below the counter position
      assertEquals("Counter should be 8", 8, LimitCounter.getValue)
    }
    
    @Test def testResetUpperLimit2(): Unit = {
      LimitCounter.setUpperLimit(12)
      LimitCounter.setToUpperLimit()
      LimitCounter.setUpperLimit(15) // i.e. above the counter position
      assertEquals("Counter should still be 12", 12, LimitCounter.getValue)
    }
    
    @Test def testSetGetLower2(): Unit = {
      LimitCounter.setLowerLimit(27)
      assertEquals("Lower should be not work", 0, LimitCounter.getLowerLimit)
    }
    
    @Test def testSetGetUpper2(): Unit = {
      LimitCounter.setUpperLimit(-1)
      assertEquals("Upper should be not work", 10, LimitCounter.getUpperLimit)
    }
    
    @Test def testSetValue1(): Unit = {
      LimitCounter.setValue(7)
      assertEquals("Counter should be 7", 7, LimitCounter.getValue)
    }
    
    @Test def testSetValue2(): Unit = {
      LimitCounter.setValue(15)
      assertEquals("Counter should remain 0", 0, LimitCounter.getValue)
    }
    
    @Test def testSetValue3(): Unit = {
      LimitCounter.setValue(-5)
      assertEquals("Counter should remain 0", 0, LimitCounter.getValue)
    }
    
    @Test def testIncValue1(): Unit = {
      LimitCounter.inc()
      LimitCounter.inc()
      LimitCounter.inc()
      assertEquals("Counter should inc to 3", 3, LimitCounter.getValue)
    }
    
     @Test def testIncValue2(): Unit = {
      LimitCounter.setValue(10)
      LimitCounter.inc()
      LimitCounter.inc()
      assertEquals("Counter wrap around to 1", 1, LimitCounter.getValue)
    }
    
  }
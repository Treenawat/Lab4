public class ZooTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructortTest() throws AssertException{
    	Animal animal = new Animal();
    	Assert.assertEquals("Orange", animal.getColor());
        Assert.assertEquals("Tony", animal.getName());
        Assert.assertEquals(200.5, animal.getHeight(), 0.01);
        Assert.assertEquals(15, animal.getWeight(), 0.01);
    }
    
    public void String() throws AssertException{
    	Animal animal = new Animal();
    	Assert.assertEquals("Tony, a Orange-colored animal. 200.5 pounds, 15.0 inches", animal.toString());
    }
    
    
}


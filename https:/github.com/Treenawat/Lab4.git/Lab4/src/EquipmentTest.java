import java.util.ArrayList;

public class EquipmentTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
    	Equipment equipBatarang = new Equipment("Batarang/3,3.0,3.0,A boomerang for bats");
    	Equipment equipKnife = new Equipment("Knife/5,5.0,5.0,A knife");
        // Use the default constructor
    	int count=3;

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("Batarang", equipBatarang.getName());
        Assert.assertEquals(count, equipBatarang.getCount());
        Assert.assertEquals(3.00, equipBatarang.getTotalWeight(), 0.1);
        Assert.assertEquals(3.00, equipBatarang.getTotalPrice(), 0.1);
        Assert.assertEquals("A boomerang for bats", equipBatarang.getDescription());
    }
    
    public void String() throws AssertException{
    	Equipment equipBatarang = new Equipment("Batarang/3,3.0,3.0,A boomerang for bats");
    	Equipment equipKnife = new Equipment("Knife/10,5.0,5.0,A knife");
    	
    	Assert.assertEquals("Name: Knife, Number: 10, Weight: 5.00 lbs, Price: $5.00 - A knife", 
    			equipKnife.toString());
    	Assert.assertEquals("Name: Batarang, Number: 3, Weight: 3.00 lbs, Price: $3.00 - A boomerang for bats", 
    			equipBatarang.toString());
    }
    
    
}
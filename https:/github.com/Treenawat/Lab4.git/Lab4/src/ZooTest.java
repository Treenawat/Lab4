public class ZooTest
{
	public void testTotalHeight () throws AssertException {
		Animal animal = new Animal("Orange", "Jacky", 100.0, 20.0);
		Animal animal2 = new Animal("Blue", "Bat", 300.0, 15.0);
		Animal animal3 = new Animal("Red", "Dan", 500.0, 50.0);
		
		Zoo zoo = new Zoo(3);
		zoo.addAnimal(animal);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		double total = 85.0;
		
		Assert.assertEquals(total, zoo.getTotalHeight());
	}
    public void getCapacity() throws AssertException{
    	int num = 5;
    	Zoo zoo = new Zoo(num);
    	
    	Assert.assertEquals(num, zoo.getCapacity());
    }
    
    public void testToString() throws AssertException{
    	Zoo zoo = new Zoo(5);
    	Animal animal = new Animal("Orange", "Jacky", 100.0, 20.0);
		Animal animal2 = new Animal("Blue", "Bat", 300.0, 15.0);
    	Animal animal3 = new Animal("Red", "Dan", 500.0, 50.0);
    	zoo.addAnimal(animal3);
    	
    	Assert.assertEquals("These animals live in the zoo: \nDan, a Red-colored animal. 500.0 pounds, 50.0 inches\n", zoo.toString());
    }
}


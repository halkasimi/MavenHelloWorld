import junit.framework.*;
import sample.*;

public class FooTest extends TestCase {
   protected Foo foo;
   
   // assigning the values
   protected void setUp(){
      foo = new Foo();
   }

   // test method to add two values
   public void testMessage(){
      assertEquals("Hello World From Java Foo!", foo.message());
   }
}
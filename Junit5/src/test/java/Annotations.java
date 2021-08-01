import org.junit.jupiter.api.*;

public class Annotations
{
    @BeforeAll
    public static void beforeall()
    {
        System.out.println("Executes beforeall");
    }
    @AfterAll
    public static void  afterall()
    {
        System.out.println("Executes afterall");
    }

     @BeforeEach
    public  void beforeEach()
    {
        System.out.println("Executes before each test");

    }
     @AfterEach
    public  void aftereach()
    {
        System.out.println("Executes after each test");
    }
      @Test
       public  void Test1()
    {
        System.out.println("test 1 is executing");
    }
      @Test
        public  void Test2()
    {
        System.out.println("test 2is executing");
    }
      @Test
    public  void Test3()
    {
        System.out.println("test 1 is executing");
    }





}

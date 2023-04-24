import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyEx
{
     @Test
    void startCar()
    {
        System.out.println("Car Started");
        Assert.fail();
    }

   @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car Driving");
    }

    @Test
    void stopCar()
    {
        System.out.println("Car Stopped");
    }
    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun=true)
    void ParkCar()
    {
        System.out.println("Car Parked");
    }


}

package Strategy;

public class DistanceCalculator {
   public static Modes getInstance(String mode)
   {
    if(mode.equals("Bike"))
    {
       return new Bike();
    }else if(mode.equals("Car"))
    {
       return new Car();
    }else if(mode.equals("Walk"))
    {
      return new Walk();
    }
    return null;
   }

    public static void calculateDistance(String from, String where,String mode)
    {
       Modes md=DistanceCalculator.getInstance(mode);
       md.calculateDistance(from, where);
    }
}

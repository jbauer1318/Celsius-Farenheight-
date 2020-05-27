public class Rectangle implements Measurable {
          int height;
          int width;
          public Rectangle(int h, int w)
          {
height = h;
width = w; }
          public String toString()
          {
return height + “ inches high, “ + width + “ inches wide”; }
          public String getMeasure()
          {
             return toString();
          }
etc. }
// * similar design for classes Package and WindSpeed *
       public static void main(String[] args)
       {
          Measureable thing;
          etc.
          switch(selection)
          {
case 1: thing = new Rectangle(10, 20); break; // 10 x 20 inches
case 2: thing = new Package(5, 12); break; // 5 lbs, 12 ounces
case 3: thing = new WindSpeed(15); break; // wind speed 15 miles per hour
}
System.out.println(“Measures “ + thing.getMeasure();
}
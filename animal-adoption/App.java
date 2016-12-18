
public class App {
  public static void main(String[] args) {
    Animal bobby = new Animal();
      bobby.mId = 1;
      bobby.mName = "Bobby";
      bobby.mSpecies = "walrus";
      bobby.mColor = "grey";
      bobby.mAge = 75;


    Animal phil = new Animal();
      phil.mId = 2;
      phil.mName = "Phil";
      phil.mSpecies = "giraffe";
      phil.mColor = "orange";
      phil.mAge = 32;


    Animal[] allAnimals = {bobby, phil};

    for ( Animal animal : allAnimals) {
      System.out.println( "----------------------" );
      System.out.println(animal.mId);
      System.out.println(animal.mName);
      System.out.println(animal.mSpecies);
      System.out.println(animal.mColor);
      System.out.println(animal.mAge);
    }
  }
}

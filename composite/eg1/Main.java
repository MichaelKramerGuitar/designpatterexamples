package patterns.composite.eg1;

public class Main {

  public static void main(String[] args) {
    Car car1 = new Honda();
    Car edsCar = new Lambo();
    Car car3 = new Ferrari();

    MyCars containerOfCars = new MyCars();

    MyCars foreignCars = new MyCars();

    foreignCars.add(edsCar);
    foreignCars.add(car3);
    foreignCars.add(containerOfCars);


    containerOfCars.add(car1);
    containerOfCars.add(edsCar);
    containerOfCars.add(car3);

//    containerOfCars.print();  // this is the key to this pattern!

//    edsCar.print();  // we can invoke the same method as here...

    foreignCars.print();

  }

}

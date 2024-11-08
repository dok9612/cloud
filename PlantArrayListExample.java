import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.jar.Attributes.Name;

public class PlantArrayListExample {

    // TODO: Define a printArrayList method that prints an ArrayList of plant (or
    // flower) objects
    public static void printArrayList(ArrayList<Plant> myGarden) {
        for (int i = 0; i < myGarden.size(); i++) {
            System.out.println("Plant " + (i + 1) + " Information: ");
            myGarden.get(i).printInfo();
            System.out.println();
        }
    }
    # test

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();
        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost,
        // colorOfFlowers, isAnnual
        String plantName;
        String plantCost;
        String flowerName;
        String flowerCost;
        String colorOfFlowers;
        Boolean isAnnual;

        input = scnr.next();
        while (!input.equals("-1")) {
            // TODO: Check if input is a plant or flower
            if (input.equals("plant")) {
                plantName = scnr.next();
                plantCost = scnr.next();

                Plant plant = new Plant();

                plant.setPlantName(plantName);
                plant.setPlantCost(plantCost);

                myGarden.add(plant);

            } else {
                flowerName = scnr.next();
                flowerCost = scnr.next();
                isAnnual = scnr.nextBoolean();
                colorOfFlowers = scnr.next();

                Flower flower = new Flower();

                flower.setPlantName(flowerName);
                flower.setPlantCost(flowerCost);
                flower.setPlantType(isAnnual);
                flower.setColorOfFlowers(colorOfFlowers);

                myGarden.add(flower);
            }
            // Store as a plant object or flower object

            // Add to the ArrayList myGarden

            input = scnr.next();
        }

        // TODO: Call the method printArrayList to print myGarden
        printArrayList(myGarden);
    }
}

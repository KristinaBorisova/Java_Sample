package org.example.objects.and.other.topics;
public class Main {
    //Static Variable
    static int staticVar = 15;
    int instanceVar = 0;

    public static void main(String[] args) {
        System.out.println("------ Vars Overview: ------");
        int localVariable = 10;
        staticVar = 1;
        System.out.println("LocalVar:" + localVariable);
        System.out.println("staticVar:" + staticVar);

        System.out.println("------ Object -----");
        SpaceShip ship1 = new SpaceShip("SpaceX", 2018, SpaceShipSize.SPACE_S);
        ship1.displayInfo();

        System.out.println("----Encapsulation----\n ");
        ship1.setModel("Space XM");
        ship1.setModelSize(SpaceShipSize.Space_L);
        ship1.setYear(2022);
        ship1.displayInfo();

    }
}
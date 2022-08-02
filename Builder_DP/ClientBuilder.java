package Singleton.DesignPattern.Builder_DP;

public class ClientBuilder {

    public static void main(String[] args) {
        HouseConstruction normalhouse = HouseConstruction.getBuilder()
                .setRoof("CementedRoof")
                .setDoors(5)
                .setFloor("marble Floors")
                .build();

        System.out.println(normalhouse.getfloor());
    }
}

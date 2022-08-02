package Singleton.DesignPattern.Builder_DP;

public class HouseConstruction {

    String floor;
    String roof;
    int doors;


    String getfloor(){
        return floor;
    }
    private  HouseConstruction(){};

    public static HouseConstructionBuilder getBuilder(){
        return new HouseConstructionBuilder();
    }
    public static class HouseConstructionBuilder{

        String floor;
        String roof;
        int doors;

        public HouseConstructionBuilder setFloor(String floor) {
            this.floor = floor;
            return this;
        }
        public String getFloors(){
            return floor;
        }

        public HouseConstructionBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseConstructionBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseConstruction build(){

            HouseConstruction h = new HouseConstruction();
            h.doors = this.doors;
            h.floor = this.floor;
            h.roof = this.roof;


            return h;
        }
    }
}

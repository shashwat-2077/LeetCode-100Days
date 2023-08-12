class ParkingSystem {

    public ParkingSystem(int big, int medium, int small) {
        vehicleCount = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        return vehicleCount[carType-1]-- > 0;
    }
    
    private int[] vehicleCount;
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
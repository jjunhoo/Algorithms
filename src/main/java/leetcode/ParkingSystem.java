package leetcode;

// Design Parking System
// https://leetcode.com/problems/design-parking-system/
public class ParkingSystem {
    int big, medium, small = 0;

    private ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    private boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (this.small > 0) {
                    this.small--;
                    return true;
                } else {
                    return false;
                }
            default:
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1,1,0);
        System.out.println("[result] : " + obj.addCar(1)); // true
        System.out.println("[result] : " + obj.addCar(2)); // true
        System.out.println("[result] : " + obj.addCar(3)); // false
        System.out.println("[result] : " + obj.addCar(1)); // false
    }
}

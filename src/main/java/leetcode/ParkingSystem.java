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
        boolean result = Boolean.FALSE;

        switch (carType) {
            case 1:
                if (this.big > 0) {
                    this.big--;
                    result = Boolean.TRUE;
                }
                break;
            case 2:
                if (this.medium > 0) {
                    this.medium--;
                    result = Boolean.TRUE;
                }
                break;
            case 3:
                if (this.small > 0) {
                    this.small--;
                    result = Boolean.TRUE;
                }
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1,1,0);
        System.out.println("[result] : " + obj.addCar(1)); // true
        System.out.println("[result] : " + obj.addCar(2)); // true
        System.out.println("[result] : " + obj.addCar(3)); // false
        System.out.println("[result] : " + obj.addCar(1)); // false
    }
}

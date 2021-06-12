package leetcode;

public class DefangingAnIPAdress {
    public static String defangIPaddr(String address) {
        String result = address.replace(".", "[.]");
        return result;
    }
    public static void main(String[] args) {
        DefangingAnIPAdress.defangIPaddr("1.1.1.1");
        DefangingAnIPAdress.defangIPaddr("255.100.50.0");
    }
}

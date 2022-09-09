public class Validation {

    //Validation algorithm for uppercase
    public static boolean isUppercase(String s){
        return s.chars().allMatch(Character::isUpperCase);

    }

    //validation for lowercase
    public static boolean isLowercase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }
    public static void main(String[] args) {
        System.out.println(isUppercase("phenomenal"));
        System.out.println(isUppercase("PHENOMENAL"));

        System.out.println(isLowercase("phenomenal"));
        System.out.println(isLowercase("PHENOMENA"));

    }
}

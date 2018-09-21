package AaronJack;

public class AJackLib {
    public static String palindrome(String input){
        String rstr = "";
        String is = "is";
        String isnot = "is not";
        for(int i = input.length() - 1; i >= 0; i--){
            rstr = rstr + input.charAt(i);
        }
        if(input.compareTo(rstr) == 0){
            return is;
        } else {
            return isnot;
        }
    }
    public static String cutOut(String mainStr, String subStr){
        int firstIdx = mainStr.indexOf(subStr);
        int lastIdx = (subStr.length()) + firstIdx;
        if(firstIdx == 0){
            String newStr = mainStr.substring(lastIdx, mainStr.length());
            return newStr;
        } else if(firstIdx != 0) {
            String firstpart = "";
            String secondpart = "";
            firstpart = mainStr.substring(0, firstIdx);
            secondpart = mainStr.substring(lastIdx, mainStr.length());
            String newStr = firstpart + secondpart;
            return newStr;
        }
        return "oof";
    }
}

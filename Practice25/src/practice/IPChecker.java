package practice;

import java.util.regex.Pattern;

public class IPChecker {
    public static boolean check10IP(String IP){
        String pattern10ByteString = "((1\\d{2}|2([0-4]\\d|5[0-5]))|\\d|([1-9]\\d))";
        Pattern pattern10IP = Pattern.compile(getIPPattern(pattern10ByteString));
        if (pattern10IP.matcher(IP).matches()) return true;
        try {
            long iP = Long.parseLong(IP);
            System.out.println(iP);
            return iP >= 0 && iP <= Long.parseLong("4295067295");
        }
        catch (NumberFormatException numberFormatException){
            return false;
        }
    }
    public static boolean check8IP(String IP){
        Pattern pattern8IPPoint = Pattern.compile(getIPPattern("(0[0-3][0-7]{2})"));
        Pattern pattern8IP = Pattern.compile("0[0-3][0-7]{10}");
        return pattern8IPPoint.matcher(IP).matches() || pattern8IP.matcher(IP).matches();
    }
    public static boolean check16IP(String IP){
        Pattern pattern16IPPoint = Pattern.compile(getIPPattern("0x(\\d|A|B|C|D|E|F){2}"));
        Pattern pattern16IP = Pattern.compile( "0x(\\d|A|B|C|D|E|F){8}");
        return pattern16IPPoint.matcher(IP).matches() || pattern16IP.matcher(IP).matches();
    }

    private static String getIPPattern(String bytePattern){
        StringBuilder result = new StringBuilder(bytePattern);
        for(int i = 0;i<3;i++) result.append("\\.").append(bytePattern);
        return result.toString();
    }
}

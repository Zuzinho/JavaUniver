package practice;

public class StringWorker implements StringWorkable{
    @Override
    public int symbolsCount(String s) {
        return s.length();
    }

    @Override
    public String unevenString(String s) {
        String result = "";
        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length;i+=2) result+=chars[i];
        return result;
    }

    @Override
    public String invertString(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        for(int i = chars.length;i>0;i--) result += chars[i-1];
        return result;
    }
}

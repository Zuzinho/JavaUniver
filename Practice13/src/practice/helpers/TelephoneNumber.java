package practice.helpers;

public class TelephoneNumber {
    private final StringBuilder telephoneNumber;

    public TelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = new StringBuilder();
        int index;
        if(telephoneNumber.startsWith("+")){
            this.telephoneNumber.append(telephoneNumber.substring(0,2));
            index = 2;
        }
        else{
            int code = telephoneNumber.charAt(0) - '0';
            this.telephoneNumber.append("+").append(code-1);
            index = 1;
        }
        this.telephoneNumber.append('_').append(telephoneNumber.substring(index,index + 3));
        index+=3;
        this.telephoneNumber.append('_').append(telephoneNumber.substring(index,index + 3));
        index+=3;
        this.telephoneNumber.append('_').append(telephoneNumber.substring(index,index + 4));
    }

    public StringBuilder getTelephoneNumber(){
        return telephoneNumber;
    }
}

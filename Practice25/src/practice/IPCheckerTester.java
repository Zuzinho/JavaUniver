package practice;

public class IPCheckerTester {
    public static void main(String[] args) {
        String IP1 = "255.255.255.0",IP2 = "abc.def.gha.bcd",IP3 = "3221226219",IP4 = "5221226219";
        System.out.printf("IP %1$s - %2$s\n",IP1,IPChecker.check10IP(IP1));
        System.out.printf("IP %1$s - %2$s\n",IP2,IPChecker.check10IP(IP2));
        System.out.printf("IP %1$s - %2$s\n",IP3,IPChecker.check10IP(IP3));
        System.out.printf("IP %1$s - %2$s\n",IP4,IPChecker.check10IP(IP4));
        IP1 = "0300.0377.0002.0353";
        IP2 = "0307.0000.0002.0378";
        IP3 = "030000001353";
        IP4 = "030000001358";
        System.out.printf("IP %1$s - %2$s\n",IP1,IPChecker.check8IP(IP1));
        System.out.printf("IP %1$s - %2$s\n",IP2,IPChecker.check8IP(IP2));
        System.out.printf("IP %1$s - %2$s\n",IP3,IPChecker.check8IP(IP3));
        System.out.printf("IP %1$s - %2$s\n",IP4,IPChecker.check8IP(IP4));
        IP1 = "0xC0.0x00.0x02.0xEB";
        IP2 = "0xC0.0x00.0x02.0xEK";
        IP3 = "0xC00002EB";
        IP4 = "0xC00002EK";
        System.out.printf("IP %1$s - %2$s\n",IP1,IPChecker.check16IP(IP1));
        System.out.printf("IP %1$s - %2$s\n",IP2,IPChecker.check16IP(IP2));
        System.out.printf("IP %1$s - %2$s\n",IP3,IPChecker.check16IP(IP3));
        System.out.printf("IP %1$s - %2$s\n",IP4,IPChecker.check16IP(IP4));
    }
}

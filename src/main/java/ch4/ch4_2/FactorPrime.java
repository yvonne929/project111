package ch4.ch4_2;

//質因數分解,印出標準分解式

public class FactorPrime {
    public static String factorPrime(int n){
        String result = n + "=";
        int factor = 2;
        while (n >= factor){
            if (n % factor == 0){
                result += factor + "*";//把 factor和空字串接起來，變成 factor字串
                n = n/factor;//可簡化為 n /= factor
            }
            else{
                factor++;
            }
        }
        return result.substring(0,result.length()-1);//.substring(0,4)從第 0 個開始取，取到第 4 個
    }
    public static void main(String[] args) {
        System.out.println(factorPrime(125));
        System.out.println(factorPrime(45512));
        System.out.println(factorPrime(5487));
        System.out.println(factorPrime(410570011));
    }
}

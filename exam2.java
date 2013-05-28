import java.util.*;
import java.math.*;

class Main { // standard class name in UVa OJ
public static void main(String[] args) {
BigInteger fac = new BigInteger.valueOf(1); // :)
for (int i = 2; i <= 25; i++)
fac = fac.multiply(BigInteger.valueOf(i)); // wow :)
System.out.println(fac);
} }
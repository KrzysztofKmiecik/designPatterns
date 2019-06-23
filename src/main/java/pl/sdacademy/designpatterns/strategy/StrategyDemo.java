package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class StrategyDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        final String alg=args[0];
        final SecretKeyGenerator generator=new SecretKeyGenerator();
        final SecretKey secretKey=generator.create(alg);
        System.out.println(secretKey.getAlgorithm());

    }
}

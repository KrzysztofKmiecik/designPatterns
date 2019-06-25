package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGenerator {

    public SecretKey create(final String alg) throws NoSuchAlgorithmException {
        switch (alg) {
            case "aes":
                return new AESSecretKeyGenerationStrategy().generate();
            case "des":
                return new DESSecretKeyGenerator().generate();
            case "HmacSHA256":
                return new HmacSHA256SecretKeyGenerator().generate();
        }
        throw new NoSuchAlgorithmException();

    }
}

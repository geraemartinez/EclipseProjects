package ctc.traccar.business.helpers;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

public class HashingHelper {

	public static final int ITERATIONS = 1000;
    public static final int SALT_SIZE = 24;
    public static final int HASH_SIZE = 24;

    public static class HashingResult {

        private final String hash;
        private final String salt;
       

        public HashingResult(String hash, String salt) {
            this.hash = hash;
            this.salt = salt;
        }

        public String getHash() {
            return hash;
        }

        public String getSalt() {
            return salt;
        }
    }

    private HashingHelper() {
    }

    private static byte[] function(char[] password, byte[] salt) {
        try {
            PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, HASH_SIZE * Byte.SIZE);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return factory.generateSecret(spec).getEncoded();
        } catch (GeneralSecurityException error) {
            throw new SecurityException(error);
        }
    }

    private static final SecureRandom RANDOM = new SecureRandom();

    public static HashingResult createHash(String password) {
        byte[] salt = new byte[SALT_SIZE];
        RANDOM.nextBytes(salt);
        byte[] hash = function(password.toCharArray(), salt);
        return new HashingResult(
                DatatypeConverter.printHexBinary(hash),
                DatatypeConverter.printHexBinary(salt));
    }

    public static boolean validatePassword(String password, String hashHex, String saltHex) {
        byte[] hash = DatatypeConverter.parseHexBinary(hashHex);
        byte[] salt = DatatypeConverter.parseHexBinary(saltHex);
        return slowEquals(hash, function(password.toCharArray(), salt));
    }
    
    private static boolean slowEquals(byte[] a, byte[] b) {
        int diff = a.length ^ b.length;
        for (int i = 0; i < a.length && i < b.length; i++) {
            diff |= a[i] ^ b[i];
        }
        return diff == 0;
    }
    
    public static String mdConvert(String pass){
    	
    	try {
	    	 java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
	         byte[] array = md.digest(pass.getBytes());
	         StringBuffer sb = new StringBuffer();
	         for (int i = 0; i < array.length; ++i) {
	           sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
	         }
         	return sb.toString();
	    }catch (java.security.NoSuchAlgorithmException e) {
	    	System.out.println(e.getMessage());
	    
	    }
	    return null;
    }

    public static String doHash(String s, String salt) {
        try {
            final java.security.MessageDigest md5 =  java.security.MessageDigest.getInstance("MD5");
            md5.reset();
            if (salt != null && !salt.isEmpty()) {
                md5.update(salt.getBytes());
            }
            byte[] array = md5.digest(s.getBytes());
            StringBuilder hexData = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                hexData.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return hexData.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        	System.out.println(e.getMessage());
        }
        
        return null;
    }
}

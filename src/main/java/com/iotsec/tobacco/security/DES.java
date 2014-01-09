package com.iotsec.tobacco.security;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DES {
	public static final DES des = new DES();
	public static Key finalKey;
	public static Cipher cipher;

	private DES() {
		byte[] key = new byte[] { 0x12, 0x34, 0x56, 0x78, 0x78, 0x78, 0x78,
				0x78 };
		KeySpec keySpec;
		try {
			keySpec = new DESKeySpec(key);
			finalKey = SecretKeyFactory.getInstance("DES").generateSecret(
					keySpec);
			cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static DES getInstance() {
		return des;
	}
	
	public static String en(String plain) {
		byte[] plainByte = plain.getBytes();
		byte[] cipherText = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, finalKey);
			cipherText = cipher.doFinal(plainByte);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return BinaryToHexString(cipherText);
	}

	public static String de(String str) {
		byte[] miwen = HexStringToBinary(str);
		byte[] mingwen = null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, finalKey);
			mingwen = cipher.doFinal(miwen);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(mingwen);

	}

	public static String BinaryToHexString(byte[] bytes) {
		String hexStr = "0123456789ABCDEF";
		String result = "";
		String hex = "";
		for (int i = 0; i < bytes.length; i++) {
			// 字节高4位
			hex = String.valueOf(hexStr.charAt((bytes[i] & 0xF0) >> 4));
			// 字节低4位
			hex += String.valueOf(hexStr.charAt(bytes[i] & 0x0F));
			result += hex;
		}
		return result;
	}

	public static byte[] HexStringToBinary(String hexString) {
		// hexString的长度对2取整，作为bytes的长度
		String hexStr = "0123456789ABCDEF";
		int len = hexString.length() / 2;
		byte[] bytes = new byte[len];
		byte high = 0;// 字节高四位
		byte low = 0;// 字节低四位

		for (int i = 0; i < len; i++) {
			// 右移四位得到高位
			high = (byte) ((hexStr.indexOf(hexString.charAt(2 * i))) << 4);
			low = (byte) hexStr.indexOf(hexString.charAt(2 * i + 1));
			bytes[i] = (byte) (high | low);// 高地位做或运算
		}
		return bytes;
	}
}

package com.iotsec.tobacco.qrcode;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class QRCode {

	/**
	 * @param args
	 */
	public static void create(String text,String file) {
		// TODO Auto-generated method stub
		int width = 300;
		int height = 300;
		String format = "gif";
		Hashtable hints = new Hashtable();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		try {
			BitMatrix bitMatrix = new MultiFormatWriter().encode(text,

			BarcodeFormat.QR_CODE, width, height, hints);
			File outputFile = new File(file);
			MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

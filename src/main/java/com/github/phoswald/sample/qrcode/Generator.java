package com.github.phoswald.sample.qrcode;

import java.io.IOException;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class Generator {

    public static void main(String[] args) throws WriterException, IOException {
        if(args.length != 3) {
            System.out.println("Usage: java " + Generator.class.getName() + " <text> <output.ping> <resolution>");
            System.exit(1);
        }
        String content = args[0];
        String target = args[1];
        String format = target.substring(target.lastIndexOf('.') +1).toLowerCase();
        int resolution = Integer.parseInt(args[2]);
        BitMatrix matrix = new QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, resolution, resolution);
        MatrixToImageWriter.writeToPath(matrix,format, Paths.get(target));
    }
}

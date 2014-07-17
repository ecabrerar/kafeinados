package org.ecabrerar.examples.kafeinados.qrcode.demo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author ecabrerar
 * @date   Jul 17, 2014
 * Generar código QR con la librería QRGen.
 * @see https://github.com/kenglxn/QRGen
 */
public class ServicioGeneraQR {

	public static void generate(String qrcodetext, String imagefilename)
			throws IOException {

		ByteArrayOutputStream out = QRCode.from(qrcodetext).to(ImageType.GIF)
				.stream();
		FileOutputStream fout = new FileOutputStream(new File(imagefilename));
		fout.write(out.toByteArray());
		fout.flush();
		fout.close();
	}

}

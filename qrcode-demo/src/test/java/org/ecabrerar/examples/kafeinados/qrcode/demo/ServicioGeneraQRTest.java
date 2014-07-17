package org.ecabrerar.examples.kafeinados.qrcode.demo;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import org.junit.Test;

/**
 *
 * @author ecabrerar
 * @date Jul 17, 2014
 *
 * Caso de prueba simple con la librería QRGen.
 * @see https://github.com/kenglxn/QRGen
 */
public class ServicioGeneraQRTest {

	@Test
	public void generar() {

		try {

			ServicioGeneraQR.generate("https://github.com/ecabrerar",
					"qrdemo.gif");

			assertNotNull("Image not found !!", getImage("qrdemo.gif"));

		} catch (IOException e) {
			Logger.getLogger(ServicioGeneraQRTest.class.getName())
							.log(Level.ALL, e.toString());
		}
	}

	private BufferedImage getImage(String imagefilename) {

		BufferedImage image = null;

		try {

			image = ImageIO.read(new File(imagefilename));

		} catch (IOException e) {
			Logger.getLogger(ServicioGeneraQRTest.class.getName())
						    .log(Level.ALL,	e.toString());
		}

		return image;
	}
}

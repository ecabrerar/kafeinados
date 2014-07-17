
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

/**
 * @author ecabrerar
 * Simple test case of imgscalr 4.0 
 * @see https://github.com/thebuzzmedia/imgscalr
 */
public class AppTest {

	
	@Test
	public void loadImage() {

		Assert.assertNotNull("Image can't be loaded !!", getImage());
	}

	private BufferedImage getImage() {

		BufferedImage image = null;

		try {

			image = ImageIO.read(new File("BrazilianDukeOnAltoSax.png"));

		} catch (IOException e) {
			Logger.getLogger(AppTest.class.getName())
					.log(Level.ALL,	e.toString());
		}

		return image;
	}

	private BufferedImage doResize(BufferedImage image) {
		BufferedImage thumbnail = Scalr.resize(image, 140);

		return thumbnail;
	}

	@Test
	public void resizeImage() {
		Assert.assertNotNull("Image resizing failed !!", doResize(getImage()));
	}

	@Test
	public void createThumbSimple() {

		BufferedImage thumbnail = doResize(getImage());
		boolean isCreated = false;

		try {
			
			isCreated = ImageIO.write(thumbnail, "png", 
						new File("BrazilianDukeOnAltoSax-th-"+String.valueOf(System.nanoTime())+".png"));
			
		} catch (IOException e) {
			Logger.getLogger(AppTest.class.getName())
						.log(Level.ALL,	e.toString());
		}

		Assert.assertTrue(isCreated);
	}

	@Test
	public void loadImageFromUrl() {
		Assert.assertNotNull("Image not found !!", readImageFromUrl());
	}

	private BufferedImage readImageFromUrl() {

		BufferedImage image = null;

		try {

			URL url = new URL("https://duke.kenai.com/guitar/DukeAsKeith-daylightSmall.png");

			image = ImageIO.read(url);

		} catch (IOException e) {
			Logger.getLogger(AppTest.class.getName())
							.log(Level.ALL,e.toString());
		}

		return image;
	}

	@Test
	public void createThumbFromRemoteUrl() {

		BufferedImage thumbnail = doResize(readImageFromUrl());
		boolean isCreated = false;

		try {
			isCreated = ImageIO.write(thumbnail, "png",
							new File("DukeAsKeith-daylightSmall-th-"+String.valueOf(System.nanoTime())+".png"));
		} catch (IOException e) {
			Logger.getLogger(AppTest.class.getName())
					.log(Level.ALL,	e.toString());
		}

		Assert.assertTrue(isCreated);
	}

}

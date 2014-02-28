package coupon.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 画像ファイル操作ユーディリティ
 * 
 * @author hafuka
 * 
 */
public class ImageFileUtils {

	private ImageFileUtils() {
	}

	public static void writeImage(String filePath, byte[] imageData) throws IOException {
		// byte[]⇒BufferedImage変換
		BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageData));
		File file = new File("/usr/local/images/test.png");
		if (!file.exists()) {
			file.mkdirs();
		}
		ImageIO.write(image, "jpg", file);
	}

}

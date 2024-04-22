package com.mycompany.game2d;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class LoadSeve {
        public static BufferedImage GetFileIMG(String nome) {
            BufferedImage img = null;
            InputStream is = LoadSeve.class.getResourceAsStream("/imag/"+nome);
            try {
                img = ImageIO.read(is);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return img;
        }
        public static int GetFile(String nome) {

            File f = new File("/MapCode"+nome);
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return 0;
        }

}



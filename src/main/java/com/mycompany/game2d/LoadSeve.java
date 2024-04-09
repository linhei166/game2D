package com.mycompany.game2d;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class LoadSeve {

        public static BufferedImage GetFileIMG(String nome) {

            BufferedImage img = null;
            InputStream is = LoadSeve.class.getResourceAsStream("/IMG/"+nome);
            try {
                img = ImageIO.read(is);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            return img;
        }

}



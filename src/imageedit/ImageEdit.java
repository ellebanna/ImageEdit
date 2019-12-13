/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageedit;

/**
 *
 * @author belciñaan_sd2081
 */
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;


public class ImageEdit {

   BufferedImage  image, image2;
   int width;
   int height ;
   Image var;
   
   public ImageEdit() {
   
      try {
         File input = new File("Z:\\ImageEdit\\lauren-daigle.jpg");
         image = ImageIO.read(input);
         
         width = image.getWidth();
         height = image.getHeight();
         image2 = new BufferedImage(width/2, height/2, 1);
         for(int i=0; i<height; i++) {         
            for(int j=0; j<width; j++) {                     
               Color c = new Color(image.getRGB(j, i));
               image2.setRGB(j/2,i/2,c.getRGB());
            }
}
         
         File ouptut = new File("Z:\\ImageEdit\\lauren-daigle_Resized.jpg");
         ImageIO.write(image2, "jpg", ouptut); 
      } catch (Exception e) 
      {
          System.out.println(e.getMessage());
      }
   } 
   static public void main(String args[]) throws Exception {
      ImageEdit obj = new ImageEdit();
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.schild.jave;

import java.io.File;
import java.net.URL;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author andre
 */
public class ScreenExtractorTest {
    
    public ScreenExtractorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of render method, of class ScreenExtractor.
     */
    @Test
    public void testRenderImages_01() throws Exception {
        System.out.println("render images 01");
        URL source = new URL("https://samples.ffmpeg.org/MPEG1/zelda%20first%20commercial.mpeg");
        File target = new File("target/testoutput/extractor01");
        if (target.exists())
        {
            for (File f : target.listFiles())
            {
                f.delete();
            }
            target.delete();
        }
        MultimediaObject multimediaObject = new MultimediaObject(source);
        int width = 100;
        int height = 100;
        int seconds = 2;
        String fileNamePrefix = "extractor01";
        String extension = "jpg";
        int quality = 0;
        ScreenExtractor instance = new ScreenExtractor();
        instance.render(multimediaObject, width, height, seconds, target, fileNamePrefix, extension, quality);
        File tFiles[]= target.listFiles();
        assertEquals(instance.getNumberOfScreens(), tFiles.length, "Not correct number of output files, expecting: "+ instance.getNumberOfScreens()+" got: "+tFiles.length);
        assertEquals(15, tFiles.length, "Not 15 output files, but "+tFiles.length);
    }

    /**
     * Test of render method, of class ScreenExtractor.
     */
    @Test
    public void testRenderImages_02() throws Exception {
        System.out.println("render images 02");
        File source = new File("src/test/resources/AV36_1.AVI");
        File target = new File("target/testoutput/extractor02");
        if (target.exists())
        {
            for (File f : target.listFiles())
            {
                f.delete();
            }
            target.delete();
        }
        MultimediaObject multimediaObject = new MultimediaObject(source);
        int width = 100;
        int height = 100;
        int seconds = 2;
        String fileNamePrefix = "extractor02";
        String extension = "jpg";
        int quality = 0;
        ScreenExtractor instance = new ScreenExtractor();
        instance.render(multimediaObject, width, height, seconds, target, fileNamePrefix, extension, quality);
        File tFiles[]= target.listFiles();
        assertEquals(instance.getNumberOfScreens(), tFiles.length, "Not correct number of output files, expecting: "+ instance.getNumberOfScreens()+" got: "+tFiles.length);
        assertEquals(16, tFiles.length, "Not 16 output files, but "+tFiles.length);
    }

    /**
     * Test of render method, of class ScreenExtractor.
     */
    @Test
    public void testRenderImages_03() throws Exception {
        System.out.println("render images 03");
        File source = new File("src/test/resources/zelda first commercial.mpeg");
        File target = new File("target/testoutput/extractor03");
        if (target.exists())
        {
            for (File f : target.listFiles())
            {
                f.delete();
            }
            target.delete();
        }
        MultimediaObject multimediaObject = new MultimediaObject(source);
        int width = 100;
        int height = 100;
        int seconds = 2;
        String fileNamePrefix = "extractor03";
        String extension = "jpg";
        int quality = 0;
        ScreenExtractor instance = new ScreenExtractor();
        instance.render(multimediaObject, width, height, seconds, target, fileNamePrefix, extension, quality);
        File tFiles[]= target.listFiles();
        assertEquals(instance.getNumberOfScreens(), tFiles.length, "Not correct number of output files, expecting: "+ instance.getNumberOfScreens()+" got: "+tFiles.length);
        assertEquals(15, tFiles.length, "Not 15 output files, but "+tFiles.length);
    }
    
    /**
     * Test of render method, of class ScreenExtractor.
     */
    @Test
    public void testRenderImage_01() throws Exception {
        System.out.println("render image 01");
        URL source = new URL("https://samples.ffmpeg.org/MPEG1/zelda%20first%20commercial.mpeg");
        File target = new File("target/testoutput/extractor01.jpg");
        if (target.exists())
        {
            target.delete();
        }
        MultimediaObject multimediaObject = new MultimediaObject(source);
        int width = 100;
        int height = 100;
        int seconds = 2;
        int quality = 0;
        ScreenExtractor instance = new ScreenExtractor();
        instance.render(multimediaObject, width, height, seconds, target, quality);
        assertTrue(target.exists(), "Output file missing");
    }
    
    
    /**
     * Test of render method, of class ScreenExtractor.
     */
    @Test
    public void testRenderImage_02() throws Exception {
        System.out.println("render image 02");
        URL source = new URL("https://samples.ffmpeg.org/MPEG1/zelda%20first%20commercial.mpeg");
        File target = new File("target/testoutput/extractor02.jpg");
        if (target.exists())
        {
            target.delete();
        }
        MultimediaObject multimediaObject = new MultimediaObject(source);
        int width = 100;
        int height = 100;
        int seconds = 2;
        int quality = 0;
        ScreenExtractor instance = new ScreenExtractor();
        instance.render(multimediaObject, width, height, seconds, target, quality);
        assertTrue(target.exists(), "Output file missing");
    }
    
}

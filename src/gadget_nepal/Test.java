/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadget_nepal;

import java.io.File;

/**
 *
 * @author sherc
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("18030040-UtshaShrestha_2.pdf");
        String path = file.getAbsolutePath();
        String a = path;
        System.out.println(a);
    }
}

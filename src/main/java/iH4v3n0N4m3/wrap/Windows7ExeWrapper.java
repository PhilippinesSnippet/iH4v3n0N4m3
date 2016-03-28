package iH4v3n0N4m3.wrap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

public class Windows7ExeWrapper implements Wrapper{
 private final File[] jars;
 private final File[] native;
 private final String man;
 private final String args;
 private final File f;
 
 @Override public void wrap()throws WrapException{
  JarOutputStream o=new JarOutputStream(new FileOutputStream(f));
 }
}

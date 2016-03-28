package iH4v3n0N4m3.wrap;

import iH4v3n0N4m3.io.File;

public interface Wrapper{
 public void setJarFiles(File[] jars);
 public void setNatives(File[] natives);
 public void setManifest(String man);
 public void setVMArguments(String args);
 public void setOutput(File f);
 
 public File[] getJarFiles();
 public File[] getNatives();
 public String getManifest();
 public String getVMArguments();
 public File getOutput();
 
 public void wrap()throws WrapException;
 
 protected Wrapper(){}
}

package iH4v3n0N4m3.plugins;

import iH4v3n0N4m3.io.File;

import java.lang.ClassLoader;

public class PluginClassLoader{
 private final File f;
 private final String cn;
 public PluginClassLoader(String cn,File f){
  this.cn=cn;
  this.f=f;
 }
 public IPlugin load()throws PluginException{
  IPlugin i=null;
  FileInputStream fis=new FileInputStream(f);
  byte[] b=new byte[1024];
  int r=0;
  while((r=fis.read(b))){
   ClassLoader cl=ClassLoader.getSystemClassLoader();
   i=(IPlugin)cl.defineClass(cn,b,0,0);
  }
  return i;
 }
}

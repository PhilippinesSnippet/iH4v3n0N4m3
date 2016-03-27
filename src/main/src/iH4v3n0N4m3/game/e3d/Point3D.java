package iH4v3n0N4m3.e3d;

public class Point3D{
 private final int x,y,z;
 protected Point3D(int x,int y,int z){
  this.x=x;
  this.y=y;
  this.z=z;
 }
 protected Point3D(){
  this(null,null,null);
 }
 public static Point3D locate(int x,int y,int z){
  return new Point3D(x,y,z);
 }
 public static Point3D locate(){
  return new Point3D();
 }
 public void setXCoordinate(int x){
  this.x=x;
 }
 public void setYCoordinate(int y){
  this.y=y;
 }
 public void setZCoordinate(int z){
  this.z=z;
 }
 public int getXCoordinate(int x){
  return x;
 }
 public int getYCoordinate(int y){
  return y;
 }
 public int getZCoordinate(int z){
  return z;
 }
}

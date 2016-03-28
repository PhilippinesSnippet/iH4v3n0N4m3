package iH4v3n0N4m3.game.e3d;

public class PolyPoint3D{
 private final int x,y,z;
 private final int[] xp;
 private final int[] yp;
 protected PolyPoint3D(int x,int y,int z,int xp,int yp){
  this.x=x;
  this.y=y;
  this.z=z;
  this.xp=xp;
  this.yp=yp;
 }
 protected PolyPoint3D(){
  this(null,null,null,null,null);
 }
 public static PolyPoint3D locate(int x,int y,int z,int xp,int yp){
  return new Point3D(x,y,z,xp,yp);
 }
 public static PolyPoint3D locate(){
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
 public int[] getXCoordinates(){
  return xp;
 }
 public int[] getYCoordinates(){
  return yp;
 }
}

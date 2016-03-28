package iH4v3n0N4m3.game.e3d;

import iH4v3n0N4m3.ui.Color;

public class Vertex{
 protected Vertex(){}
 
 private final int x;
 private final int y;
 private final int z;
 private final Color bg;
 private final Color fg;
 private final Point3D lig;
 private final boolean shd;
 private final boolean lck;
 private final DrawType dt;
 private final float luminusity;
 
 public void setXAxisRotation(int x){
  this.x=x;
 }
 public void setYAxisRotation(int y){
  this.y=y;
 }
 public void setZAxisRotation(int z){
  this.z=z;
 }
 public void setBackground(Color bg){
  this.bg=bg;
 }
 public void setForeground(Color fg){
  this.fg=fg;
 }
 public void setSunLocation(Point3D lig){
  this.lig=lig;
 }
 public void setShadowCastingOn(boolean shd){
  this.shd=shd;
 }
 public void set3DMapLockOn(boolean lck){
  this.lck=lck;
 }
 public void setDrawType(DrawType dt){
  this.dt=dt;
 }
 public void setLightLuminosity(float luminosity){
  this.luminosity=luminosity;
 }
}

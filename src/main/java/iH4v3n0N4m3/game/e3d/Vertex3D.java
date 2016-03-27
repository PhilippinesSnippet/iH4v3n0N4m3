package iH4v3n0N4m3.e3d;

import iH4v3n0N4m3.image.Image;

public abstract class Vertex3D{
 protected Vertex3D(){}
 public abstract void draw3DDot(Point3D p);
 public abstract void draw3DRectangle(Point3D p,int w,int h);
 public abstract void draw3DSquare(Point3D p,int s);
 public abstract void draw3DPolygon(PolyPoint3D p);
 public abstract void draw3DPolyline(PolyPoint3D p);
 public abstract void draw3DLine(Point3D p1,Point p2);
 public abstract void draw3DOval(Point3D p,int w,int w);
 public abstract void draw3DCircle(Point3D p,int r);
 public abstract void draw3DImage(Point3D p,Image i)throws Vertex3DException;
 public abstract void draw3DChars(Point3D p,char[] c);
 public abstract void draw3DChars(Point3D p,char[] c,int o);
 public abstract void draw3DBytes(Point3D p,byte[] b);
 public abstract void draw3DBytes(Point3D p,byte[] b,int o);
}

package iH4v3n0N4m3.e3d;

public abstract class Vertex3D{
 protected Vertex3D(){}
 public abstract void draw3DDot(Point3D p);
 public abstract void draw3DRectangle(Point3D p);
 public abstract void draw3DSquare(Point3D p);
 public abstract void draw3DPolygon(PolyPoint3D p);
 public abstract void draw3DPolyline(PolyPoint3D p);
}

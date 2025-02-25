// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btSpatialMotionVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSpatialMotionVector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSpatialMotionVector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSpatialMotionVector position(long position) {
        return (btSpatialMotionVector)super.position(position);
    }
    @Override public btSpatialMotionVector getPointer(long i) {
        return new btSpatialMotionVector((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_topVec(); public native btSpatialMotionVector m_topVec(btVector3 setter);
	public native @ByRef btVector3 m_bottomVec(); public native btSpatialMotionVector m_bottomVec(btVector3 setter);
	//
	public btSpatialMotionVector() { super((Pointer)null); allocate(); }
	private native void allocate();
	public btSpatialMotionVector(@Const @ByRef btVector3 angular, @Const @ByRef btVector3 linear) { super((Pointer)null); allocate(angular, linear); }
	private native void allocate(@Const @ByRef btVector3 angular, @Const @ByRef btVector3 linear);
	//
	public native void setVector(@Const @ByRef btVector3 angular, @Const @ByRef btVector3 linear);
	public native void setValue(@Cast("const btScalar") double ax, @Cast("const btScalar") double ay, @Cast("const btScalar") double az, @Cast("const btScalar") double lx, @Cast("const btScalar") double ly, @Cast("const btScalar") double lz);
	//
	public native void addVector(@Const @ByRef btVector3 angular, @Const @ByRef btVector3 linear);
	public native void addValue(@Cast("const btScalar") double ax, @Cast("const btScalar") double ay, @Cast("const btScalar") double az, @Cast("const btScalar") double lx, @Cast("const btScalar") double ly, @Cast("const btScalar") double lz);
	//
	public native @Const @ByRef btVector3 getAngular();
	public native @Const @ByRef btVector3 getLinear();
	//
	public native void setAngular(@Const @ByRef btVector3 angular);
	public native void setLinear(@Const @ByRef btVector3 linear);
	//
	public native void addAngular(@Const @ByRef btVector3 angular);
	public native void addLinear(@Const @ByRef btVector3 linear);
	//
	public native void setZero();
	//
	public native @Cast("btScalar") double dot(@Const @ByRef btSpatialForceVector b);
	//
	//
	public native @ByRef @Name("operator +=") btSpatialMotionVector addPut(@Const @ByRef btSpatialMotionVector vec);
	public native @ByRef @Name("operator -=") btSpatialMotionVector subtractPut(@Const @ByRef btSpatialMotionVector vec);
	public native @ByRef @Name("operator *=") btSpatialMotionVector multiplyPut(@Cast("const btScalar") double s);
	public native @ByVal @Name("operator -") btSpatialMotionVector subtract(@Const @ByRef btSpatialMotionVector vec);
	public native @ByVal @Name("operator +") btSpatialMotionVector add(@Const @ByRef btSpatialMotionVector vec);
	public native @ByVal @Name("operator -") btSpatialMotionVector subtract();
	public native @ByVal @Name("operator *") btSpatialMotionVector multiply(@Cast("const btScalar") double s);
}

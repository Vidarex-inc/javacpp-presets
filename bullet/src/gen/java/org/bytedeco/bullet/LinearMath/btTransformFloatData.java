// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**for serialization */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btTransformFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btTransformFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTransformFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTransformFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btTransformFloatData position(long position) {
        return (btTransformFloatData)super.position(position);
    }
    @Override public btTransformFloatData getPointer(long i) {
        return new btTransformFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btMatrix3x3FloatData m_basis(); public native btTransformFloatData m_basis(btMatrix3x3FloatData setter);
	public native @ByRef btVector3FloatData m_origin(); public native btTransformFloatData m_origin(btVector3FloatData setter);
}

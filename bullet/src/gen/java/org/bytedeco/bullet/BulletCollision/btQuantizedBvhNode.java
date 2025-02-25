// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btQuantizedBvhNode is a compressed aabb node, 16 bytes.
 * Node can be used for leafnode or internal node. Leafnodes can point to 32-bit triangle index (non-negative range). */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btQuantizedBvhNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btQuantizedBvhNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuantizedBvhNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuantizedBvhNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btQuantizedBvhNode position(long position) {
        return (btQuantizedBvhNode)super.position(position);
    }
    @Override public btQuantizedBvhNode getPointer(long i) {
        return new btQuantizedBvhNode((Pointer)this).offsetAddress(i);
    }


	//12 bytes
	public native @Cast("unsigned short int") short m_quantizedAabbMin(int i); public native btQuantizedBvhNode m_quantizedAabbMin(int i, short setter);
	@MemberGetter public native @Cast("unsigned short int*") ShortPointer m_quantizedAabbMin();
	public native @Cast("unsigned short int") short m_quantizedAabbMax(int i); public native btQuantizedBvhNode m_quantizedAabbMax(int i, short setter);
	@MemberGetter public native @Cast("unsigned short int*") ShortPointer m_quantizedAabbMax();
	//4 bytes
	public native int m_escapeIndexOrTriangleIndex(); public native btQuantizedBvhNode m_escapeIndexOrTriangleIndex(int setter);

	public native @Cast("bool") boolean isLeafNode();
	public native int getEscapeIndex();
	public native int getTriangleIndex();
	public native int getPartId();
}

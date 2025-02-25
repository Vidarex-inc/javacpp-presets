// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

// #else
// #endif

/**\brief The btTransform class supports rigid transforms with only translation and rotation and no scaling/shear.
 *It can be used in combination with btVector3, btQuaternion and btMatrix3x3 linear algebra classes. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btTransform extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTransform(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTransform(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTransform position(long position) {
        return (btTransform)super.position(position);
    }
    @Override public btTransform getPointer(long i) {
        return new btTransform((Pointer)this).offsetAddress(i);
    }

	/**\brief No initialization constructor */
	public btTransform() { super((Pointer)null); allocate(); }
	private native void allocate();
	/**\brief Constructor from btQuaternion (optional btVector3 )
   * @param q Rotation from quaternion 
   * @param c Translation from Vector (default 0,0,0) */
	public btTransform(@Const @ByRef btQuaternion q,
											   @Const @ByRef(nullValue = "btVector3(btScalar(0), btScalar(0), btScalar(0))") btVector3 c) { super((Pointer)null); allocate(q, c); }
	private native void allocate(@Const @ByRef btQuaternion q,
											   @Const @ByRef(nullValue = "btVector3(btScalar(0), btScalar(0), btScalar(0))") btVector3 c);
	public btTransform(@Const @ByRef btQuaternion q) { super((Pointer)null); allocate(q); }
	private native void allocate(@Const @ByRef btQuaternion q);

	/**\brief Constructor from btMatrix3x3 (optional btVector3)
   * @param b Rotation from Matrix 
   * @param c Translation from Vector default (0,0,0)*/
	public btTransform(@Const @ByRef btMatrix3x3 b,
											   @Const @ByRef(nullValue = "btVector3(btScalar(0), btScalar(0), btScalar(0))") btVector3 c) { super((Pointer)null); allocate(b, c); }
	private native void allocate(@Const @ByRef btMatrix3x3 b,
											   @Const @ByRef(nullValue = "btVector3(btScalar(0), btScalar(0), btScalar(0))") btVector3 c);
	public btTransform(@Const @ByRef btMatrix3x3 b) { super((Pointer)null); allocate(b); }
	private native void allocate(@Const @ByRef btMatrix3x3 b);
	/**\brief Copy constructor */
	public btTransform(@Const @ByRef btTransform other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef btTransform other);
	/**\brief Assignment Operator */
	public native @ByRef @Name("operator =") btTransform put(@Const @ByRef btTransform other);

	/**\brief Set the current transform as the value of the product of two transforms
   * @param t1 Transform 1
   * @param t2 Transform 2
   * This = Transform1 * Transform2 */
	public native void mult(@Const @ByRef btTransform t1, @Const @ByRef btTransform t2);

	/*		void multInverseLeft(const btTransform& t1, const btTransform& t2) {
			btVector3 v = t2.m_origin - t1.m_origin;
			m_basis = btMultTransposeLeft(t1.m_basis, t2.m_basis);
			m_origin = v * t1.m_basis;
		}
		*/

	/**\brief Return the transform of the vector */
	public native @ByVal @Name("operator ()") btVector3 apply(@Const @ByRef btVector3 x);

	/**\brief Return the transform of the vector */
	public native @ByVal @Name("operator *") btVector3 multiply(@Const @ByRef btVector3 x);

	/**\brief Return the transform of the btQuaternion */
	public native @ByVal @Name("operator *") btQuaternion multiply(@Const @ByRef btQuaternion q);

	/**\brief Return the basis matrix for the rotation */
	public native @ByRef btMatrix3x3 getBasis();
	/**\brief Return the basis matrix for the rotation */

	/**\brief Return the origin vector translation */
	public native @ByRef btVector3 getOrigin();
	/**\brief Return the origin vector translation */

	/**\brief Return a quaternion representing the rotation */
	public native @ByVal btQuaternion getRotation();

	/**\brief Set from an array 
   * @param m A pointer to a 16 element array (12 rotation(row major padded on the right by 1), and 3 translation */
	public native void setFromOpenGLMatrix(@Cast("const btScalar*") DoublePointer m);
	public native void setFromOpenGLMatrix(@Cast("const btScalar*") DoubleBuffer m);
	public native void setFromOpenGLMatrix(@Cast("const btScalar*") double[] m);

	/**\brief Fill an array representation
   * @param m A pointer to a 16 element array (12 rotation(row major padded on the right by 1), and 3 translation */
	public native void getOpenGLMatrix(@Cast("btScalar*") DoublePointer m);
	public native void getOpenGLMatrix(@Cast("btScalar*") DoubleBuffer m);
	public native void getOpenGLMatrix(@Cast("btScalar*") double[] m);

	/**\brief Set the translational element
   * @param origin The vector to set the translation to */
	public native void setOrigin(@Const @ByRef btVector3 origin);

	public native @ByVal btVector3 invXform(@Const @ByRef btVector3 inVec);

	/**\brief Set the rotational element by btMatrix3x3 */
	public native void setBasis(@Const @ByRef btMatrix3x3 basis);

	/**\brief Set the rotational element by btQuaternion */
	public native void setRotation(@Const @ByRef btQuaternion q);

	/**\brief Set this transformation to the identity */
	public native void setIdentity();

	/**\brief Multiply this Transform by another(this = this * another) 
   * @param t The other transform */
	public native @ByRef @Name("operator *=") btTransform multiplyPut(@Const @ByRef btTransform t);

	/**\brief Return the inverse of this transform */
	public native @ByVal btTransform inverse();

	/**\brief Return the inverse of this transform times the other transform
   * @param t The other transform 
   * return this.inverse() * the other */
	public native @ByVal btTransform inverseTimes(@Const @ByRef btTransform t);

	/**\brief Return the product of this transform and the other */
	public native @ByVal @Name("operator *") btTransform multiply(@Const @ByRef btTransform t);

	/**\brief Return an identity transform */
	public static native @Const @ByRef btTransform getIdentity();

	public native void serialize(@ByRef btTransformDoubleData dataOut);

	public native void serializeFloat(@ByRef btTransformFloatData dataOut);

	public native void deSerialize(@Const @ByRef btTransformDoubleData dataIn);

	public native void deSerializeDouble(@Const @ByRef btTransformDoubleData dataIn);

	public native void deSerializeFloat(@Const @ByRef btTransformFloatData dataIn);
}

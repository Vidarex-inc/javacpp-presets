// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Packed function is a type-erased function.
 *  The arguments are passed by packed format.
 *
 *  This is an useful unified interface to call generated functions,
 *  It is the unified function function type of TVM.
 *  It corresponds to TVMFunctionHandle in C runtime API.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class PackedFunc extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedFunc(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PackedFunc(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PackedFunc position(long position) {
        return (PackedFunc)super.position(position);
    }
    @Override public PackedFunc getPointer(long i) {
        return new PackedFunc((Pointer)this).offsetAddress(i);
    }

  /** \brief Constructor from null */  // NOLINT(*)
  /**
   * \brief Constructing a packed function from a callable type
   *        whose signature is consistent with {@code PackedFunc}
   * @param data the internal container of packed function.
   */
  /**
   * \brief Call packed function by directly passing in unpacked format.
   * @param args Arguments to be passed.
   * \tparam Args arguments to be passed.
   *
   * <pre>{@code
   *   // Example code on how to call packed function
   *   void CallPacked(PackedFunc f) {
   *     // call like normal functions by pass in arguments
   *     // return value is automatically converted back
   *     int rvalue = f(1, 2.0);
   *   }
   * }</pre>
   */
  /**
   * \brief Call the function in packed format.
   * @param args The arguments
   * @param rv The return value.
   */
  public native void CallPacked(@ByVal TVMArgs args, TVMRetValue rv);
  /** @return Whether the packed function is nullptr */
  /** @return Whether the packed function is not nullptr */

  public PackedFunc() { super((Pointer)null); allocate(); }
  private native void allocate();
  public PackedFunc(@ByVal ObjectPtr n) { super((Pointer)null); allocate(n); }
  private native void allocate(@ByVal ObjectPtr n);
  public PackedFunc(@Const @ByRef PackedFunc other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef PackedFunc other);
  public native @ByRef @Name("operator =") PackedFunc put(@Const @ByRef PackedFunc other);
  public native @Const @Name("operator ->") PackedFuncObj access();
  public native @Const PackedFuncObj get();
}

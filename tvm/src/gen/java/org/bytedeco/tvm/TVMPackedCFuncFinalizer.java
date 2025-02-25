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
 * \brief C callback to free the resource handle in C packed function.
 * @param resource_handle The handle additional resouce handle from front-end.
 */
@Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMPackedCFuncFinalizer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TVMPackedCFuncFinalizer(Pointer p) { super(p); }
    protected TVMPackedCFuncFinalizer() { allocate(); }
    private native void allocate();
    public native void call(Pointer resource_handle);
}

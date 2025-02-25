// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/**
 * \brief Callback for querying the link.
 *
 * Returns the size of the buffer needed.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5L_query_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5L_query_func_t(Pointer p) { super(p); }
    protected H5L_query_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("ssize_t") long call(@Cast("const char*") BytePointer link_name, @Const Pointer lnkdata, @Cast("size_t") long lnkdata_size,
                                    Pointer buf, @Cast("size_t") long buf_size);
}

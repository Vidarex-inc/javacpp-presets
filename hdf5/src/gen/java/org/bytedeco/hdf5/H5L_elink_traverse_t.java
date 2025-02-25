// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5L_iterate2_t_snip] -->
<p>
/**
 * \brief Callback for external link traversal
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5L_elink_traverse_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5L_elink_traverse_t(Pointer p) { super(p); }
    protected H5L_elink_traverse_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("const char*") BytePointer parent_file_name, @Cast("const char*") BytePointer parent_group_name,
                                       @Cast("const char*") BytePointer child_file_name, @Cast("const char*") BytePointer child_object_name,
                                       @Cast("unsigned*") IntPointer acc_flags, @Cast("hid_t") long fapl_id, Pointer op_data);
}

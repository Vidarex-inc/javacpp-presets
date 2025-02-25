// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class H5Object
    \brief Class H5Object is a bridge between H5Location and DataSet, DataType,
     and Group.
    <p>
    Modification:
        Sept 18, 2012: Added class H5Location in between IdComponent and
                H5Object.  An H5File now inherits from H5Location.  All HDF5
                wrappers in H5Object are moved up to H5Location.  H5Object
                is left mostly empty for future wrappers that are only for
                group, dataset, and named datatype.  Note that the reason for
                adding H5Location instead of simply moving H5File to be under
                H5Object is H5File is not an HDF5 object, and renaming H5Object
                to H5Location will risk breaking user applications.
                -BMR
        Apr 2, 2014: Added wrapper getObjName for H5Iget_name
        Sep 21, 2016: Rearranging classes (HDFFV-9920) moved H5A wrappers back
                into H5Object.  This way, C functions that takes attribute id
                can be in H5Location and those that cannot take attribute id
                can be in H5Object.
*/
// Inheritance: H5Location -> IdComponent

// Define the operator function pointer for H5Aiterate().
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class attr_operator_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    attr_operator_t(Pointer p) { super(p); }
    protected attr_operator_t() { allocate(); }
    private native void allocate();
    public native void call( @ByRef H5Object loc/*in*/,
            @Cast({"", "std::string", "std::string&"}) @Adapter("StringAdapter<char>") BytePointer attr_name/*in*/,
            Pointer operator_data/*in,out*/);
}

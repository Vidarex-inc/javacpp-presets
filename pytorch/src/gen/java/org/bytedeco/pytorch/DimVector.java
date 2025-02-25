// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** This is a 'vector' (really, a variable-sized array), optimized
 *  for the case when the array is small.  It contains some number of elements
 *  in-place, which allows it to avoid heap allocation when the actual number of
 *  elements is below that threshold.  This allows normal "small" cases to be
 *  fast without losing generality for large inputs.
 * 
 *  \note
 *  In the absence of a well-motivated choice for the number of inlined
 *  elements \p N, it is recommended to use \c SmallVector<T> (that is,
 *  omitting the \p N). This will choose a default number of inlined elements
 *  reasonable for allocation on the stack (for example, trying to keep \c
 *  sizeof(SmallVector<T>) around 64 bytes).
 * 
 *  \warning This does not attempt to be exception safe.
 * 
 *  @see https://llvm.org/docs/ProgrammersManual.html#llvm-adt-smallvector-h */
@Name("c10::SmallVector<int64_t,at::kDimVectorStaticSize>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DimVector extends DimVectorImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DimVector(Pointer p) { super(p); }

  public DimVector() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DimVector(@Cast("size_t") long Size, @Cast("const int64_t") long Value/*=int64_t()*/) { super((Pointer)null); allocate(Size, Value); }
  private native void allocate(@Cast("size_t") long Size, @Cast("const int64_t") long Value/*=int64_t()*/);
  public DimVector(@Cast("size_t") long Size) { super((Pointer)null); allocate(Size); }
  private native void allocate(@Cast("size_t") long Size);

  // note: The enable_if restricts Container to types that have a .begin() and
  // .end() that return valid input iterators.

  public DimVector(@Const @ByRef DimVector RHS) { super((Pointer)null); allocate(RHS); }
  private native void allocate(@Const @ByRef DimVector RHS);

  public native @ByRef @Name("operator =") DimVector put(@Const @ByRef DimVector RHS);

  // note: The enable_if restricts Container to types that have a .begin() and
  // .end() that return valid input iterators.

  

  

  // note: The enable_if restricts Container to types that have a .begin() and
  // .end() that return valid input iterators.
}

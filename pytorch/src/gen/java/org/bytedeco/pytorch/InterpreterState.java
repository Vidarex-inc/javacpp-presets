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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InterpreterState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterpreterState(Pointer p) { super(p); }

  public InterpreterState(
        @Const @ByRef Code code,
        @ByVal(nullValue = "torch::jit::TaskLauncher(at::launch)") @Cast("torch::jit::TaskLauncher*") Pointer taskLauncher) { super((Pointer)null); allocate(code, taskLauncher); }
  private native void allocate(
        @Const @ByRef Code code,
        @ByVal(nullValue = "torch::jit::TaskLauncher(at::launch)") @Cast("torch::jit::TaskLauncher*") Pointer taskLauncher);
  public InterpreterState(
        @Const @ByRef Code code) { super((Pointer)null); allocate(code); }
  private native void allocate(
        @Const @ByRef Code code);
  public native void run(@ByRef IValueVector stack);
}

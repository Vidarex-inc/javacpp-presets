// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OperatorSetProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorSetProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OperatorSetProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OperatorSetProto position(long position) {
        return (OperatorSetProto)super.position(position);
    }
    @Override public OperatorSetProto getPointer(long i) {
        return new OperatorSetProto((Pointer)this).offsetAddress(i);
    }

  public OperatorSetProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OperatorSetProto(@Const @ByRef OperatorSetProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OperatorSetProto from);

  public native @ByRef @Name("operator =") OperatorSetProto put(@Const @ByRef OperatorSetProto from);

  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Const Reflection GetReflection();
  public static native @Const @ByRef OperatorSetProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OperatorSetProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(OperatorSetProto other);

  // implements Message ----------------------------------------------

  public native OperatorSetProto New();

  public native OperatorSetProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OperatorSetProto from);
  public native void MergeFrom(@Const @ByRef OperatorSetProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::OperatorSetProto:: */
  public static final int
    kOperatorFieldNumber = 8,
    kFunctionsFieldNumber = 9,
    kMagicFieldNumber = 1,
    kIrVersionPrereleaseFieldNumber = 3,
    kDomainFieldNumber = 4,
    kDocStringFieldNumber = 6,
    kIrBuildMetadataFieldNumber = 7,
    kIrVersionFieldNumber = 2,
    kOpsetVersionFieldNumber = 5;
  // repeated .onnx.OperatorProto operator = 8;
  public native int operator__size();
  public native void clear_operator_();
  public native OperatorProto mutable_operator_(int index);
  public native @Const @ByRef OperatorProto operator_(int index);
  public native OperatorProto add_operator_();

  // repeated .onnx.FunctionProto functions = 9;
  public native int functions_size();
  public native void clear_functions();
  public native FunctionProto mutable_functions(int index);
  public native @Const @ByRef FunctionProto functions(int index);
  public native FunctionProto add_functions();

  // optional string magic = 1;
  public native @Cast("bool") boolean has_magic();
  public native void clear_magic();
  public native @StdString BytePointer magic();
  public native void set_magic(@StdString BytePointer value);
  public native void set_magic(@StdString String value);
  public native void set_magic(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_magic(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_magic();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_magic();
  public native void set_allocated_magic(@StdString @Cast({"char*", "std::string*"}) BytePointer magic);

  // optional string ir_version_prerelease = 3;
  public native @Cast("bool") boolean has_ir_version_prerelease();
  public native void clear_ir_version_prerelease();
  public native @StdString BytePointer ir_version_prerelease();
  public native void set_ir_version_prerelease(@StdString BytePointer value);
  public native void set_ir_version_prerelease(@StdString String value);
  public native void set_ir_version_prerelease(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_ir_version_prerelease(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_ir_version_prerelease();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_ir_version_prerelease();
  public native void set_allocated_ir_version_prerelease(@StdString @Cast({"char*", "std::string*"}) BytePointer ir_version_prerelease);

  // optional string domain = 4;
  public native @Cast("bool") boolean has_domain();
  public native void clear_domain();
  public native @StdString BytePointer domain();
  public native void set_domain(@StdString BytePointer value);
  public native void set_domain(@StdString String value);
  public native void set_domain(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_domain(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_domain();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_domain();
  public native void set_allocated_domain(@StdString @Cast({"char*", "std::string*"}) BytePointer domain);

  // optional string doc_string = 6;
  public native @Cast("bool") boolean has_doc_string();
  public native void clear_doc_string();
  public native @StdString BytePointer doc_string();
  public native void set_doc_string(@StdString BytePointer value);
  public native void set_doc_string(@StdString String value);
  public native void set_doc_string(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_doc_string(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_doc_string();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_doc_string();
  public native void set_allocated_doc_string(@StdString @Cast({"char*", "std::string*"}) BytePointer doc_string);

  // optional string ir_build_metadata = 7;
  public native @Cast("bool") boolean has_ir_build_metadata();
  public native void clear_ir_build_metadata();
  public native @StdString BytePointer ir_build_metadata();
  public native void set_ir_build_metadata(@StdString BytePointer value);
  public native void set_ir_build_metadata(@StdString String value);
  public native void set_ir_build_metadata(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_ir_build_metadata(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_ir_build_metadata();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_ir_build_metadata();
  public native void set_allocated_ir_build_metadata(@StdString @Cast({"char*", "std::string*"}) BytePointer ir_build_metadata);

  // optional int64 ir_version = 2;
  public native @Cast("bool") boolean has_ir_version();
  public native void clear_ir_version();
  public native @Cast("google::protobuf::int64") long ir_version();
  public native void set_ir_version(@Cast("google::protobuf::int64") long value);

  // optional int64 opset_version = 5;
  public native @Cast("bool") boolean has_opset_version();
  public native void clear_opset_version();
  public native @Cast("google::protobuf::int64") long opset_version();
  public native void set_opset_version(@Cast("google::protobuf::int64") long value);
}

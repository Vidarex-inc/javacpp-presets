// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IPluginRegistry
 * 
 *  \brief Single registration point for all plugins in an application. It is
 *  used to find plugin implementations during engine deserialization.
 *  Internally, the plugin registry is considered to be a singleton so all
 *  plugins in an application are part of the same global registry.
 *  Note that the plugin registry is only supported for plugins of type
 *  IPluginV2 and should also have a corresponding IPluginCreator implementation.
 * 
 *  @see IPluginV2 and IPluginCreator
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 * 
 *  \warning In the automotive safety context, be sure to call IPluginRegistry::setErrorRecorder() to register
 *  an error recorder with the registry before using other methods in the registry.
 *  */

@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginRegistry(Pointer p) { super(p); }

    /**
     *  \brief Register a plugin creator. Returns false if one with same type
     *  is already registered.
     * 
     *  \warning The string pluginNamespace must be 1024 bytes or less including the NULL terminator and must be NULL
     *  terminated.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes; calls to this method will be synchronized by a mutex.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean registerCreator(@ByRef IPluginCreator creator, String pluginNamespace);
    public native @Cast("bool") @NoException(true) boolean registerCreator(@ByRef IPluginCreator creator, @Cast("const char*") BytePointer pluginNamespace);

    /**
     *  \brief Return all the registered plugin creators and the number of
     *  registered plugin creators. Returns nullptr if none found.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: No
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::IPluginCreator*const*") PointerPointer getPluginCreatorList(IntPointer numCreators);

    /**
     *  \brief Return plugin creator based on plugin name, version, and
     *  namespace associated with plugin during network creation.
     * 
     *  \warning The strings pluginName, pluginVersion, and pluginNamespace must be 1024 bytes or less including the
     *  NULL terminator and must be NULL terminated.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     *  */
    public native @NoException(true) IPluginCreator getPluginCreator(String pluginName, String pluginVersion,
            String pluginNamespace/*=""*/);
    public native @NoException(true) IPluginCreator getPluginCreator(String pluginName, String pluginVersion);
    public native @NoException(true) IPluginCreator getPluginCreator(@Cast("const char*") BytePointer pluginName, @Cast("const char*") BytePointer pluginVersion,
            @Cast("const char*") BytePointer pluginNamespace/*=""*/);
    public native @NoException(true) IPluginCreator getPluginCreator(@Cast("const char*") BytePointer pluginName, @Cast("const char*") BytePointer pluginVersion);

    // @cond SuppressDoxyWarnings
    
    
    
    
    /**
     *  \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  @param recorder The error recorder to register with this interface. */
    //
    /** @see getErrorRecorder()
    /**
    /** \u005Cusage
    /** - Allowed context for the API call
    /**   - Thread-safe: No
    /** */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief Set the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A default error recorder does not exist,
     *  so a nullptr will be returned if setErrorRecorder has not been called, or an ErrorRecorder has not been
     *  inherited.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder()
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IErrorRecorder getErrorRecorder();

    /**
     *  \brief Deregister a previously registered plugin creator.
     * 
     *  Since there may be a desire to limit the number of plugins,
     *  this function provides a mechanism for removing plugin creators registered in TensorRT.
     *  The plugin creator that is specified by \p creator is removed from TensorRT and no longer tracked.
     * 
     *  @return True if the plugin creator was deregistered, false if it was not found in the registry or otherwise
     *  could
     *      not be deregistered.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes
     *  */
    public native @Cast("bool") @NoException(true) boolean deregisterCreator(@Const @ByRef IPluginCreator creator);
}

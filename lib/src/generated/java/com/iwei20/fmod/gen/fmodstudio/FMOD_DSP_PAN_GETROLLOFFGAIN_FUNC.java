// Generated by jextract

package com.iwei20.fmod.gen.fmodstudio;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef FMOD_RESULT (*FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC)(FMOD_DSP_STATE *, FMOD_DSP_PAN_3D_ROLLOFF_TYPE, float, float, float, float *)
 * }
 */
public final class FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC {

    private FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment dsp_state, int rolloff, float distance, float mindistance, float maxdistance, MemorySegment gain);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        fmod_studio_h.C_INT,
        fmod_studio_h.C_POINTER,
        fmod_studio_h.C_INT,
        fmod_studio_h.C_FLOAT,
        fmod_studio_h.C_FLOAT,
        fmod_studio_h.C_FLOAT,
        fmod_studio_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = fmod_studio_h.upcallHandle(FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr, MemorySegment dsp_state, int rolloff, float distance, float mindistance, float maxdistance, MemorySegment gain) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, dsp_state, rolloff, distance, mindistance, maxdistance, gain);
        } catch (Error | RuntimeException ex) {
            throw ex;
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


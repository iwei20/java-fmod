// Generated by jextract

package com.iwei20.fmod.gen.fmod;

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
 * struct FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR {
 *     int numpoints;
 *     float *pointparamvalues;
 *     float *pointpositions;
 * }
 * }
 */
public class FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR {

    FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        fmod_h.C_INT.withName("numpoints"),
        MemoryLayout.paddingLayout(4),
        fmod_h.C_POINTER.withName("pointparamvalues"),
        fmod_h.C_POINTER.withName("pointpositions")
    ).withName("FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt numpoints$LAYOUT = (OfInt)$LAYOUT.select(groupElement("numpoints"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int numpoints
     * }
     */
    public static final OfInt numpoints$layout() {
        return numpoints$LAYOUT;
    }

    private static final long numpoints$OFFSET = $LAYOUT.byteOffset(groupElement("numpoints"));

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int numpoints
     * }
     */
    public static final long numpoints$offset() {
        return numpoints$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int numpoints
     * }
     */
    public static int numpoints(MemorySegment struct) {
        return struct.get(numpoints$LAYOUT, numpoints$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int numpoints
     * }
     */
    public static void numpoints(MemorySegment struct, int fieldValue) {
        struct.set(numpoints$LAYOUT, numpoints$OFFSET, fieldValue);
    }

    private static final AddressLayout pointparamvalues$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pointparamvalues"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float *pointparamvalues
     * }
     */
    public static final AddressLayout pointparamvalues$layout() {
        return pointparamvalues$LAYOUT;
    }

    private static final long pointparamvalues$OFFSET = $LAYOUT.byteOffset(groupElement("pointparamvalues"));

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float *pointparamvalues
     * }
     */
    public static final long pointparamvalues$offset() {
        return pointparamvalues$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float *pointparamvalues
     * }
     */
    public static MemorySegment pointparamvalues(MemorySegment struct) {
        return struct.get(pointparamvalues$LAYOUT, pointparamvalues$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float *pointparamvalues
     * }
     */
    public static void pointparamvalues(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pointparamvalues$LAYOUT, pointparamvalues$OFFSET, fieldValue);
    }

    private static final AddressLayout pointpositions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pointpositions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float *pointpositions
     * }
     */
    public static final AddressLayout pointpositions$layout() {
        return pointpositions$LAYOUT;
    }

    private static final long pointpositions$OFFSET = $LAYOUT.byteOffset(groupElement("pointpositions"));

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float *pointpositions
     * }
     */
    public static final long pointpositions$offset() {
        return pointpositions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float *pointpositions
     * }
     */
    public static MemorySegment pointpositions(MemorySegment struct) {
        return struct.get(pointpositions$LAYOUT, pointpositions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float *pointpositions
     * }
     */
    public static void pointpositions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pointpositions$LAYOUT, pointpositions$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}


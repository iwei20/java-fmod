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
 * struct FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES {
 *     FMOD_GUID eventid;
 *     FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties;
 * }
 * }
 */
public class FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES {

    FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FMOD_GUID.layout().withName("eventid"),
        FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.layout().withName("properties")
    ).withName("FMOD_STUDIO_TIMELINE_NESTED_BEAT_PROPERTIES");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout eventid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("eventid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FMOD_GUID eventid
     * }
     */
    public static final GroupLayout eventid$layout() {
        return eventid$LAYOUT;
    }

    private static final long eventid$OFFSET = $LAYOUT.byteOffset(groupElement("eventid"));

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FMOD_GUID eventid
     * }
     */
    public static final long eventid$offset() {
        return eventid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FMOD_GUID eventid
     * }
     */
    public static MemorySegment eventid(MemorySegment struct) {
        return struct.asSlice(eventid$OFFSET, eventid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FMOD_GUID eventid
     * }
     */
    public static void eventid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, eventid$OFFSET, eventid$LAYOUT.byteSize());
    }

    private static final GroupLayout properties$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties
     * }
     */
    public static final GroupLayout properties$layout() {
        return properties$LAYOUT;
    }

    private static final long properties$OFFSET = $LAYOUT.byteOffset(groupElement("properties"));

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties
     * }
     */
    public static final long properties$offset() {
        return properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties
     * }
     */
    public static MemorySegment properties(MemorySegment struct) {
        return struct.asSlice(properties$OFFSET, properties$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES properties
     * }
     */
    public static void properties(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, properties$OFFSET, properties$LAYOUT.byteSize());
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


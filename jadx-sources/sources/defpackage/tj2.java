package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tj2 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof tj2) {
            if (this.a != ((tj2) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 16) {
            return "Confirm";
        }
        if (b == 6) {
            return "ContextClick";
        }
        if (b == 13) {
            return "GestureEnd";
        }
        if (b == 23) {
            return "GestureThresholdActivate";
        }
        if (b == 3) {
            return "KeyboardTap";
        }
        if (b == 0) {
            return "LongPress";
        }
        if (b == 17) {
            return "Reject";
        }
        if (b == 27) {
            return "SegmentFrequentTick";
        }
        if (b == 26) {
            return "SegmentTick";
        }
        if (b == 9) {
            return "TextHandleMove";
        }
        if (b == 22) {
            return "ToggleOff";
        }
        if (b == 21) {
            return "ToggleOn";
        }
        if (b == 1) {
            return "VirtualKey";
        }
        return "Invalid";
    }
}

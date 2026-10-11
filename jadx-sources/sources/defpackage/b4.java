package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b4 {
    public static final b4 d;
    public static final b4 e;
    public static final b4 f;
    public static final b4 g;
    public static final b4 h;
    public static final b4 i;
    public static final b4 j;
    public static final b4 k;
    public final Object a;
    public final int b;
    public final Class c;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        int i2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = null;
        new b4(1, (String) null);
        new b4(2, (String) null);
        new b4(4, (String) null);
        new b4(8, (String) null);
        new b4(16, (String) null);
        new b4(32, (String) null);
        d = new b4(64, (String) null);
        e = new b4(128, (String) null);
        new b4(256, k4.class);
        new b4(512, k4.class);
        new b4(1024, l4.class);
        new b4(2048, l4.class);
        f = new b4(CodedOutputStream.DEFAULT_BUFFER_SIZE, (String) null);
        g = new b4(8192, (String) null);
        new b4(16384, (String) null);
        new b4(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, (String) null);
        new b4(65536, (String) null);
        new b4(131072, p4.class);
        new b4(262144, (String) null);
        new b4(524288, (String) null);
        new b4(1048576, (String) null);
        new b4(2097152, q4.class);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, n4.class);
        h = new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        i = new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        j = new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        k = new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, o4.class);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, m4.class);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new b4(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction = accessibilityAction12;
        } else {
            accessibilityAction = null;
        }
        new b4(accessibilityAction, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i3 >= 30) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction2 = accessibilityAction11;
        } else {
            accessibilityAction2 = null;
        }
        new b4(accessibilityAction2, R.id.accessibilityActionImeEnter, null, null, null);
        if (i3 >= 32) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction3 = null;
        }
        new b4(accessibilityAction3, R.id.ALT, null, null, null);
        if (i3 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction4 = accessibilityAction10;
        } else {
            accessibilityAction4 = null;
        }
        new b4(accessibilityAction4, R.id.CTRL, null, null, null);
        if (i3 >= 32) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction5 = accessibilityAction9;
        } else {
            accessibilityAction5 = null;
        }
        new b4(accessibilityAction5, R.id.FUNCTION, null, null, null);
        if (i3 >= 33) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction6 = accessibilityAction8;
        } else {
            accessibilityAction6 = null;
        }
        new b4(accessibilityAction6, R.id.KEYCODE_0, null, null, null);
        if (i3 >= 34) {
            accessibilityAction7 = s3.a();
        } else {
            accessibilityAction7 = null;
        }
        new b4(accessibilityAction7, R.id.KEYCODE_3D_MODE, null, null, null);
        int i4 = hb0.a;
        if (i3 >= 36) {
            if (i3 >= 36) {
                i2 = Build.VERSION.SDK_INT_FULL;
            } else {
                i2 = i3 * 100000;
            }
            if (i2 >= 3600001) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new b4(accessibilityAction13, R.id.KEYCODE_4, null, null, null);
    }

    public b4(Object obj, int i2, CharSequence charSequence, r4 r4Var, Class cls) {
        this.b = i2;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b4)) {
            return false;
        }
        Object obj2 = ((b4) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c = g4.c(this.b);
        if (c.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c);
        return sb.toString();
    }

    public b4(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public b4(int i2, String str) {
        this(null, i2, str, null, null);
    }
}

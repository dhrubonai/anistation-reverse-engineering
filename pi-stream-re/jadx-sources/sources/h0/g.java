package h0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f4526e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4527f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f4528g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f4529h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f4530i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f4531j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f4532k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f4533l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4535b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f4536c;

    /* renamed from: d, reason: collision with root package name */
    public final u f4537d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        new g(1);
        new g(2);
        new g(4);
        new g(8);
        f4526e = new g(16);
        new g(32);
        new g(64);
        new g(128);
        new g(256, n.class);
        new g(512, n.class);
        new g(1024, o.class);
        new g(2048, o.class);
        f4527f = new g(4096);
        f4528g = new g(8192);
        new g(16384);
        new g(32768);
        new g(65536);
        new g(131072, s.class);
        f4529h = new g(262144);
        f4530i = new g(524288);
        f4531j = new g(1048576);
        new g(2097152, t.class);
        int i10 = Build.VERSION.SDK_INT;
        new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, q.class);
        f4532k = new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f4533l = new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        if (i10 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new g(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i10 >= 29) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction21;
        } else {
            accessibilityAction2 = null;
        }
        new g(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new g(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i10 >= 29) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction20;
        } else {
            accessibilityAction4 = null;
        }
        new g(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new g(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        if (i10 >= 24) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction5 = accessibilityAction19;
        } else {
            accessibilityAction5 = null;
        }
        new g(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, r.class);
        if (i10 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new g(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, p.class);
        if (i10 >= 28) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction7 = accessibilityAction18;
        } else {
            accessibilityAction7 = null;
        }
        new g(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i10 >= 28) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction8 = accessibilityAction17;
        } else {
            accessibilityAction8 = null;
        }
        new g(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i10 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new g(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i10 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction10 = accessibilityAction16;
        } else {
            accessibilityAction10 = null;
        }
        new g(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
        if (i10 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new g(accessibilityAction11, R.id.ALT, null, null, null);
        if (i10 >= 32) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction12 = accessibilityAction15;
        } else {
            accessibilityAction12 = null;
        }
        new g(accessibilityAction12, R.id.CTRL, null, null, null);
        if (i10 >= 32) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction13 = accessibilityAction14;
        } else {
            accessibilityAction13 = null;
        }
        new g(accessibilityAction13, R.id.FUNCTION, null, null, null);
        if (i10 >= 33) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        new g(accessibilityAction22, R.id.KEYCODE_0, null, null, null);
    }

    public g(int i10) {
        this(null, i10, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f4534a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).f4534a;
        Object obj3 = this.f4534a;
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
        Object obj = this.f4534a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public g(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public g(Object obj, int i10, String str, u uVar, Class cls) {
        this.f4535b = i10;
        this.f4537d = uVar;
        if (obj == null) {
            this.f4534a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
        } else {
            this.f4534a = obj;
        }
        this.f4536c = cls;
    }
}

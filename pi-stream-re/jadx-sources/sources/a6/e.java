package a6;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.o;
import com.google.android.material.chip.Chip;
import g0.h0;
import g0.y0;
import h0.h;
import h0.m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class e extends g0.c {
    public static final Rect o = new Rect(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: p, reason: collision with root package name */
    public static final j6.e f117p = new j6.e(6);

    /* renamed from: q, reason: collision with root package name */
    public static final j6.e f118q = new j6.e(7);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f123h;

    /* renamed from: i, reason: collision with root package name */
    public final View f124i;

    /* renamed from: j, reason: collision with root package name */
    public o0.a f125j;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Chip f129n;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f119d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f120e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f121f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f122g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f126k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f127l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f128m = Integer.MIN_VALUE;

    public e(Chip chip, Chip chip2) {
        this.f129n = chip;
        if (chip2 != null) {
            this.f124i = chip2;
            this.f123h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            WeakHashMap weakHashMap = y0.f4277a;
            if (h0.c(chip2) == 0) {
                h0.s(chip2, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // g0.c
    public final o b(View view) {
        if (this.f125j == null) {
            this.f125j = new o0.a(this);
        }
        return this.f125j;
    }

    @Override // g0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // g0.c
    public final void d(View view, h hVar) {
        boolean z9;
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f129n;
        g gVar = chip.f2696e;
        if (gVar != null && gVar.f137h0) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        hVar.h(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.f127l != i10) {
            return false;
        }
        this.f127l = Integer.MIN_VALUE;
        if (i10 == 1) {
            Chip chip = this.f129n;
            chip.D = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final h k(int i10) {
        boolean z9;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        h hVar = new h(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        hVar.f4540b = -1;
        View view = this.f124i;
        obtain.setParent(view);
        o(i10, hVar);
        if (hVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f120e;
        hVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    hVar.f4541c = i10;
                    obtain.setSource(view, i10);
                    boolean z10 = false;
                    if (this.f126k == i10) {
                        obtain.setAccessibilityFocused(true);
                        hVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        hVar.a(64);
                    }
                    if (this.f127l == i10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        hVar.a(2);
                    } else if (obtain.isFocusable()) {
                        hVar.a(1);
                    }
                    obtain.setFocused(z9);
                    int[] iArr = this.f122g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f119d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        hVar.d(rect3);
                        if (hVar.f4540b != -1) {
                            h hVar2 = new h(AccessibilityNodeInfo.obtain());
                            int i11 = hVar.f4540b;
                            while (true) {
                                accessibilityNodeInfo = hVar2.f4539a;
                                if (i11 == -1) {
                                    break;
                                }
                                hVar2.f4540b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i11, hVar2);
                                hVar2.d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i11 = hVar2.f4540b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f121f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            hVar.f4539a.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        z10 = true;
                                    }
                                }
                            }
                            if (z10) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return hVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final void l(ArrayList arrayList) {
        boolean z9 = false;
        arrayList.add(0);
        Rect rect = Chip.N;
        Chip chip = this.f129n;
        if (chip.c()) {
            g gVar = chip.f2696e;
            if (gVar != null && gVar.f131b0) {
                z9 = true;
            }
            if (z9 && chip.f2699y != null) {
                arrayList.add(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.e.m(int, android.graphics.Rect):boolean");
    }

    public final h n(int i10) {
        if (i10 == -1) {
            View view = this.f124i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            h hVar = new h(obtain);
            WeakHashMap weakHashMap = y0.f4277a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                hVar.f4539a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return hVar;
        }
        return k(i10);
    }

    public final void o(int i10, h hVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        CharSequence charSequence = "";
        if (i10 == 1) {
            Chip chip = this.f129n;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            hVar.b(h0.g.f4526e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.N);
    }

    public final boolean p(int i10) {
        int i11;
        View view = this.f124i;
        if ((view.isFocused() || view.requestFocus()) && (i11 = this.f127l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                j(i11);
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f127l = i10;
                if (i10 == 1) {
                    Chip chip = this.f129n;
                    chip.D = true;
                    chip.refreshDrawableState();
                }
                q(i10, 8);
                return true;
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i10 != Integer.MIN_VALUE && this.f123h.isEnabled() && (parent = (view = this.f124i).getParent()) != null) {
            if (i10 != -1) {
                obtain = AccessibilityEvent.obtain(i11);
                h n9 = n(i10);
                obtain.getText().add(n9.e());
                AccessibilityNodeInfo accessibilityNodeInfo = n9.f4539a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                m.a(obtain, view, i10);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i11);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}

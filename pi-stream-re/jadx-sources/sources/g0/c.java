package g0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f4170c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4172b;

    public c() {
        this(f4170c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4171a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.fragment.app.o b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f4171a, view);
        if (a10 != null) {
            return new androidx.fragment.app.o(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4171a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, h0.h hVar) {
        this.f4171a.onInitializeAccessibilityNodeInfo(view, hVar.f4539a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4171a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4171a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z9;
        WeakReference weakReference;
        boolean z10;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i11 >= list.size()) {
                break;
            }
            h0.g gVar = (h0.g) list.get(i11);
            if (gVar.a() == i10) {
                h0.u uVar = gVar.f4537d;
                if (uVar != null) {
                    Class cls = gVar.f4536c;
                    if (cls != null) {
                        try {
                            a3.g.z(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z9 = uVar.a(view);
                }
            } else {
                i11++;
            }
        }
        z9 = false;
        if (!z9) {
            z9 = b.b(this.f4171a, view, i10, bundle);
        }
        if (!z9 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    }
                    for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                        if (clickableSpan.equals(clickableSpanArr[i13])) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    clickableSpan.onClick(view);
                    z11 = true;
                }
            }
            return z11;
        }
        return z9;
    }

    public void h(View view, int i10) {
        this.f4171a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4171a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4171a = accessibilityDelegate;
        this.f4172b = new a(this);
    }
}

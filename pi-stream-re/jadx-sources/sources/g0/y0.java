package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f4277a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f4278b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4279c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4280d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f4281e;

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f4282f;

    static {
        new AtomicInteger(1);
        f4277a = null;
        f4279c = false;
        f4280d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f4281e = new c0();
        f4282f = new e0();
    }

    public static l1 a(View view) {
        if (f4277a == null) {
            f4277a = new WeakHashMap();
        }
        l1 l1Var = (l1) f4277a.get(view);
        if (l1Var == null) {
            l1 l1Var2 = new l1(view);
            f4277a.put(view, l1Var2);
            return l1Var2;
        }
        return l1Var;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = x0.f4272d;
        x0 x0Var = (x0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (x0Var == null) {
            x0Var = new x0();
            view.setTag(R.id.tag_unhandled_key_event_manager, x0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = x0Var.f4273a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = x0.f4272d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (x0Var.f4273a == null) {
                        x0Var.f4273a = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = x0.f4272d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            x0Var.f4273a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                x0Var.f4273a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = x0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (x0Var.f4274b == null) {
                    x0Var.f4274b = new SparseArray();
                }
                x0Var.f4274b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return s0.a(view);
        }
        if (f4279c) {
            return null;
        }
        if (f4278b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4278b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4279c = true;
                return null;
            }
        }
        try {
            Object obj = f4278b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f4279c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        return (CharSequence) new d0(R.id.tag_accessibility_pane_title, 8, 28, 1).b(view);
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] f(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i10) {
        boolean z9;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (d(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = 32;
        if (k0.a(view) == 0 && !z9) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                k0.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k0.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z9) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        k0.g(obtain2, i10);
        if (z9) {
            obtain2.getText().add(d(view));
            if (h0.c(view) == 0) {
                h0.s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (h0.c((View) parent) == 4) {
                    h0.s(view, 2);
                    break;
                }
                parent = parent.getParent();
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h h(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.b(view, hVar);
        }
        z zVar = (z) view.getTag(R.id.tag_on_receive_content_listener);
        a0 a0Var = f4281e;
        if (zVar != null) {
            h a10 = ((k0.u) zVar).a(view, hVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof a0) {
                a0Var = (a0) view;
            }
            return a0Var.a(a10);
        }
        if (view instanceof a0) {
            a0Var = (a0) view;
        }
        return a0Var.a(hVar);
    }

    public static void i(View view, int i10) {
        ArrayList e10 = e(view);
        for (int i11 = 0; i11 < e10.size(); i11++) {
            if (((h0.g) e10.get(i11)).a() == i10) {
                e10.remove(i11);
                return;
            }
        }
    }

    public static void j(View view, h0.g gVar, h0.u uVar) {
        c cVar;
        h0.g gVar2 = new h0.g(null, gVar.f4535b, null, uVar, gVar.f4536c);
        View.AccessibilityDelegate c6 = c(view);
        if (c6 == null) {
            cVar = null;
        } else if (c6 instanceof a) {
            cVar = ((a) c6).f4164a;
        } else {
            cVar = new c(c6);
        }
        if (cVar == null) {
            cVar = new c();
        }
        l(view, cVar);
        i(view, gVar2.a());
        e(view).add(gVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            s0.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void l(View view, c cVar) {
        a aVar;
        if (cVar == null && (c(view) instanceof a)) {
            cVar = new c();
        }
        if (cVar == null) {
            aVar = null;
        } else {
            aVar = cVar.f4172b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z9 = true;
        new d0(R.id.tag_accessibility_pane_title, 8, 28, 1 == true ? 1 : 0).c(view, charSequence);
        e0 e0Var = f4282f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = e0Var.f4189a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z9 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z9));
            view.addOnAttachStateChangeListener(e0Var);
            if (k0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e0Var);
                return;
            }
            return;
        }
        e0Var.f4189a.remove(view);
        view.removeOnAttachStateChangeListener(e0Var);
        h0.o(view.getViewTreeObserver(), e0Var);
    }
}

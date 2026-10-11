package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g0 implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f890a;

    public g0(s0 s0Var) {
        this.f890a = s0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z9;
        z0 f10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        s0 s0Var = this.f890a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, s0Var);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f10123a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z9 = y.class.isAssignableFrom(m0.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z9 = false;
            }
            if (z9) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                y B = resourceId != -1 ? s0Var.B(resourceId) : null;
                if (B == null && string != null) {
                    B = s0Var.C(string);
                }
                if (B == null && id != -1) {
                    B = s0Var.B(id);
                }
                if (B == null) {
                    m0 E = s0Var.E();
                    context.getClassLoader();
                    B = E.a(attributeValue);
                    B.D = true;
                    B.M = resourceId != 0 ? resourceId : id;
                    B.N = id;
                    B.O = string;
                    B.E = true;
                    B.I = s0Var;
                    a0 a0Var = s0Var.f986t;
                    B.J = a0Var;
                    Context context2 = a0Var.D;
                    B.T = true;
                    if ((a0Var != null ? a0Var.C : null) != null) {
                        B.T = true;
                    }
                    f10 = s0Var.a(B);
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "Fragment " + B + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!B.E) {
                    B.E = true;
                    B.I = s0Var;
                    a0 a0Var2 = s0Var.f986t;
                    B.J = a0Var2;
                    Context context3 = a0Var2.D;
                    B.T = true;
                    if ((a0Var2 != null ? a0Var2.C : null) != null) {
                        B.T = true;
                    }
                    f10 = s0Var.f(B);
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + B + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                v0.b bVar = v0.c.f10351a;
                v0.d dVar = new v0.d(B, viewGroup, 0);
                v0.c.c(dVar);
                v0.b a10 = v0.c.a(B);
                if (a10.f10349a.contains(v0.a.DETECT_FRAGMENT_TAG_USAGE) && v0.c.e(a10, B.getClass(), v0.d.class)) {
                    v0.c.b(a10, dVar);
                }
                B.U = viewGroup;
                f10.k();
                f10.j();
                View view2 = B.V;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B.V.getTag() == null) {
                        B.V.setTag(string);
                    }
                    B.V.addOnAttachStateChangeListener(new f0(this, f10));
                    return B.V;
                }
                throw new IllegalStateException(r.f.e("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}

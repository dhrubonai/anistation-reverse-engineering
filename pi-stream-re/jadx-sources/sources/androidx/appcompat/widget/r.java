package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f623a;

    /* renamed from: b, reason: collision with root package name */
    public int f624b;

    /* renamed from: c, reason: collision with root package name */
    public Object f625c;

    /* renamed from: d, reason: collision with root package name */
    public Object f626d;

    /* renamed from: e, reason: collision with root package name */
    public Object f627e;

    /* renamed from: f, reason: collision with root package name */
    public Object f628f;

    /* renamed from: g, reason: collision with root package name */
    public Object f629g;

    public r(View view) {
        this.f623a = 0;
        this.f624b = -1;
        this.f625c = view;
        this.f626d = x.a();
    }

    public static r b(Context context, int i10) {
        boolean z9;
        if (i10 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        com.bumptech.glide.d.i("Cannot create a CalendarItemStyle with a styleResId of 0", z9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, s5.a.f9911l);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList u9 = p7.a0.u(context, obtainStyledAttributes, 4);
        ColorStateList u10 = p7.a0.u(context, obtainStyledAttributes, 9);
        ColorStateList u11 = p7.a0.u(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        j6.k kVar = new j6.k(j6.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new j6.a(0)));
        obtainStyledAttributes.recycle();
        return new r(u9, u10, u11, dimensionPixelSize, kVar, rect);
    }

    public final void a() {
        boolean z9;
        Drawable background = ((View) this.f625c).getBackground();
        if (background != null) {
            boolean z10 = false;
            if (((x3) this.f627e) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (((x3) this.f629g) == null) {
                    this.f629g = new x3(0);
                }
                x3 x3Var = (x3) this.f629g;
                x3Var.f707d = null;
                x3Var.f706c = false;
                x3Var.f708e = null;
                x3Var.f705b = false;
                View view = (View) this.f625c;
                WeakHashMap weakHashMap = g0.y0.f4277a;
                ColorStateList g10 = g0.n0.g(view);
                if (g10 != null) {
                    x3Var.f706c = true;
                    x3Var.f707d = g10;
                }
                PorterDuff.Mode h10 = g0.n0.h((View) this.f625c);
                if (h10 != null) {
                    x3Var.f705b = true;
                    x3Var.f708e = h10;
                }
                if (x3Var.f706c || x3Var.f705b) {
                    x.e(background, x3Var, ((View) this.f625c).getDrawableState());
                    z10 = true;
                }
                if (z10) {
                    return;
                }
            }
            x3 x3Var2 = (x3) this.f628f;
            if (x3Var2 != null) {
                x.e(background, x3Var2, ((View) this.f625c).getDrawableState());
                return;
            }
            x3 x3Var3 = (x3) this.f627e;
            if (x3Var3 != null) {
                x.e(background, x3Var3, ((View) this.f625c).getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f628f;
        if (((x3) obj) != null) {
            return (ColorStateList) ((x3) obj).f707d;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f628f;
        if (((x3) obj) != null) {
            return (PorterDuff.Mode) ((x3) obj).f708e;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        Context context = ((View) this.f625c).getContext();
        int[] iArr = e.a.f3294z;
        o3 m5 = o3.m(context, attributeSet, iArr, i10);
        View view = (View) this.f625c;
        g0.y0.k(view, view.getContext(), iArr, attributeSet, (TypedArray) m5.f598b, i10);
        try {
            if (m5.l(0)) {
                this.f624b = m5.i(0, -1);
                x xVar = (x) this.f626d;
                Context context2 = ((View) this.f625c).getContext();
                int i12 = this.f624b;
                synchronized (xVar) {
                    i11 = xVar.f699a.i(context2, i12);
                }
                if (i11 != null) {
                    h(i11);
                }
            }
            if (m5.l(1)) {
                g0.n0.q((View) this.f625c, m5.b(1));
            }
            if (m5.l(2)) {
                g0.n0.r((View) this.f625c, v1.b(m5.h(2, -1), null));
            }
        } finally {
            m5.p();
        }
    }

    public final void f() {
        this.f624b = -1;
        h(null);
        a();
    }

    public final void g(int i10) {
        ColorStateList colorStateList;
        this.f624b = i10;
        x xVar = (x) this.f626d;
        if (xVar != null) {
            Context context = ((View) this.f625c).getContext();
            synchronized (xVar) {
                colorStateList = xVar.f699a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((x3) this.f627e) == null) {
                this.f627e = new x3(0);
            }
            Object obj = this.f627e;
            ((x3) obj).f707d = colorStateList;
            ((x3) obj).f706c = true;
        } else {
            this.f627e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((x3) this.f628f) == null) {
            this.f628f = new x3(0);
        }
        x3 x3Var = (x3) this.f628f;
        x3Var.f707d = colorStateList;
        x3Var.f706c = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((x3) this.f628f) == null) {
            this.f628f = new x3(0);
        }
        x3 x3Var = (x3) this.f628f;
        x3Var.f708e = mode;
        x3Var.f705b = true;
        a();
    }

    public final String toString() {
        switch (this.f623a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f625c) + ", mProviderPackage: " + ((String) this.f626d) + ", mQuery: " + ((String) this.f627e) + ", mCertificates:");
                for (int i10 = 0; i10 < ((List) this.f628f).size(); i10++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f628f).get(i10);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f624b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public r(String str, String str2, String str3, List list) {
        this.f623a = 1;
        str.getClass();
        this.f625c = str;
        str2.getClass();
        this.f626d = str2;
        this.f627e = str3;
        list.getClass();
        this.f628f = list;
        this.f624b = 0;
        this.f629g = str + "-" + str2 + "-" + str3;
    }

    public r(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, j6.k kVar, Rect rect) {
        this.f623a = 3;
        com.bumptech.glide.d.j(rect.left);
        com.bumptech.glide.d.j(rect.top);
        com.bumptech.glide.d.j(rect.right);
        com.bumptech.glide.d.j(rect.bottom);
        this.f625c = rect;
        this.f626d = colorStateList2;
        this.f627e = colorStateList;
        this.f628f = colorStateList3;
        this.f624b = i10;
        this.f629g = kVar;
    }
}

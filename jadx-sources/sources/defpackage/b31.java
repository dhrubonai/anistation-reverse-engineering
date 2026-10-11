package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.anistation.model.settings.SubtitleArgbColor;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b31 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new b31("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, SubtitleArgbColor.BLACK, Integer.MIN_VALUE, 0.0f, 0);
        String str = eq6.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(17, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(18, 36);
        y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b31(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        boolean z3;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            io3.n(z3);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a31] */
    public final a31 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.d;
        obj.c = this.b;
        obj.d = this.c;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.n;
        obj.k = this.o;
        obj.l = this.j;
        obj.m = this.k;
        obj.n = this.l;
        obj.o = this.m;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = l31.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (c85 c85Var : (c85[]) spanned.getSpans(0, spanned.length(), c85.class)) {
                    c85Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(c85.c, c85Var.a);
                    bundle2.putInt(c85.d, c85Var.b);
                    arrayList.add(l31.a(spanned, c85Var, 1, bundle2));
                }
                for (n96 n96Var : (n96[]) spanned.getSpans(0, spanned.length(), n96.class)) {
                    n96Var.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(n96.d, n96Var.a);
                    bundle3.putInt(n96.e, n96Var.b);
                    bundle3.putInt(n96.f, n96Var.c);
                    arrayList.add(l31.a(spanned, n96Var, 2, bundle3));
                }
                for (bo2 bo2Var : (bo2[]) spanned.getSpans(0, spanned.length(), bo2.class)) {
                    arrayList.add(l31.a(spanned, bo2Var, 3, null));
                }
                for (vw6 vw6Var : (vw6[]) spanned.getSpans(0, spanned.length(), vw6.class)) {
                    vw6Var.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(vw6.b, vw6Var.a);
                    arrayList.add(l31.a(spanned, vw6Var, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b31.class == obj.getClass()) {
            b31 b31Var = (b31) obj;
            if (TextUtils.equals(this.a, b31Var.a) && this.b == b31Var.b && this.c == b31Var.c) {
                Bitmap bitmap = b31Var.d;
                Bitmap bitmap2 = this.d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.e == b31Var.e && this.f == b31Var.f && this.g == b31Var.g && this.h == b31Var.h && this.i == b31Var.i && this.j == b31Var.j && this.k == b31Var.k && this.l == b31Var.l && this.m == b31Var.m && this.n == b31Var.n && this.o == b31Var.o && this.p == b31Var.p && this.q == b31Var.q && this.r == b31Var.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}

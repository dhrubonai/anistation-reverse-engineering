package e1;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {
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

    /* renamed from: r, reason: collision with root package name */
    public static final String f3338r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f3339s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f3340t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f3341u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f3342v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f3343w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f3344x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f3345y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f3346z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3347a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f3348b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f3349c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f3350d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3351e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3352f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3353g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3354h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3355i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3356j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3357k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3358l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3359m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3360n;
    public final float o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3361p;

    /* renamed from: q, reason: collision with root package name */
    public final float f3362q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        f3338r = b0.J(0);
        f3339s = b0.J(17);
        f3340t = b0.J(1);
        f3341u = b0.J(2);
        f3342v = b0.J(3);
        f3343w = b0.J(18);
        f3344x = b0.J(4);
        f3345y = b0.J(5);
        f3346z = b0.J(6);
        A = b0.J(7);
        B = b0.J(8);
        C = b0.J(9);
        D = b0.J(10);
        E = b0.J(11);
        F = b0.J(12);
        G = b0.J(13);
        H = b0.J(14);
        I = b0.J(15);
        J = b0.J(16);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z9, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            w7.b.g(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f3347a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f3347a = charSequence.toString();
        } else {
            this.f3347a = null;
        }
        this.f3348b = alignment;
        this.f3349c = alignment2;
        this.f3350d = bitmap;
        this.f3351e = f10;
        this.f3352f = i10;
        this.f3353g = i11;
        this.f3354h = f11;
        this.f3355i = i12;
        this.f3356j = f13;
        this.f3357k = f14;
        this.f3358l = z9;
        this.f3359m = i14;
        this.f3360n = i13;
        this.o = f12;
        this.f3361p = i15;
        this.f3362q = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f3347a, bVar.f3347a) && this.f3348b == bVar.f3348b && this.f3349c == bVar.f3349c) {
            Bitmap bitmap = bVar.f3350d;
            Bitmap bitmap2 = this.f3350d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f3351e == bVar.f3351e && this.f3352f == bVar.f3352f && this.f3353g == bVar.f3353g && this.f3354h == bVar.f3354h && this.f3355i == bVar.f3355i && this.f3356j == bVar.f3356j && this.f3357k == bVar.f3357k && this.f3358l == bVar.f3358l && this.f3359m == bVar.f3359m && this.f3360n == bVar.f3360n && this.o == bVar.o && this.f3361p == bVar.f3361p && this.f3362q == bVar.f3362q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3347a, this.f3348b, this.f3349c, this.f3350d, Float.valueOf(this.f3351e), Integer.valueOf(this.f3352f), Integer.valueOf(this.f3353g), Float.valueOf(this.f3354h), Integer.valueOf(this.f3355i), Float.valueOf(this.f3356j), Float.valueOf(this.f3357k), Boolean.valueOf(this.f3358l), Integer.valueOf(this.f3359m), Integer.valueOf(this.f3360n), Float.valueOf(this.o), Integer.valueOf(this.f3361p), Float.valueOf(this.f3362q)});
    }
}

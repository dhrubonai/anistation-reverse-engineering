package z2;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f11996w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f11997x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f11998y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f11999z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12000a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f12001b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f12002c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12003d;

    /* renamed from: e, reason: collision with root package name */
    public int f12004e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12005f;

    /* renamed from: g, reason: collision with root package name */
    public int f12006g;

    /* renamed from: h, reason: collision with root package name */
    public int f12007h;

    /* renamed from: i, reason: collision with root package name */
    public int f12008i;

    /* renamed from: j, reason: collision with root package name */
    public int f12009j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12010k;

    /* renamed from: l, reason: collision with root package name */
    public int f12011l;

    /* renamed from: m, reason: collision with root package name */
    public int f12012m;

    /* renamed from: n, reason: collision with root package name */
    public int f12013n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f12014p;

    /* renamed from: q, reason: collision with root package name */
    public int f12015q;

    /* renamed from: r, reason: collision with root package name */
    public int f12016r;

    /* renamed from: s, reason: collision with root package name */
    public int f12017s;

    /* renamed from: t, reason: collision with root package name */
    public int f12018t;

    /* renamed from: u, reason: collision with root package name */
    public int f12019u;

    /* renamed from: v, reason: collision with root package name */
    public int f12020v;

    static {
        int c6 = c(0, 0, 0, 0);
        f11997x = c6;
        int c10 = c(0, 0, 0, 3);
        f11998y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f11999z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c6, c10, c6, c6, c10, c6, c6};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c6, c6, c6, c6, c6, c10, c10};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            w7.b.m(r4, r0)
            w7.b.m(r5, r0)
            w7.b.m(r6, r0)
            w7.b.m(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L21
            if (r7 == r1) goto L21
            r3 = 2
            if (r7 == r3) goto L1e
            r3 = 3
            if (r7 == r3) goto L1c
            goto L21
        L1c:
            r7 = r0
            goto L22
        L1e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L22
        L21:
            r7 = r2
        L22:
            if (r4 <= r1) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r0
        L27:
            if (r5 <= r1) goto L2b
            r5 = r2
            goto L2c
        L2b:
            r5 = r0
        L2c:
            if (r6 <= r1) goto L2f
            r0 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.e.c(int, int, int, int):int");
    }

    public final void a(char c6) {
        SpannableStringBuilder spannableStringBuilder = this.f12001b;
        if (c6 == '\n') {
            ArrayList arrayList = this.f12000a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f12014p != -1) {
                this.f12014p = 0;
            }
            if (this.f12015q != -1) {
                this.f12015q = 0;
            }
            if (this.f12016r != -1) {
                this.f12016r = 0;
            }
            if (this.f12018t != -1) {
                this.f12018t = 0;
            }
            while (true) {
                if ((this.f12010k && arrayList.size() >= this.f12009j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c6);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12001b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f12014p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f12014p, length, 33);
            }
            if (this.f12015q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12015q, length, 33);
            }
            if (this.f12016r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12017s), this.f12016r, length, 33);
            }
            if (this.f12018t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12019u), this.f12018t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f12000a.clear();
        this.f12001b.clear();
        this.f12014p = -1;
        this.f12015q = -1;
        this.f12016r = -1;
        this.f12018t = -1;
        this.f12020v = 0;
        this.f12002c = false;
        this.f12003d = false;
        this.f12004e = 4;
        this.f12005f = false;
        this.f12006g = 0;
        this.f12007h = 0;
        this.f12008i = 0;
        this.f12009j = 15;
        this.f12010k = true;
        this.f12011l = 0;
        this.f12012m = 0;
        this.f12013n = 0;
        int i10 = f11997x;
        this.o = i10;
        this.f12017s = f11996w;
        this.f12019u = i10;
    }

    public final void e(boolean z9, boolean z10) {
        int i10 = this.f12014p;
        SpannableStringBuilder spannableStringBuilder = this.f12001b;
        if (i10 != -1) {
            if (!z9) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f12014p, spannableStringBuilder.length(), 33);
                this.f12014p = -1;
            }
        } else if (z9) {
            this.f12014p = spannableStringBuilder.length();
        }
        if (this.f12015q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12015q, spannableStringBuilder.length(), 33);
                this.f12015q = -1;
                return;
            }
            return;
        }
        if (z10) {
            this.f12015q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f12016r;
        SpannableStringBuilder spannableStringBuilder = this.f12001b;
        if (i12 != -1 && this.f12017s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12017s), this.f12016r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f11996w) {
            this.f12016r = spannableStringBuilder.length();
            this.f12017s = i10;
        }
        if (this.f12018t != -1 && this.f12019u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12019u), this.f12018t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f11997x) {
            this.f12018t = spannableStringBuilder.length();
            this.f12019u = i11;
        }
    }
}

package f3;

import a3.g;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import f.r0;
import f1.b0;
import f1.c;
import f1.o;
import f1.t;
import java.nio.charset.Charset;
import java.util.List;
import q6.e;
import r6.m0;
import r6.n1;
import r6.o0;
import w.f;
import w7.b;
import y2.d;
import y2.l;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final t f3910a = new t();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3913d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3914e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3915f;

    /* renamed from: x, reason: collision with root package name */
    public final int f3916x;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f3912c = bArr[24];
            this.f3913d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f3914e = "Serif".equals(new String(bArr, 43, bArr.length - 43, e.f9207c)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f3916x = i10;
            boolean z9 = (bArr[0] & 32) != 0;
            this.f3911b = z9;
            if (z9) {
                this.f3915f = b0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f3915f = 0.85f;
                return;
            }
        }
        this.f3912c = 0;
        this.f3913d = -1;
        this.f3914e = "sans-serif";
        this.f3911b = false;
        this.f3915f = 0.85f;
        this.f3916x = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z9;
        boolean z10;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z11 = true;
            if ((i10 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z11 = false;
            }
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z11 && !z9 && !z10) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override // y2.l
    public final /* synthetic */ void f() {
    }

    @Override // y2.l
    public final /* synthetic */ void k(byte[] bArr, r0 r0Var, f fVar) {
        r.f.a(this, bArr, r0Var, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.l
    public final void o(byte[] bArr, int i10, int i11, r0 r0Var, c cVar) {
        boolean z9;
        String t9;
        int i12;
        boolean z10;
        boolean z11;
        t tVar = this.f3910a;
        tVar.E(bArr, i10 + i11);
        tVar.G(i10);
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        if (tVar.f3860c - tVar.f3859b >= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        b.g(z9);
        int A = tVar.A();
        if (A == 0) {
            t9 = "";
        } else {
            int i16 = tVar.f3859b;
            Charset C = tVar.C();
            int i17 = A - (tVar.f3859b - i16);
            if (C == null) {
                C = e.f9207c;
            }
            t9 = tVar.t(i17, C);
        }
        if (t9.isEmpty()) {
            m0 m0Var = o0.f9505b;
            cVar.accept(new y2.a(n1.f9497e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t9);
        a(spannableStringBuilder, this.f3912c, 0, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i18 = this.f3913d;
        if (i18 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i18 & 255) << 24) | (i18 >>> 8)), 0, length, 16711713);
        }
        int length2 = spannableStringBuilder.length();
        String str = this.f3914e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f10 = this.f3915f;
        while (true) {
            int i19 = tVar.f3860c;
            int i20 = tVar.f3859b;
            if (i19 - i20 >= 8) {
                int f11 = tVar.f();
                int f12 = tVar.f();
                if (f12 == 1937013100) {
                    if (tVar.f3860c - tVar.f3859b >= i13) {
                        z11 = i14;
                    } else {
                        z11 = i15;
                    }
                    b.g(z11);
                    int A2 = tVar.A();
                    int i21 = i15;
                    while (i15 < A2) {
                        boolean z12 = i21;
                        if (tVar.f3860c - tVar.f3859b >= 12) {
                            z12 = i14;
                        }
                        b.g(z12);
                        int A3 = tVar.A();
                        int A4 = tVar.A();
                        tVar.H(i13);
                        int v9 = tVar.v();
                        tVar.H(i14);
                        int f13 = tVar.f();
                        int i22 = A2;
                        if (A4 > spannableStringBuilder.length()) {
                            StringBuilder u9 = g.u("Truncating styl end (", A4, ") to cueText.length() (");
                            u9.append(spannableStringBuilder.length());
                            u9.append(").");
                            o.f("Tx3gParser", u9.toString());
                            A4 = spannableStringBuilder.length();
                        }
                        if (A3 >= A4) {
                            o.f("Tx3gParser", "Ignoring styl with start (" + A3 + ") >= end (" + A4 + ").");
                        } else {
                            a(spannableStringBuilder, v9, this.f3912c, A3, A4, 0);
                            if (f13 != i18) {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(((f13 & 255) << 24) | (f13 >>> 8)), A3, A4, 33);
                            }
                        }
                        i15++;
                        i13 = 2;
                        i14 = 1;
                        i21 = 0;
                        A2 = i22;
                    }
                } else {
                    if (f12 == 1952608120 && this.f3911b) {
                        i12 = 2;
                        if (tVar.f3860c - tVar.f3859b >= 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b.g(z10);
                        f10 = b0.g(tVar.A() / this.f3916x, 0.0f, 0.95f);
                    } else {
                        i12 = 2;
                    }
                    i13 = i12;
                }
                tVar.G(i20 + f11);
                i14 = 1;
                i15 = 0;
            } else {
                cVar.accept(new y2.a(o0.o(new e1.b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }

    @Override // y2.l
    public final /* synthetic */ d r(byte[] bArr, int i10, int i11) {
        return r.f.b(this, bArr, i10, i11);
    }

    @Override // y2.l
    public final int x() {
        return 2;
    }
}

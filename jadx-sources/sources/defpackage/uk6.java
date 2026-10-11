package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.anistation.model.settings.SubtitleArgbColor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uk6 implements y16 {
    public final int A;
    public final String B;
    public final float C;
    public final int D;
    public final zi4 x = new zi4();
    public final boolean y;
    public final int z;

    public uk6(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.z = bArr[24];
            this.A = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.B = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.D = i;
            boolean z = (bArr[0] & 32) != 0;
            this.y = z;
            if (z) {
                this.C = eq6.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.C = 0.85f;
                return;
            }
        }
        this.z = 0;
        this.A = -1;
        this.B = "sans-serif";
        this.y = false;
        this.C = 0.85f;
        this.D = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y16
    public final void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        boolean z;
        String y;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        zi4 zi4Var = this.x;
        zi4Var.L(i + i2, bArr);
        zi4Var.N(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        if (zi4Var.a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int H = zi4Var.H();
        if (H == 0) {
            y = "";
        } else {
            int i8 = zi4Var.b;
            Charset J = zi4Var.J();
            int i9 = H - (zi4Var.b - i8);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y = zi4Var.y(i9, J);
        }
        if (y.isEmpty()) {
            z62 z62Var = nw2.y;
            ay0Var.accept(new e31(-9223372036854775807L, -9223372036854775807L, o15.B));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y);
        b(spannableStringBuilder, this.z, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.A, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.B;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.C;
        while (zi4Var.a() >= 8) {
            int i10 = zi4Var.b;
            int m = zi4Var.m();
            int m2 = zi4Var.m();
            if (m2 == 1937013100) {
                if (zi4Var.a() >= i7) {
                    z3 = i5;
                } else {
                    z3 = i6;
                }
                io3.n(z3);
                int H2 = zi4Var.H();
                int i11 = i6;
                while (i11 < H2) {
                    if (zi4Var.a() >= 12) {
                        z4 = i5;
                    } else {
                        z4 = i6;
                    }
                    io3.n(z4);
                    int H3 = zi4Var.H();
                    int H4 = zi4Var.H();
                    zi4Var.O(i7);
                    int i12 = i11;
                    int A = zi4Var.A();
                    zi4Var.O(i5);
                    int m3 = zi4Var.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder s = qx1.s(H4, "Truncating styl end (", ") to cueText.length() (");
                        s.append(spannableStringBuilder.length());
                        s.append(").");
                        kb0.O("Tx3gParser", s.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        kb0.O("Tx3gParser", qx1.l("Ignoring styl with start (", H3, ") >= end (", H4, ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = H4;
                        b(spannableStringBuilder, A, this.z, H3, i13, 0);
                        a(spannableStringBuilder, m3, this.A, H3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (m2 == 1952608120 && this.y) {
                i3 = 2;
                if (zi4Var.a() >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.n(z2);
                f = eq6.i(zi4Var.H() / this.D, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            zi4Var.N(i10 + m);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        ay0Var.accept(new e31(-9223372036854775807L, -9223372036854775807L, nw2.s(new b31(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, SubtitleArgbColor.BLACK, Integer.MIN_VALUE, 0.0f, 0))));
    }
}

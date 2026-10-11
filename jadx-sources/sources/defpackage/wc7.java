package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.anistation.model.Anime;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class wc7 {
    public static final os0 a = new os0(636288403, false, new us0(0));
    public static final os0 b = new os0(-1357803046, false, new us0(1));
    public static final k82 c = new k82(11);
    public static final np0 d = np0.A;
    public static final sm5 e = sm5.y;
    public static final np0 f = np0.y;
    public static final ol6 g = ol6.y;
    public static final qd h = new qd(1022);

    public static final boolean A(int i, long j, int i2) {
        int j2 = rx0.j(j);
        if (i <= rx0.h(j) && j2 <= i) {
            int i3 = rx0.i(j);
            if (i2 <= rx0.g(j) && i3 <= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean B(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return true;
        }
        return false;
    }

    public static zf0 C(l11 l11Var, ic2 ic2Var) {
        l11Var.getClass();
        return v94.t(new ia1((Object) l11Var, (Object) y11.x, (Object) ic2Var, (byte) 2));
    }

    public static final yz3 D(Object obj) {
        return new la3(obj);
    }

    public static int E(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final xz3 F(yc1 yc1Var, int i) {
        xz3 xz3Var = ((xz3) yc1Var).x.C;
        if (xz3Var != null && (xz3Var.A & i) != 0) {
            while (xz3Var != null) {
                int i2 = xz3Var.z;
                if ((i2 & 2) == 0) {
                    if ((i2 & i) != 0) {
                        return xz3Var;
                    }
                    xz3Var = xz3Var.C;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ii3, zc2, java.lang.Object, java.lang.Runnable] */
    public static ii3 G(ii3 ii3Var) {
        if (ii3Var.isDone()) {
            return ii3Var;
        }
        ?? obj = new Object();
        obj.E = ii3Var;
        ii3Var.a(obj, qg1.x);
        return obj;
    }

    public static hr2 H(CharSequence charSequence) {
        charSequence.getClass();
        boolean equals = charSequence.equals("HTTP/1.1");
        hr2 hr2Var = hr2.f;
        if (equals) {
            return hr2Var;
        }
        boolean equals2 = charSequence.equals("HTTP/1.0");
        hr2 hr2Var2 = hr2.g;
        if (equals2) {
            return hr2Var2;
        }
        boolean equals3 = charSequence.equals("HTTP/2.0");
        hr2 hr2Var3 = hr2.e;
        if (equals3) {
            return hr2Var3;
        }
        boolean equals4 = charSequence.equals("HTTP/3.0");
        hr2 hr2Var4 = hr2.d;
        if (equals4) {
            return hr2Var4;
        }
        List i0 = uz5.i0(charSequence, new String[]{"/", "."}, 6);
        if (i0.size() == 3) {
            String str = (String) i0.get(0);
            String str2 = (String) i0.get(1);
            String str3 = (String) i0.get(2);
            int parseInt = Integer.parseInt(str2);
            int parseInt2 = Integer.parseInt(str3);
            str.getClass();
            if (str.equals("HTTP") && parseInt == 1 && parseInt2 == 0) {
                return hr2Var2;
            }
            if (str.equals("HTTP") && parseInt == 1 && parseInt2 == 1) {
                return hr2Var;
            }
            if (str.equals("HTTP") && parseInt == 2 && parseInt2 == 0) {
                return hr2Var3;
            }
            if (str.equals("HTTP") && parseInt == 3 && parseInt2 == 0) {
                return hr2Var4;
            }
            return new hr2(str, parseInt, parseInt2);
        }
        ov3.l(charSequence, "Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: ");
        return null;
    }

    public static final af I(sb2 sb2Var, kd2 kd2Var, int i) {
        View view = (View) kd2Var.j(eb.f);
        boolean f2 = kd2Var.f(view);
        Object Q = kd2Var.Q();
        Object obj = au0.a;
        if (f2 || Q == obj) {
            Q = new af(view, null, sb2Var);
            kd2Var.n0(Q);
        }
        af afVar = (af) Q;
        boolean h2 = kd2Var.h(afVar);
        Object Q2 = kd2Var.Q();
        if (h2 || Q2 == obj) {
            Q2 = new ue(afVar, (byte) 3);
            kd2Var.n0(Q2);
        }
        db.c(afVar, (ub2) Q2, kd2Var);
        return afVar;
    }

    public static final xz3 J(z44 z44Var) {
        int i;
        if (z44Var != null && (i = z44Var.z) != 0) {
            return (xz3) z44Var.m(i - 1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        T(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = E(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int K(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = defpackage.h41.c0(r9)
            r1 = r0 & r11
            int r2 = S(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = defpackage.tl7.r(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = defpackage.tl7.r(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            T(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = E(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc7.K(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static final void L(yc1 yc1Var) {
        r9 m158getAutofillManager;
        za3 O = O(yc1Var);
        if (!O.Q && (m158getAutofillManager = ((oa) cb3.a(O)).m158getAutofillManager()) != null) {
            Rect rect = m158getAutofillManager.C;
            p05 p05Var = m158getAutofillManager.A;
            za3 za3Var = (za3) p05Var.a.b(O.y);
            if (za3Var != null && za3Var.D != -4) {
                eb2 eb2Var = p05Var.c;
                int d2 = p05Var.d(za3Var);
                long[] jArr = (long[]) eb2Var.z;
                long j = jArr[d2];
                long j2 = jArr[d2 + 1];
                rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
                m158getAutofillManager.x.W().requestAutofill(m158getAutofillManager.z, O.y, rect);
            }
        }
    }

    public static final fa4 M(yc1 yc1Var, int i) {
        fa4 fa4Var = ((xz3) yc1Var).x.E;
        fa4Var.getClass();
        if (fa4Var.Y0() == yc1Var && ga4.g(i)) {
            fa4 fa4Var2 = fa4Var.S;
            fa4Var2.getClass();
            return fa4Var2;
        }
        return fa4Var;
    }

    public static final fa4 N(yc1 yc1Var) {
        if (!((xz3) yc1Var).x.K) {
            ez2.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        fa4 M = M(yc1Var, 2);
        if (!M.Y0().K) {
            ez2.b("LayoutCoordinates is not attached.");
        }
        return M;
    }

    public static final za3 O(yc1 yc1Var) {
        fa4 fa4Var = ((xz3) yc1Var).x.E;
        if (fa4Var != null) {
            return fa4Var.R;
        }
        throw h11.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final kh4 P(yc1 yc1Var) {
        kh4 kh4Var = O(yc1Var).K;
        if (kh4Var != null) {
            return kh4Var;
        }
        throw h11.e("This node does not have an owner.");
    }

    public static void Q(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i2;
        CharSequence subSequence;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            c4.j(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i3 >= 30) {
            c4.j(editorInfo, charSequence);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i = i5;
        } else {
            i = i4;
        }
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = charSequence.length();
        if (i >= 0 && i4 <= length) {
            int i6 = editorInfo.inputType & 4095;
            if (i6 != 129 && i6 != 225 && i6 != 18) {
                if (length <= 2048) {
                    R(editorInfo, charSequence, i, i4);
                    return;
                }
                int i7 = i4 - i;
                if (i7 > 1024) {
                    i2 = 0;
                } else {
                    i2 = i7;
                }
                int i8 = 2048 - i2;
                int min = Math.min(charSequence.length() - i4, i8 - Math.min(i, (int) (i8 * 0.8d)));
                int min2 = Math.min(i, i8 - min);
                int i9 = i - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i9))) {
                    i9++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i4 + min) - 1))) {
                    min--;
                }
                int i10 = min2 + i2;
                int i11 = i10 + min;
                if (i2 != i7) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i4, min + i4));
                } else {
                    subSequence = charSequence.subSequence(i9, i11 + i9);
                }
                R(editorInfo, subSequence, min2, i10);
                return;
            }
            R(editorInfo, null, 0, 0);
            return;
        }
        R(editorInfo, null, 0, 0);
    }

    public static void R(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static int S(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void T(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static String U(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (B(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (B(c2)) {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String V(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final void W(uh5 uh5Var, int i, ic5 ic5Var) {
        uh5 uh5Var2;
        z44 z44Var = new z44(new uh5[16], 0);
        List i2 = uh5Var.i(false, false);
        while (true) {
            z44Var.d(z44Var.z, i2);
            while (true) {
                int i3 = z44Var.z;
                if (i3 != 0) {
                    uh5Var2 = (uh5) z44Var.m(i3 - 1);
                    boolean L = nx7.L(uh5Var2);
                    ph5 ph5Var = uh5Var2.d;
                    p44 p44Var = ph5Var.x;
                    if (!L && !p44Var.c(yh5.j)) {
                        fa4 d2 = uh5Var2.d();
                        if (d2 != null) {
                            g13 D = wk6.D(te4.q(d2, true));
                            if (D.a < D.c && D.b < D.d) {
                                Object g2 = ph5Var.x.g(oh5.e);
                                Object obj = null;
                                if (g2 == null) {
                                    g2 = null;
                                }
                                ic2 ic2Var = (ic2) g2;
                                Object g3 = p44Var.g(yh5.w);
                                if (g3 != null) {
                                    obj = g3;
                                }
                                hc5 hc5Var = (hc5) obj;
                                if (ic2Var != null && hc5Var != null && ((Number) hc5Var.b.invoke()).floatValue() > 0.0f) {
                                    int i4 = 1 + i;
                                    ic5Var.invoke(new kc5(uh5Var2, i4, D, d2));
                                    W(uh5Var2, i4, ic5Var);
                                }
                            }
                        } else {
                            throw h11.e("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i2 = uh5Var2.i(false, false);
        }
    }

    public static Object X(ic2 ic2Var, Object obj, vz0 vz0Var) {
        Object xz0Var;
        ic2Var.getClass();
        l11 context = vz0Var.getContext();
        if (context == it1.x) {
            xz0Var = new w45(vz0Var);
        } else {
            xz0Var = new xz0(vz0Var, context);
        }
        wk6.j(2, ic2Var);
        return ic2Var.invoke(obj, xz0Var);
    }

    public static final void a(final yz3 yz3Var, final y44 y44Var, final w44 w44Var, final yc5 yc5Var, final om5 om5Var, final long j, final float f2, final os0 os0Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        float f3;
        float f4;
        float f5;
        kd2Var.f0(848986741);
        if (kd2Var.f(yz3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (kd2Var.f(y44Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (kd2Var.f(yc5Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i13 = i12 | i4;
        if (kd2Var.f(om5Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i14 = i13 | i5;
        if (kd2Var.e(j)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i15 = i14 | i6;
        if (kd2Var.c(0.0f)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (kd2Var.c(f2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        if (kd2Var.f(null)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i18 = i17 | i9;
        if (kd2Var.h(os0Var)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i19 = i18 | i10;
        if ((i19 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i19 & 1, z)) {
            xi6 M = tl7.M(y44Var, "DropDownMenu", kd2Var, (((i19 >> 3) & 14) | 48) & 126);
            tw5 N = sw0.N(z04.y, kd2Var);
            tw5 N2 = sw0.N(z04.A, kd2Var);
            tk6 tk6Var = db.l;
            qt0 qt0Var = M.a;
            ti4 ti4Var = M.d;
            boolean booleanValue = ((Boolean) qt0Var.v()).booleanValue();
            kd2Var.e0(143964305);
            float f6 = 0.8f;
            float f7 = 1.0f;
            if (booleanValue) {
                f3 = 1.0f;
            } else {
                f3 = 0.8f;
            }
            kd2Var.q(false);
            Float valueOf = Float.valueOf(f3);
            boolean booleanValue2 = ((Boolean) ti4Var.getValue()).booleanValue();
            kd2Var.e0(143964305);
            if (booleanValue2) {
                f6 = 1.0f;
            }
            kd2Var.q(false);
            Float valueOf2 = Float.valueOf(f6);
            M.f();
            kd2Var.e0(-745957716);
            kd2Var.q(false);
            boolean z2 = true;
            ui6 q = tl7.q(M, valueOf, valueOf2, N, tk6Var, kd2Var, 0);
            boolean booleanValue3 = ((Boolean) M.a.v()).booleanValue();
            kd2Var.e0(892761509);
            if (booleanValue3) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            kd2Var.q(false);
            Float valueOf3 = Float.valueOf(f4);
            boolean booleanValue4 = ((Boolean) ti4Var.getValue()).booleanValue();
            kd2Var.e0(892761509);
            if (!booleanValue4) {
                f7 = 0.0f;
            }
            kd2Var.q(false);
            Float valueOf4 = Float.valueOf(f7);
            M.f();
            kd2Var.e0(2839488);
            kd2Var.q(false);
            ui6 q2 = tl7.q(M, valueOf3, valueOf4, N2, tk6Var, kd2Var, 0);
            boolean booleanValue5 = ((Boolean) kd2Var.j(i03.a)).booleanValue();
            boolean g2 = kd2Var.g(booleanValue5) | kd2Var.f(q);
            if ((i19 & 112) != 32) {
                z2 = false;
            }
            boolean f8 = z2 | g2 | kd2Var.f(q2);
            Object Q = kd2Var.Q();
            if (!f8 && Q != au0.a) {
                f5 = 0.0f;
            } else {
                f5 = 0.0f;
                Object lx3Var = new lx3(booleanValue5, y44Var, w44Var, q, q2);
                kd2Var.n0(lx3Var);
                Q = lx3Var;
            }
            int i20 = i19 >> 9;
            int i21 = i19 >> 6;
            l36.a(io3.O(vz3.x, (ub2) Q), om5Var, j, 0L, f5, f2, null, nx7.R(-1463404422, new nx3(yz3Var, yc5Var, os0Var), kd2Var), kd2Var, (i20 & 896) | (i20 & 112) | 12582912 | (57344 & i21) | (458752 & i21) | (i21 & 3670016), 8);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(y44Var, w44Var, yc5Var, om5Var, j, f2, os0Var, i) { // from class: mx3
                public final /* synthetic */ yc5 A;
                public final /* synthetic */ om5 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ float D;
                public final /* synthetic */ os0 E;
                public final /* synthetic */ y44 y;
                public final /* synthetic */ w44 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N3 = kb0.N(385);
                    wc7.a(yz3.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (kd2) obj, N3);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x027c, code lost:
    
        if (r49.g(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.yz3 r38, defpackage.wc3 r39, final defpackage.mi2 r40, final defpackage.th4 r41, boolean r42, final defpackage.i42 r43, final boolean r44, final defpackage.fc r45, final defpackage.wr r46, final defpackage.ur r47, final defpackage.ub2 r48, defpackage.kd2 r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc7.b(yz3, wc3, mi2, th4, boolean, i42, boolean, fc, wr, ur, ub2, kd2, int, int):void");
    }

    public static final void c(yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        kd2Var.f0(2064964257);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        byte b2 = 0;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            d(yz3Var, os0Var, kd2Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new bf(yz3Var, os0Var, i, b2);
        }
    }

    public static final void d(yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(771959668);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(null)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        byte b2 = 0;
        byte b3 = 1;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                ti4 ti4Var = new ti4(null, h95.H);
                kd2Var.n0(ti4Var);
                Q = ti4Var;
            }
            w44 w44Var = (w44) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new cf(w44Var, b2);
                kd2Var.n0(Q2);
            }
            kb0.b(z86.b.a(I((sb2) Q2, kd2Var, 0)), nx7.R(-291176396, new df(yz3Var, w44Var, os0Var, b2), kd2Var), kd2Var, 56);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new bf(yz3Var, os0Var, i, b3);
        }
    }

    public static final void e(int i, ub2 ub2Var, kd2 kd2Var, yz3 yz3Var, Anime anime) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        String str;
        kd2 kd2Var2 = kd2Var;
        Anime anime2 = anime;
        anime2.getClass();
        ub2Var.getClass();
        kd2Var2.f0(1839182148);
        if (kd2Var2.h(anime2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var2.h(ub2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        byte b2 = 1;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i7 & 1, z)) {
            Context context = (Context) kd2Var2.j(eb.b);
            boolean f2 = kd2Var2.f(anime2.getCoverImage()) | kd2Var2.f(context);
            Object Q = kd2Var2.Q();
            Object obj = au0.a;
            if (f2 || Q == obj) {
                bv2 bv2Var = new bv2(context);
                String extraLarge = anime2.getCoverImage().getExtraLarge();
                if (extraLarge == null) {
                    extraLarge = anime2.getCoverImage().getLarge();
                }
                bv2Var.c = extraLarge;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var2.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            yz3 t = wk6.t(ar5.g(ar5.c(yz3Var, 1.0f), 122.0f, 0.0f, 2));
            tq1 tq1Var = op0.a;
            long j = ((mp0) kd2Var2.j(tq1Var)).n;
            ao2 ao2Var = io3.h;
            yz3 h2 = bx7.h(t, j, ao2Var);
            if ((i7 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h3 = z2 | kd2Var2.h(anime2);
            Object Q2 = kd2Var2.Q();
            if (h3 || Q2 == obj) {
                Q2 = new em(ub2Var, anime2, b2);
                kd2Var2.n0(Q2);
            }
            yz3 A = kb0.A(h2, false, null, null, false, (sb2) Q2, kd2Var, 0, 31);
            z75 a2 = y75.a(x97.y, pk2.H, kd2Var, 48);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, A);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z3 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z3) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            vz3 vz3Var = vz3.x;
            yz3 h4 = bx7.h(n03.k(ar5.l(vz3Var, 90.0f).w(ar5.b), ((cn5) kd2Var.j(dn5.a)).b), ((mp0) kd2Var.j(tq1Var)).r, ao2Var);
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, h4);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, c2);
            ss5.i(ys0Var, kd2Var, l2);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            tl7.a(ev2Var, e02.b(anime2.getTitle()), n90.a.b(vz3Var), pk2.O, kd2Var, 1572864);
            kd2Var.q(true);
            yz3 S = n77.S(new ob3(1.0f, true), 12.0f, 4.0f);
            xp0 a3 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 6);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, S);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            String b3 = e02.b(anime2.getTitle());
            long j2 = ((mp0) kd2Var.j(tq1Var)).o;
            tq1 tq1Var2 = pl6.a;
            byte b4 = 1;
            yc6.b(b3, null, j2, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, ((nl6) kd2Var.j(tq1Var2)).j, kd2Var, 0, 24960, 110586);
            List<String> genres = anime.getGenres();
            if (genres != null) {
                str = wi5.r0(wi5.t0(new os(genres, b4), 2), ", ", null, 62);
            } else {
                str = "N/A";
            }
            yc6.b(str, null, ep0.b(0.6f, ((mp0) kd2Var.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var.j(tq1Var2)).l, kd2Var, 0, 24960, 110586);
            yz3 V = n77.V(vz3Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
            byte b5 = 6;
            anime2 = anime;
            q23.b(V, new vr(6.0f, true, new ze0(b5)), new vr(6.0f, true, new ze0(b5)), null, 0, 0, nx7.R(1006785155, new hm(anime2, b4), kd2Var), kd2Var, 1573302, 56);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new gm(anime2, ub2Var, yz3Var, i);
        }
    }

    public static final void f(z44 z44Var, xz3 xz3Var) {
        z44 A = O(xz3Var).A();
        int i = A.z - 1;
        Object[] objArr = A.x;
        if (i < objArr.length) {
            while (i >= 0) {
                z44Var.b((xz3) ((za3) objArr[i]).c0.D);
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ra3 g(xz3 xz3Var) {
        if ((xz3Var.z & 2) != 0) {
            if (xz3Var instanceof ra3) {
                return (ra3) xz3Var;
            }
            if (xz3Var instanceof zc1) {
                xz3 xz3Var2 = ((zc1) xz3Var).M;
                while (xz3Var2 != 0) {
                    if (xz3Var2 instanceof ra3) {
                        return (ra3) xz3Var2;
                    }
                    if ((xz3Var2 instanceof zc1) && (xz3Var2.z & 2) != 0) {
                        xz3Var2 = ((zc1) xz3Var2).M;
                    } else {
                        xz3Var2 = xz3Var2.C;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [yz3, java.lang.Object] */
    public static yz3 h(yz3 yz3Var) {
        return yz3Var.w(new Object());
    }

    public static final Object i(yc1 yc1Var, sb2 sb2Var, xz0 xz0Var) {
        Object obj;
        fa4 N;
        Object o0;
        kf kfVar;
        if (((xz3) yc1Var).x.K) {
            xz3 xz3Var = (xz3) yc1Var;
            if (!xz3Var.x.K) {
                ez2.b("visitAncestors called on an unattached node");
            }
            xz3 xz3Var2 = xz3Var.x.B;
            za3 O = O(yc1Var);
            loop0: while (true) {
                obj = null;
                if (O == null) {
                    break;
                }
                if ((((xz3) O.c0.D).A & 524288) != 0) {
                    while (xz3Var2 != null) {
                        if ((xz3Var2.z & 524288) != 0) {
                            xz3 xz3Var3 = xz3Var2;
                            z44 z44Var = null;
                            while (xz3Var3 != null) {
                                if (xz3Var3 instanceof t90) {
                                    obj = xz3Var3;
                                    break loop0;
                                }
                                if ((xz3Var3.z & 524288) != 0 && (xz3Var3 instanceof zc1)) {
                                    int i = 0;
                                    for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                        if ((xz3Var4.z & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                xz3Var3 = xz3Var4;
                                            } else {
                                                if (z44Var == null) {
                                                    z44Var = new z44(new xz3[16], 0);
                                                }
                                                if (xz3Var3 != null) {
                                                    z44Var.b(xz3Var3);
                                                    xz3Var3 = null;
                                                }
                                                z44Var.b(xz3Var4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                xz3Var3 = J(z44Var);
                            }
                        }
                        xz3Var2 = xz3Var2.B;
                    }
                }
                O = O.v();
                if (O != null && (kfVar = O.c0) != null) {
                    xz3Var2 = (z66) kfVar.C;
                } else {
                    xz3Var2 = null;
                }
            }
            t90 t90Var = (t90) obj;
            if (t90Var != null && (o0 = t90Var.o0((N = N(yc1Var)), new n(sb2Var, N, (byte) 20), xz0Var)) == w11.x) {
                return o0;
            }
        }
        return pn6.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vz0 j(vz0 vz0Var, vz0 vz0Var2, ic2 ic2Var) {
        ic2Var.getClass();
        if (ic2Var instanceof h30) {
            return ((h30) ic2Var).create(vz0Var, vz0Var2);
        }
        l11 context = vz0Var2.getContext();
        if (context == it1.x) {
            return new s23(vz0Var2, vz0Var, ic2Var);
        }
        return new t23(vz0Var2, context, ic2Var, vz0Var);
    }

    public static Object k(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        ze0.k(qx1.h(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final q65 l(Context context, Class cls, String str) {
        context.getClass();
        if (!uz5.V(str)) {
            if (!str.equals(":memory:")) {
                return new q65(context, cls, str);
            }
            ze0.k("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        ze0.k("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final int o(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static boolean p(String str, String str2) {
        char c2;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i = 0; i < length; i++) {
                    if (str.charAt(i) == str2.charAt(i) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static iw4 q(String str) {
        if (str.equals("http/1.0")) {
            return iw4.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return iw4.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return iw4.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return iw4.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return iw4.SPDY_3;
        }
        if (str.equals("quic")) {
            return iw4.QUIC;
        }
        qi2.k("Unexpected protocol: ".concat(str));
        return null;
    }

    public static Object s(Future future) {
        Object obj;
        io3.D(future.isDone(), "Future was expected to be done: %s", future);
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Object t(ro3 ro3Var) {
        ma3 ma3Var;
        Object w = ro3Var.w();
        if (w instanceof ma3) {
            ma3Var = (ma3) w;
        } else {
            ma3Var = null;
        }
        if (ma3Var == null) {
            return null;
        }
        return ma3Var.L;
    }

    public static String u(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return h11.g(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j1, zv2, java.lang.Object] */
    public static zv2 v(Exception exc) {
        ?? obj = new Object();
        obj.m(exc);
        return obj;
    }

    public static aw2 w(Object obj) {
        if (obj == null) {
            return aw2.y;
        }
        return new aw2(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int x(String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String n = qy3.n(str);
        n.getClass();
        switch (n.hashCode()) {
            case -2123537834:
                if (n.equals("audio/eac3-joc")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (n.equals("video/mp2p")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (n.equals("video/mp2t")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (n.equals(MimeTypes.VIDEO_WEBM)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (n.equals("audio/amr-wb")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487656890:
                if (n.equals("image/avif")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (n.equals("image/heic")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (n.equals("image/heif")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (n.equals("image/jpeg")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (n.equals("image/webp")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (n.equals("application/mp4")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (n.equals("video/x-msvideo")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (n.equals("text/vtt")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (n.equals("image/bmp")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (n.equals("image/png")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (n.equals("audio/x-matroska")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (n.equals("application/webm")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (n.equals("video/x-flv")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (n.equals("audio/ac3")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (n.equals("audio/ac4")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (n.equals("audio/amr")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (n.equals("audio/mp4")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (n.equals("audio/ogg")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (n.equals("audio/wav")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (n.equals("video/mp4")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (n.equals("audio/3gpp")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (n.equals("audio/eac3")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (n.equals("audio/flac")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (n.equals("audio/midi")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (n.equals("audio/mpeg")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (n.equals("audio/webm")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (n.equals("video/x-matroska")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int y(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                            if (!lastPathSegment.endsWith(".avif")) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static vz0 z(vz0 vz0Var) {
        xz0 xz0Var;
        vz0 intercepted;
        vz0Var.getClass();
        if (vz0Var instanceof xz0) {
            xz0Var = (xz0) vz0Var;
        } else {
            xz0Var = null;
        }
        if (xz0Var != null && (intercepted = xz0Var.intercepted()) != null) {
            return intercepted;
        }
        return vz0Var;
    }

    public fy3 m(hy3 hy3Var) {
        boolean z;
        ByteBuffer byteBuffer = hy3Var.B;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        return n(hy3Var, byteBuffer);
    }

    public abstract fy3 n(hy3 hy3Var, ByteBuffer byteBuffer);

    public void r(an5 an5Var, float f2, float f3) {
        float f4 = f3 * f2;
        an5Var.d(f4, 180.0f, 90.0f);
        double d2 = f4;
        an5Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d2));
    }
}

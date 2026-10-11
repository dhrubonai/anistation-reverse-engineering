package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.anistation.android.R;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class va extends r3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final r34 k0;
    public final oa A;
    public int B = Integer.MIN_VALUE;
    public final pa C = new pa(this, 0);
    public final AccessibilityManager D;
    public long E;
    public List F;
    public final ra G;
    public int H;
    public int I;
    public g4 J;
    public g4 K;
    public boolean L;
    public final s34 M;
    public final s34 N;
    public final zv5 O;
    public final zv5 P;
    public int Q;
    public Integer R;
    public final ls S;
    public final za0 T;
    public boolean U;
    public sa V;
    public s34 W;
    public final t34 X;
    public final q34 Y;
    public final q34 Z;
    public final String a0;
    public final String b0;
    public final xf6 c0;
    public final s34 d0;
    public vh5 e0;
    public boolean f0;
    public final q34 g0;
    public final p0 h0;
    public final ArrayList i0;
    public final pa j0;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        r34 r34Var = y03.a;
        r34 r34Var2 = new r34(32);
        int i = r34Var2.b;
        if (i >= 0) {
            int i2 = i + 32;
            r34Var2.b(i2);
            int[] iArr2 = r34Var2.a;
            int i3 = r34Var2.b;
            if (i != i3) {
                ms.w0(i2, i, i3, iArr2, iArr2);
            }
            ms.A0(i, 0, 12, iArr, iArr2);
            r34Var2.b += 32;
            k0 = r34Var2;
            return;
        }
        ze0.g("");
    }

    public va(oa oaVar) {
        this.A = oaVar;
        Object systemService = oaVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.D = (AccessibilityManager) systemService;
        this.E = 100L;
        new Handler(Looper.getMainLooper());
        this.G = new ra(this);
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.M = new s34();
        this.N = new s34();
        this.O = new zv5(0);
        this.P = new zv5(0);
        this.Q = -1;
        this.S = new ls(0);
        this.T = iv.d(1, 6, null);
        this.U = true;
        s34 s34Var = b13.a;
        s34Var.getClass();
        this.W = s34Var;
        this.X = new t34();
        this.Y = new q34();
        this.Z = new q34();
        this.a0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.b0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.c0 = new xf6((byte) 2);
        this.d0 = new s34();
        this.e0 = new vh5(oaVar.getSemanticsOwner().a(), s34Var);
        int i = v03.a;
        this.g0 = new q34();
        oaVar.addOnAttachStateChangeListener(this);
        this.h0 = new p0(this, (byte) 1);
        this.i0 = new ArrayList();
        this.j0 = new pa(this, (byte) 1);
    }

    public static Rect G(bb4 bb4Var, float f, float f2) {
        if (!(bb4Var instanceof ah4) && !(bb4Var instanceof bh4)) {
            return null;
        }
        n05 D = bb4Var.D();
        return new Rect((int) (D.a + f), (int) (D.b + f2), (int) (D.c + f), (int) (D.d + f2));
    }

    public static float[] I(bb4 bb4Var) {
        if (bb4Var instanceof bh4) {
            m75 m75Var = ((bh4) bb4Var).O;
            long j = m75Var.h;
            long j2 = m75Var.g;
            long j3 = m75Var.f;
            long j4 = m75Var.e;
            return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
        }
        return null;
    }

    public static Region J(bb4 bb4Var, float f, float f2) {
        if (bb4Var instanceof zg4) {
            zg4 zg4Var = (zg4) bb4Var;
            n05 j = zg4Var.D().j(f, f2);
            Region region = new Region(new Rect((int) (j.a + 0.0f), (int) (j.b + 0.0f), (int) (j.c + 0.0f), (int) (j.d + 0.0f)));
            Region region2 = new Region();
            id idVar = zg4Var.O;
            if (idVar instanceof id) {
                Path path = idVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            ov3.g("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String o(uh5 uh5Var) {
        ko koVar;
        if (uh5Var != null) {
            ph5 ph5Var = uh5Var.d;
            p44 p44Var = ph5Var.x;
            ai5 ai5Var = yh5.a;
            if (p44Var.c(ai5Var)) {
                return hi3.a((List) ph5Var.c(ai5Var), ",", null, 62);
            }
            ai5 ai5Var2 = yh5.G;
            if (p44Var.c(ai5Var2)) {
                Object g = p44Var.g(ai5Var2);
                if (g == null) {
                    g = null;
                }
                ko koVar2 = (ko) g;
                if (koVar2 != null) {
                    return koVar2.y;
                }
            } else {
                Object g2 = p44Var.g(yh5.C);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (koVar = (ko) yo0.m0(list)) != null) {
                    return koVar.y;
                }
            }
        }
        return null;
    }

    public static final boolean s(hc5 hc5Var, float f) {
        sb2 sb2Var = hc5Var.a;
        if (f >= 0.0f || ((Number) sb2Var.invoke()).floatValue() <= 0.0f) {
            if (f > 0.0f && ((Number) sb2Var.invoke()).floatValue() < ((Number) hc5Var.b.invoke()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean t(hc5 hc5Var) {
        sb2 sb2Var = hc5Var.a;
        if (((Number) sb2Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) sb2Var.invoke()).floatValue();
        ((Number) hc5Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean u(hc5 hc5Var) {
        sb2 sb2Var = hc5Var.a;
        if (((Number) sb2Var.invoke()).floatValue() < ((Number) hc5Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) sb2Var.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(va vaVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        vaVar.y(i, i2, num, null);
    }

    public final void A(String str, int i, int i2) {
        AccessibilityEvent j = j(v(i), 32);
        j.setContentChangeTypes(i2);
        if (str != null) {
            j.getText().add(str);
        }
        x(j);
    }

    public final void B(int i) {
        sa saVar = this.V;
        if (saVar != null) {
            uh5 uh5Var = saVar.a;
            if (i != uh5Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - saVar.f <= 1000) {
                AccessibilityEvent j = j(v(uh5Var.f), 131072);
                j.setFromIndex(saVar.d);
                j.setToIndex(saVar.e);
                j.setAction(saVar.b);
                j.setMovementGranularity(saVar.c);
                j.getText().add(o(uh5Var));
                x(j);
            }
        }
        this.V = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0526, code lost:
    
        if (r5 != null) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x052b, code lost:
    
        if (r5 == null) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        if (defpackage.a34.i(r1, r13) != false) goto L381;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.a13 r57) {
        /*
            Method dump skipped, instructions count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va.C(a13):void");
    }

    public final void D(za3 za3Var, t34 t34Var) {
        ph5 x;
        if (za3Var.I() && !this.A.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(za3Var)) {
            za3 za3Var2 = null;
            if (!za3Var.c0.g(8)) {
                za3Var = za3Var.v();
                while (true) {
                    if (za3Var != null) {
                        if (za3Var.c0.g(8)) {
                            break;
                        } else {
                            za3Var = za3Var.v();
                        }
                    } else {
                        za3Var = null;
                        break;
                    }
                }
            }
            if (za3Var != null && (x = za3Var.x()) != null) {
                if (!x.z) {
                    za3 v = za3Var.v();
                    while (true) {
                        if (v != null) {
                            ph5 x2 = v.x();
                            if (x2 != null && x2.z) {
                                za3Var2 = v;
                                break;
                            }
                            v = v.v();
                        } else {
                            break;
                        }
                    }
                    if (za3Var2 != null) {
                        za3Var = za3Var2;
                    }
                }
                int i = za3Var.y;
                if (t34Var.a(i)) {
                    z(this, v(i), 2048, 1, 8);
                }
            }
        }
    }

    public final void E(za3 za3Var) {
        if (za3Var.I() && !this.A.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(za3Var)) {
            int i = za3Var.y;
            hc5 hc5Var = (hc5) this.M.b(i);
            hc5 hc5Var2 = (hc5) this.N.b(i);
            if (hc5Var == null && hc5Var2 == null) {
                return;
            }
            AccessibilityEvent j = j(i, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (hc5Var != null) {
                j.setScrollX((int) ((Number) hc5Var.a.invoke()).floatValue());
                j.setMaxScrollX((int) ((Number) hc5Var.b.invoke()).floatValue());
            }
            if (hc5Var2 != null) {
                j.setScrollY((int) ((Number) hc5Var2.a.invoke()).floatValue());
                j.setMaxScrollY((int) ((Number) hc5Var2.b.invoke()).floatValue());
            }
            x(j);
        }
    }

    public final boolean F(uh5 uh5Var, int i, int i2, boolean z) {
        String o;
        Integer num;
        Integer num2;
        ph5 ph5Var = uh5Var.d;
        int i3 = uh5Var.f;
        ai5 ai5Var = oh5.j;
        boolean z2 = false;
        if (ph5Var.x.c(ai5Var) && v94.r(uh5Var)) {
            jc2 jc2Var = (jc2) ((o3) uh5Var.d.c(ai5Var)).b;
            if (jc2Var != null) {
                return ((Boolean) jc2Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.Q) && (o = o(uh5Var)) != null) {
            if (i < 0 || i != i2 || i2 > o.length()) {
                i = -1;
            }
            this.Q = i;
            if (o.length() > 0) {
                z2 = true;
            }
            int v = v(i3);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.Q);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.Q);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(o.length());
            }
            x(k(v, num, num2, num3, o));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        oa oaVar = this.A;
        long p = oaVar.p((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long p2 = oaVar.p((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (p >> 32);
        int i2 = (int) (p2 >> 32);
        int i3 = (int) (p & 4294967295L);
        int i4 = (int) (p2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va.L():void");
    }

    @Override // defpackage.r3
    public final cn7 a(View view) {
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r21, defpackage.g4 r22, java.lang.String r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va.e(int, g4, java.lang.String, android.os.Bundle):void");
    }

    public final Rect f(wh5 wh5Var) {
        g13 g13Var = wh5Var.b;
        return H(g13Var.a, g13Var.b, g13Var.c, g13Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
    
        if (defpackage.x97.u(r4, r2) == r7) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:65:0x0046, B:67:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0107 -> B:14:0x010a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.xz0 r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va.g(xz0):java.lang.Object");
    }

    public final boolean h(int i, long j, boolean z) {
        ai5 ai5Var;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (a34.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a13 n = n();
            if (!xc4.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    ai5Var = yh5.w;
                } else if (!z) {
                    ai5Var = yh5.v;
                } else {
                    ze0.l();
                    return false;
                }
                Object[] objArr = n.c;
                long[] jArr = n.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z6 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    wh5 wh5Var = (wh5) objArr[(i3 << 3) + i6];
                                    g13 g13Var = wh5Var.b;
                                    float f = g13Var.a;
                                    i2 = i4;
                                    float f2 = g13Var.b;
                                    float f3 = g13Var.c;
                                    float f4 = g13Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (intBitsToFloat >= f) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (intBitsToFloat < f3) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean z7 = z2 & z3;
                                    if (intBitsToFloat2 >= f2) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolean z8 = z7 & z4;
                                    if (intBitsToFloat2 < f4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & z8) {
                                        Object g = wh5Var.a.d.x.g(ai5Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        hc5 hc5Var = (hc5) g;
                                        if (hc5Var != null) {
                                            sb2 sb2Var = hc5Var.a;
                                            if (i < 0) {
                                                if (((Number) sb2Var.invoke()).floatValue() <= 0.0f) {
                                                }
                                                z6 = true;
                                            } else {
                                                if (((Number) sb2Var.invoke()).floatValue() >= ((Number) hc5Var.b.invoke()).floatValue()) {
                                                }
                                                z6 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z6;
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        } else {
                            return z6;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.A.getSemanticsOwner().a(), this.e0);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        wh5 wh5Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        oa oaVar = this.A;
        obtain.setPackageName(oaVar.getContext().getPackageName());
        obtain.setSource(oaVar, i);
        if (q() && (wh5Var = (wh5) n().b(i)) != null) {
            uh5 uh5Var = wh5Var.a;
            obtain.setPassword(uh5Var.d.x.c(yh5.N));
            Object g = uh5Var.d.x.g(yh5.o);
            if (g == null) {
                g = null;
            }
            boolean i3 = a34.i(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                s3.l(obtain, i3);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent j = j(i, 8192);
        if (num != null) {
            j.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            j.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            j.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            j.getText().add(charSequence);
        }
        return j;
    }

    public final int l(uh5 uh5Var) {
        ph5 ph5Var = uh5Var.d;
        if (!ph5Var.x.c(yh5.a)) {
            ai5 ai5Var = yh5.H;
            if (ph5Var.x.c(ai5Var)) {
                return (int) (((nd6) ph5Var.c(ai5Var)).a & 4294967295L);
            }
        }
        return this.Q;
    }

    public final int m(uh5 uh5Var) {
        ph5 ph5Var = uh5Var.d;
        if (!ph5Var.x.c(yh5.a)) {
            ai5 ai5Var = yh5.H;
            if (ph5Var.x.c(ai5Var)) {
                return (int) (((nd6) ph5Var.c(ai5Var)).a >> 32);
            }
        }
        return this.Q;
    }

    public final a13 n() {
        uh5 uh5Var;
        if (this.U) {
            this.U = false;
            oa oaVar = this.A;
            byte b = 9;
            this.W = nx7.z(oaVar.getSemanticsOwner(), new b3((byte) 9));
            if (q()) {
                s34 s34Var = this.W;
                Resources resources = oaVar.getContext().getResources();
                q34 q34Var = this.Y;
                q34Var.a();
                q34 q34Var2 = this.Z;
                q34Var2.a();
                wh5 wh5Var = (wh5) s34Var.b(-1);
                if (wh5Var != null) {
                    uh5Var = wh5Var.a;
                } else {
                    uh5Var = null;
                }
                uh5Var.getClass();
                ArrayList b2 = ci5.b(uh5Var, new l0(s34Var, (byte) 8), new l0(resources, b), te4.H(uh5Var));
                int i = 1;
                int size = b2.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((uh5) b2.get(i - 1)).f;
                        int i3 = ((uh5) b2.get(i)).f;
                        q34Var.f(i2, i3);
                        q34Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.W;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.F = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.F = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.D;
        if (accessibilityManager.isEnabled()) {
            this.F = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.A.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.h0);
        AccessibilityManager accessibilityManager = this.D;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final n05 p(uh5 uh5Var, Rect rect, om5 om5Var) {
        ua uaVar = new ua(om5Var);
        za3 za3Var = uh5Var.c;
        xz3 xz3Var = (xz3) za3Var.c0.D;
        yc1 yc1Var = null;
        if ((xz3Var.A & 8) != 0) {
            loop0: while (true) {
                if (xz3Var == null) {
                    break;
                }
                if ((xz3Var.z & 8) != 0) {
                    xz3 xz3Var2 = xz3Var;
                    z44 z44Var = null;
                    while (xz3Var2 != null) {
                        if (xz3Var2 instanceof sh5) {
                            ((sh5) xz3Var2).I0(uaVar);
                            if (uaVar.x) {
                                yc1Var = xz3Var2;
                                break loop0;
                            }
                        } else if ((xz3Var2.z & 8) != 0 && (xz3Var2 instanceof zc1)) {
                            int i = 0;
                            for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                if ((xz3Var3.z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        xz3Var2 = xz3Var3;
                                    } else {
                                        if (z44Var == null) {
                                            z44Var = new z44(new xz3[16], 0);
                                        }
                                        if (xz3Var2 != null) {
                                            z44Var.b(xz3Var2);
                                            xz3Var2 = null;
                                        }
                                        z44Var.b(xz3Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        xz3Var2 = wc7.J(z44Var);
                    }
                }
                if ((xz3Var.A & 8) == 0) {
                    break;
                }
                xz3Var = xz3Var.C;
            }
        }
        yc1 yc1Var2 = (sh5) yc1Var;
        if (yc1Var2 != null && ((xz3) yc1Var2).x.K) {
            fa4 N = wc7.N(yc1Var2);
            n05 G = te4.B(N).G(N, false);
            Rect H = H(G.a, G.b, G.c, G.d);
            float f = H.left - rect.left;
            float f2 = H.top - rect.top;
            return new n05(f, f2, H.width() + f, H.height() + f2);
        }
        return te4.q((fa4) za3Var.c0.B, false);
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.D;
        if (accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.F;
            if (list == null) {
                list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.F = list;
            }
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r(za3 za3Var) {
        if (this.S.add(za3Var)) {
            this.T.i(pn6.a);
        }
    }

    public final int v(int i) {
        if (i == this.A.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final void w(uh5 uh5Var, vh5 vh5Var) {
        int[] iArr = j13.a;
        t34 t34Var = new t34();
        List j = uh5.j(4, uh5Var);
        za3 za3Var = uh5Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            uh5 uh5Var2 = (uh5) j.get(i);
            a13 n = n();
            int i2 = uh5Var2.f;
            if (n.a(i2)) {
                if (!vh5Var.b.b(i2)) {
                    r(za3Var);
                    return;
                }
                t34Var.a(i2);
            }
        }
        t34 t34Var2 = vh5Var.b;
        int[] iArr2 = t34Var2.b;
        long[] jArr = t34Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !t34Var.b(iArr2[(i3 << 3) + i5])) {
                            r(za3Var);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List j3 = uh5.j(4, uh5Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            uh5 uh5Var3 = (uh5) j3.get(i6);
            vh5 vh5Var2 = (vh5) this.d0.b(uh5Var3.f);
            if (vh5Var2 != null && n().a(uh5Var3.f)) {
                w(uh5Var3, vh5Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.L = true;
        }
        try {
            return ((Boolean) this.C.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.L = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && q()) {
            AccessibilityEvent j = j(i, i2);
            if (num != null) {
                j.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                j.setContentDescription(hi3.a(list, ",", null, 62));
            }
            return x(j);
        }
        return false;
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jb implements m91, View.OnAttachStateChangeListener {
    public final ArrayList A = new ArrayList();
    public fb B = fb.x;
    public boolean C = true;
    public final za0 D = iv.d(1, 6, null);
    public s34 E;
    public long F;
    public final s34 G;
    public vh5 H;
    public boolean I;
    public final p0 J;
    public final oa x;
    public final ia y;
    public rt3 z;

    public jb(oa oaVar, ia iaVar) {
        this.x = oaVar;
        this.y = iaVar;
        new Handler(Looper.getMainLooper());
        s34 s34Var = b13.a;
        s34Var.getClass();
        this.E = s34Var;
        this.G = new s34();
        this.H = new vh5(oaVar.getSemanticsOwner().a(), s34Var);
        this.J = new p0((Object) this, (byte) 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (defpackage.x97.u(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ib
            if (r0 == 0) goto L13
            r0 = r9
            ib r0 = (defpackage.ib) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ib r0 = new ib
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            ua0 r1 = r0.x
            defpackage.m37.N(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L34:
            ua0 r1 = r0.x
            defpackage.m37.N(r9)
            goto L52
        L3a:
            defpackage.m37.N(r9)
            ua0 r9 = new ua0
            za0 r1 = r8.D
            r9.<init>(r1)
        L44:
            r0.x = r9
            r0.A = r3
            java.lang.Object r1 = r9.a(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L66
            r8.e()
        L66:
            oa r9 = r8.x
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.I
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.I = r3
            p0 r5 = r8.J
            r9.post(r5)
        L79:
            r0.x = r1
            r0.A = r2
            r5 = 100
            java.lang.Object r9 = defpackage.x97.u(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            pn6 r8 = defpackage.pn6.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.a(xz0):java.lang.Object");
    }

    public final void b(a13 a13Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        uh5 uh5Var;
        long[] jArr3;
        vh5 vh5Var;
        int i3;
        long[] jArr4;
        vh5 vh5Var2;
        ko koVar;
        ko koVar2;
        String str;
        long j3;
        String str2;
        int i4;
        ko koVar3;
        a13 a13Var2 = a13Var;
        int[] iArr3 = a13Var2.b;
        long[] jArr5 = a13Var2.a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr5[i5];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            int i9 = iArr3[(i5 << 3) + i8];
                            c = c2;
                            vh5 vh5Var3 = (vh5) this.G.b(i9);
                            wh5 wh5Var = (wh5) a13Var2.b(i9);
                            if (wh5Var != null) {
                                uh5Var = wh5Var.a;
                            } else {
                                uh5Var = null;
                            }
                            if (uh5Var != null) {
                                j2 = j5;
                                int i10 = uh5Var.f;
                                p44 p44Var = uh5Var.d.x;
                                String str3 = "Invalid content capture ID";
                                if (vh5Var3 == null) {
                                    Object[] objArr = p44Var.b;
                                    long[] jArr6 = p44Var.a;
                                    int i11 = i6;
                                    int length2 = jArr6.length - 2;
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    if (length2 >= 0) {
                                        int i12 = 0;
                                        while (true) {
                                            long j6 = jArr6[i12];
                                            j = j4;
                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                int i14 = 0;
                                                while (i14 < i13) {
                                                    if ((j6 & 255) < 128) {
                                                        j3 = j6;
                                                        ai5 ai5Var = (ai5) objArr[(i12 << 3) + i14];
                                                        ai5 ai5Var2 = yh5.C;
                                                        if (a34.i(ai5Var, ai5Var2)) {
                                                            Object g = p44Var.g(ai5Var2);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            List list = (List) g;
                                                            if (list != null) {
                                                                koVar3 = (ko) yo0.m0(list);
                                                            } else {
                                                                koVar3 = null;
                                                            }
                                                            String valueOf = String.valueOf(koVar3);
                                                            rt3 rt3Var = this.z;
                                                            if (rt3Var != null) {
                                                                str2 = str3;
                                                                i4 = i8;
                                                                AutofillId x = rt3Var.x(i10);
                                                                if (x != null) {
                                                                    ((ContentCaptureSession) rt3Var.y).notifyViewTextChanged(x, valueOf);
                                                                    j6 = j3 >> i11;
                                                                    i14++;
                                                                    i8 = i4;
                                                                    str3 = str2;
                                                                } else {
                                                                    throw h11.e(str2);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j6;
                                                    }
                                                    str2 = str3;
                                                    i4 = i8;
                                                    j6 = j3 >> i11;
                                                    i14++;
                                                    i8 = i4;
                                                    str3 = str2;
                                                }
                                                str = str3;
                                                i = i8;
                                                if (i13 != i11) {
                                                    break;
                                                }
                                            } else {
                                                str = str3;
                                                i = i8;
                                            }
                                            if (i12 == length2) {
                                                break;
                                            }
                                            i12++;
                                            j4 = j;
                                            i8 = i;
                                            str3 = str;
                                            i11 = 8;
                                        }
                                    } else {
                                        j = j4;
                                        i = i8;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    j = j4;
                                    i = i8;
                                    Object[] objArr2 = p44Var.b;
                                    long[] jArr7 = p44Var.a;
                                    int length3 = jArr7.length - 2;
                                    if (length3 >= 0) {
                                        int i15 = 0;
                                        while (true) {
                                            long j7 = jArr7[i15];
                                            Object[] objArr3 = objArr2;
                                            long[] jArr8 = jArr7;
                                            if ((((~j7) << c) & j7 & j2) != j2) {
                                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                                int i17 = 0;
                                                while (i17 < i16) {
                                                    if ((j7 & 255) < 128) {
                                                        ai5 ai5Var3 = (ai5) objArr3[(i15 << 3) + i17];
                                                        i3 = i17;
                                                        ai5 ai5Var4 = yh5.C;
                                                        if (a34.i(ai5Var3, ai5Var4)) {
                                                            Object g2 = vh5Var3.a.x.g(ai5Var4);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            List list2 = (List) g2;
                                                            if (list2 != null) {
                                                                koVar = (ko) yo0.m0(list2);
                                                            } else {
                                                                koVar = null;
                                                            }
                                                            Object g3 = p44Var.g(ai5Var4);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            List list3 = (List) g3;
                                                            if (list3 != null) {
                                                                koVar2 = (ko) yo0.m0(list3);
                                                            } else {
                                                                koVar2 = null;
                                                            }
                                                            if (!a34.i(koVar, koVar2)) {
                                                                String valueOf2 = String.valueOf(koVar2);
                                                                rt3 rt3Var2 = this.z;
                                                                if (rt3Var2 != null) {
                                                                    jArr4 = jArr8;
                                                                    vh5Var2 = vh5Var3;
                                                                    AutofillId x2 = rt3Var2.x(i10);
                                                                    if (x2 != null) {
                                                                        ((ContentCaptureSession) rt3Var2.y).notifyViewTextChanged(x2, valueOf2);
                                                                        j7 >>= 8;
                                                                        i17 = i3 + 1;
                                                                        vh5Var3 = vh5Var2;
                                                                        jArr8 = jArr4;
                                                                    } else {
                                                                        throw h11.e("Invalid content capture ID");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i3 = i17;
                                                    }
                                                    jArr4 = jArr8;
                                                    vh5Var2 = vh5Var3;
                                                    j7 >>= 8;
                                                    i17 = i3 + 1;
                                                    vh5Var3 = vh5Var2;
                                                    jArr8 = jArr4;
                                                }
                                                jArr3 = jArr8;
                                                vh5Var = vh5Var3;
                                                if (i16 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr3 = jArr8;
                                                vh5Var = vh5Var3;
                                            }
                                            if (i15 == length3) {
                                                break;
                                            }
                                            i15++;
                                            objArr2 = objArr3;
                                            vh5Var3 = vh5Var;
                                            jArr7 = jArr3;
                                        }
                                    }
                                }
                                i2 = 8;
                            } else {
                                throw h11.e("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i8;
                            i2 = i6;
                        }
                        j4 = j >> i2;
                        i8 = i + 1;
                        a13Var2 = a13Var;
                        i6 = i2;
                        c2 = c;
                        j5 = j2;
                        iArr3 = iArr2;
                        jArr5 = jArr2;
                    }
                    iArr = iArr3;
                    jArr = jArr5;
                    if (i7 != i6) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                    jArr = jArr5;
                }
                if (i5 != length) {
                    i5++;
                    a13Var2 = a13Var;
                    iArr3 = iArr;
                    jArr5 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final a13 c() {
        if (this.C) {
            this.C = false;
            this.E = nx7.z(this.x.getSemanticsOwner(), new b3((byte) 12));
            this.F = System.currentTimeMillis();
        }
        return this.E;
    }

    public final boolean d() {
        if (this.z != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        rt3 rt3Var = this.z;
        if (rt3Var != null) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) rt3Var.y;
            ArrayList arrayList = this.A;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    cy0 cy0Var = (cy0) arrayList.get(i);
                    int ordinal = cy0Var.c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            AutofillId x = rt3Var.x(cy0Var.a);
                            if (x != null) {
                                contentCaptureSession.notifyViewDisappeared(x);
                            }
                        } else {
                            ze0.l();
                            return;
                        }
                    } else {
                        eo3 eo3Var = cy0Var.d;
                        if (eo3Var != null) {
                            contentCaptureSession.notifyViewAppeared((ViewStructure) eo3Var.y);
                        }
                    }
                }
                contentCaptureSession.notifyViewsDisappeared(((View) rt3Var.z).getAutofillId(), new long[]{Long.MIN_VALUE});
                arrayList.clear();
            }
        }
    }

    public final void f(uh5 uh5Var, vh5 vh5Var) {
        q qVar = new q(vh5Var, this, (byte) 3);
        uh5Var.getClass();
        List j = uh5.j(4, uh5Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (c().a(((uh5) obj).f)) {
                qVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j2 = uh5.j(4, uh5Var);
        int size2 = j2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            uh5 uh5Var2 = (uh5) j2.get(i3);
            a13 c = c();
            int i4 = uh5Var2.f;
            if (c.a(i4)) {
                s34 s34Var = this.G;
                if (s34Var.a(i4)) {
                    Object b = s34Var.b(i4);
                    if (b != null) {
                        f(uh5Var2, (vh5) b);
                    } else {
                        throw h11.e("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r19, defpackage.uh5 r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.g(int, uh5):void");
    }

    public final void h(uh5 uh5Var) {
        if (d()) {
            this.A.add(new cy0(uh5Var.f, this.F, dy0.y, null));
            List j = uh5.j(4, uh5Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                h((uh5) j.get(i));
            }
        }
    }

    public final void i() {
        s34 s34Var = this.G;
        s34Var.c();
        a13 c = c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            s34Var.h(iArr[i4], new vh5(((wh5) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.H = new vh5(this.x.getSemanticsOwner().a(), c());
    }

    @Override // defpackage.m91
    public final void onStart(og3 og3Var) {
        this.z = (rt3) this.y.invoke();
        g(-1, this.x.getSemanticsOwner().a());
        e();
    }

    @Override // defpackage.m91
    public final void onStop(og3 og3Var) {
        h(this.x.getSemanticsOwner().a());
        e();
        this.z = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.x.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.J);
        this.z = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

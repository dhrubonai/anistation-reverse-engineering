package y;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import d2.t;
import d2.v;
import l8.u;
import p7.a0;
import v1.s0;

/* loaded from: classes.dex */
public final class c implements d2.h {

    /* renamed from: a, reason: collision with root package name */
    public int f11423a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11424b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11425c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f11424b = obj;
        this.f11425c = obj2;
        this.f11423a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        if (r8.size() <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        r0 = new androidx.appcompat.widget.a0(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018a, code lost:
    
        if (r19 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018c, code lost:
    
        r0 = new androidx.appcompat.widget.a0(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0192, code lost:
    
        r0 = new androidx.appcompat.widget.a0(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0198, code lost:
    
        if (r11 == 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019b, code lost:
    
        if (r11 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        r16 = (int[]) r0.f403b;
        r17 = (float[]) r0.f404c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ab, code lost:
    
        if (r7 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ad, code lost:
    
        if (r7 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01af, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b7, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r15, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x020f, code lost:
    
        return new y.c(0, r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b2, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b5, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c4, code lost:
    
        r3 = new android.graphics.SweepGradient(r7, r9, (int[]) r0.f403b, (float[]) r0.f404c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01dd, code lost:
    
        if (r8 <= 0.0f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01df, code lost:
    
        r1 = (int[]) r0.f403b;
        r21 = (float[]) r0.f404c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ec, code lost:
    
        if (r7 == 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ef, code lost:
    
        if (r7 == 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f1, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f9, code lost:
    
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f4, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f7, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0217, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y.c b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.b(android.content.res.Resources, int, android.content.res.Resources$Theme):y.c");
    }

    @Override // d2.h
    public final /* synthetic */ void E() {
    }

    public final void a(int i10, s0 s0Var) {
        boolean z9;
        boolean z10 = false;
        if (this.f11423a == -1) {
            if (((SparseArray) this.f11424b).size() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
            this.f11423a = 0;
        }
        if (((SparseArray) this.f11424b).size() > 0) {
            SparseArray sparseArray = (SparseArray) this.f11424b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z10 = true;
            }
            w7.b.g(z10);
            if (keyAt == i10) {
                f1.c cVar = (f1.c) this.f11425c;
                SparseArray sparseArray2 = (SparseArray) this.f11424b;
                cVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        ((SparseArray) this.f11424b).append(i10, s0Var);
    }

    public final long c(d2.q qVar) {
        int d10;
        while (qVar.l() < qVar.c() - 6) {
            v vVar = (v) this.f11424b;
            int i10 = this.f11423a;
            t tVar = (t) this.f11425c;
            long l10 = qVar.l();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean c6 = false;
            qVar.n(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                qVar.g();
                qVar.o((int) (l10 - qVar.q()));
            } else {
                f1.t tVar2 = new f1.t(16);
                System.arraycopy(bArr, 0, tVar2.f3858a, 0, 2);
                byte[] bArr2 = tVar2.f3858a;
                while (i11 < 14 && (d10 = qVar.d(bArr2, 2 + i11, 14 - i11)) != -1) {
                    i11 += d10;
                }
                tVar2.F(i11);
                qVar.g();
                qVar.o((int) (l10 - qVar.q()));
                c6 = a0.c(tVar2, vVar, i10, tVar);
            }
            if (c6) {
                break;
            }
            qVar.o(1);
        }
        if (qVar.l() >= qVar.c() - 6) {
            qVar.o((int) (qVar.c() - qVar.l()));
            return ((v) this.f11424b).f3204j;
        }
        return ((t) this.f11425c).f3191a;
    }

    public final Object d(int i10) {
        if (this.f11423a == -1) {
            this.f11423a = 0;
        }
        while (true) {
            int i11 = this.f11423a;
            if (i11 <= 0 || i10 >= ((SparseArray) this.f11424b).keyAt(i11)) {
                break;
            }
            this.f11423a--;
        }
        while (this.f11423a < ((SparseArray) this.f11424b).size() - 1 && i10 >= ((SparseArray) this.f11424b).keyAt(this.f11423a + 1)) {
            this.f11423a++;
        }
        return ((SparseArray) this.f11424b).valueAt(this.f11423a);
    }

    public final Object e() {
        return ((SparseArray) this.f11424b).valueAt(((SparseArray) r0).size() - 1);
    }

    public final boolean f() {
        if (((Shader) this.f11424b) == null) {
            Object obj = this.f11425c;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int[] iArr) {
        if (f()) {
            ColorStateList colorStateList = (ColorStateList) this.f11425c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f11423a) {
                this.f11423a = colorForState;
                return true;
            }
        }
        return false;
    }

    @Override // d2.h
    public final d2.g z(d2.q qVar, long j4) {
        long q9 = qVar.q();
        long c6 = c(qVar);
        long l10 = qVar.l();
        qVar.o(Math.max(6, ((v) this.f11424b).f3197c));
        long c10 = c(qVar);
        long l11 = qVar.l();
        if (c6 <= j4 && c10 > j4) {
            return d2.g.b(l10);
        }
        if (c10 <= j4) {
            return new d2.g(-2, c10, l11);
        }
        return new d2.g(-1, c6, q9);
    }

    public c(j1.l lVar) {
        this.f11424b = new SparseArray();
        this.f11425c = lVar;
        this.f11423a = -1;
    }

    public c(v vVar, int i10) {
        this.f11424b = vVar;
        this.f11423a = i10;
        this.f11425c = new t();
    }

    public c(u uVar, int i10, String str) {
        this.f11425c = uVar;
        this.f11423a = i10;
        this.f11424b = str;
    }

    public c(x3.p pVar) {
        this.f11425c = q6.g.o0(150, new k3.d(this, 4));
        this.f11424b = pVar;
    }

    public c(c1.v vVar, int i10, String str) {
        this.f11424b = vVar;
        this.f11423a = i10;
        this.f11425c = str;
    }
}

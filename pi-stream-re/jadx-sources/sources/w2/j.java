package w2;

import d2.g0;
import f1.b0;
import f1.t;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f10819a;

    /* renamed from: d, reason: collision with root package name */
    public s f10822d;

    /* renamed from: e, reason: collision with root package name */
    public g f10823e;

    /* renamed from: f, reason: collision with root package name */
    public int f10824f;

    /* renamed from: g, reason: collision with root package name */
    public int f10825g;

    /* renamed from: h, reason: collision with root package name */
    public int f10826h;

    /* renamed from: i, reason: collision with root package name */
    public int f10827i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10830l;

    /* renamed from: b, reason: collision with root package name */
    public final r f10820b = new r();

    /* renamed from: c, reason: collision with root package name */
    public final t f10821c = new t();

    /* renamed from: j, reason: collision with root package name */
    public final t f10828j = new t(1);

    /* renamed from: k, reason: collision with root package name */
    public final t f10829k = new t();

    public j(g0 g0Var, s sVar, g gVar) {
        this.f10819a = g0Var;
        this.f10822d = sVar;
        this.f10823e = gVar;
        this.f10822d = sVar;
        this.f10823e = gVar;
        g0Var.b(sVar.f10925a.f10898f);
        d();
    }

    public final q a() {
        if (!this.f10830l) {
            return null;
        }
        r rVar = this.f10820b;
        g gVar = rVar.f10909a;
        int i10 = b0.f3799a;
        int i11 = gVar.f10811a;
        q qVar = rVar.f10921m;
        if (qVar == null) {
            q[] qVarArr = this.f10822d.f10925a.f10903k;
            if (qVarArr == null) {
                qVar = null;
            } else {
                qVar = qVarArr[i11];
            }
        }
        if (qVar == null || !qVar.f10904a) {
            return null;
        }
        return qVar;
    }

    public final boolean b() {
        this.f10824f++;
        if (!this.f10830l) {
            return false;
        }
        int i10 = this.f10825g + 1;
        this.f10825g = i10;
        int[] iArr = this.f10820b.f10915g;
        int i11 = this.f10826h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f10826h = i11 + 1;
        this.f10825g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        t tVar;
        boolean z9;
        boolean z10;
        int i12;
        q a10 = a();
        if (a10 == null) {
            return 0;
        }
        r rVar = this.f10820b;
        int i13 = a10.f10907d;
        if (i13 != 0) {
            tVar = rVar.f10922n;
        } else {
            int i14 = b0.f3799a;
            byte[] bArr = a10.f10908e;
            int length = bArr.length;
            t tVar2 = this.f10829k;
            tVar2.E(bArr, length);
            i13 = bArr.length;
            tVar = tVar2;
        }
        int i15 = this.f10824f;
        if (rVar.f10919k && rVar.f10920l[i15]) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        t tVar3 = this.f10828j;
        byte[] bArr2 = tVar3.f3858a;
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        tVar3.G(0);
        g0 g0Var = this.f10819a;
        g0Var.e(1, 1, tVar3);
        g0Var.e(i13, 1, tVar);
        if (!z10) {
            return i13 + 1;
        }
        t tVar4 = this.f10821c;
        if (!z9) {
            tVar4.D(8);
            byte[] bArr3 = tVar4.f3858a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) ((i11 >> 8) & 255);
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            g0Var.e(8, 1, tVar4);
            return i13 + 1 + 8;
        }
        t tVar5 = rVar.f10922n;
        int A = tVar5.A();
        tVar5.H(-2);
        int i16 = (A * 6) + 2;
        if (i11 != 0) {
            tVar4.D(i16);
            byte[] bArr4 = tVar4.f3858a;
            tVar5.d(bArr4, 0, i16);
            int i17 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i17 >> 8) & 255);
            bArr4[3] = (byte) (i17 & 255);
        } else {
            tVar4 = tVar5;
        }
        g0Var.e(i16, 1, tVar4);
        return i13 + 1 + i16;
    }

    public final void d() {
        r rVar = this.f10820b;
        rVar.f10912d = 0;
        rVar.f10923p = 0L;
        rVar.f10924q = false;
        rVar.f10919k = false;
        rVar.o = false;
        rVar.f10921m = null;
        this.f10824f = 0;
        this.f10826h = 0;
        this.f10825g = 0;
        this.f10827i = 0;
        this.f10830l = false;
    }
}

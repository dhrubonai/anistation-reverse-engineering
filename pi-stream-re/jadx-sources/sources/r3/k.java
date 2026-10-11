package r3;

/* loaded from: classes.dex */
public abstract class k extends j {

    /* renamed from: a, reason: collision with root package name */
    public z.h[] f9361a;

    /* renamed from: b, reason: collision with root package name */
    public String f9362b;

    /* renamed from: c, reason: collision with root package name */
    public int f9363c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9364d;

    public k() {
        this.f9361a = null;
        this.f9363c = 0;
    }

    public z.h[] getPathData() {
        return this.f9361a;
    }

    public String getPathName() {
        return this.f9362b;
    }

    public void setPathData(z.h[] hVarArr) {
        if (!j5.a.f(this.f9361a, hVarArr)) {
            this.f9361a = j5.a.q(hVarArr);
            return;
        }
        z.h[] hVarArr2 = this.f9361a;
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            hVarArr2[i10].f11863a = hVarArr[i10].f11863a;
            int i11 = 0;
            while (true) {
                float[] fArr = hVarArr[i10].f11864b;
                if (i11 < fArr.length) {
                    hVarArr2[i10].f11864b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f9361a = null;
        this.f9363c = 0;
        this.f9362b = kVar.f9362b;
        this.f9364d = kVar.f9364d;
        this.f9361a = j5.a.q(kVar.f9361a);
    }
}

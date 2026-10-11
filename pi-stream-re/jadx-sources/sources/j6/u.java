package j6;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f6259a;

    /* renamed from: b, reason: collision with root package name */
    public float f6260b;

    /* renamed from: c, reason: collision with root package name */
    public float f6261c;

    /* renamed from: d, reason: collision with root package name */
    public float f6262d;

    /* renamed from: e, reason: collision with root package name */
    public float f6263e;

    /* renamed from: f, reason: collision with root package name */
    public float f6264f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6265g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6266h = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f6263e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f6261c;
        float f14 = this.f6262d;
        q qVar = new q(f13, f14, f13, f14);
        qVar.f6252f = this.f6263e;
        qVar.f6253g = f12;
        this.f6266h.add(new o(qVar));
        this.f6263e = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f6265g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        r rVar = new r();
        rVar.f6254b = f10;
        rVar.f6255c = f11;
        this.f6265g.add(rVar);
        p pVar = new p(rVar, this.f6261c, this.f6262d);
        float b10 = pVar.b() + 270.0f;
        float b11 = pVar.b() + 270.0f;
        a(b10);
        this.f6266h.add(pVar);
        this.f6263e = b11;
        this.f6261c = f10;
        this.f6262d = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f6259a = 0.0f;
        this.f6260b = f10;
        this.f6261c = 0.0f;
        this.f6262d = f10;
        this.f6263e = f11;
        this.f6264f = (f11 + f12) % 360.0f;
        this.f6265g.clear();
        this.f6266h.clear();
    }
}

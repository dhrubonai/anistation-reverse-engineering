package q3;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class o implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9169a;

    /* renamed from: b, reason: collision with root package name */
    public z.h[] f9170b;

    public /* synthetic */ o(int i10) {
        this.f9169a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f9169a) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i10 = rect.left + ((int) ((rect2.left - r0) * f10));
                int i11 = rect.top + ((int) ((rect2.top - r1) * f10));
                int i12 = rect.right + ((int) ((rect2.right - r2) * f10));
                int i13 = rect.bottom + ((int) ((rect2.bottom - r10) * f10));
                Rect rect3 = (Rect) this.f9170b;
                if (rect3 == null) {
                    return new Rect(i10, i11, i12, i13);
                }
                rect3.set(i10, i11, i12, i13);
                return (Rect) this.f9170b;
            default:
                z.h[] hVarArr = (z.h[]) obj;
                z.h[] hVarArr2 = (z.h[]) obj2;
                if (j5.a.f(hVarArr, hVarArr2)) {
                    if (!j5.a.f(this.f9170b, hVarArr)) {
                        this.f9170b = j5.a.q(hVarArr);
                    }
                    for (int i14 = 0; i14 < hVarArr.length; i14++) {
                        z.h hVar = this.f9170b[i14];
                        z.h hVar2 = hVarArr[i14];
                        z.h hVar3 = hVarArr2[i14];
                        hVar.getClass();
                        hVar.f11863a = hVar2.f11863a;
                        int i15 = 0;
                        while (true) {
                            float[] fArr = hVar2.f11864b;
                            if (i15 < fArr.length) {
                                hVar.f11864b[i15] = (hVar3.f11864b[i15] * f10) + ((1.0f - f10) * fArr[i15]);
                                i15++;
                            }
                        }
                    }
                    return this.f9170b;
                }
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}

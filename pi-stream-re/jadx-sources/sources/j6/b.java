package j6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f6171a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6172b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f6171a;
            f10 += ((b) cVar).f6172b;
        }
        this.f6171a = cVar;
        this.f6172b = f10;
    }

    @Override // j6.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f6171a.a(rectF) + this.f6172b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6171a.equals(bVar.f6171a) && this.f6172b == bVar.f6172b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6171a, Float.valueOf(this.f6172b)});
    }
}

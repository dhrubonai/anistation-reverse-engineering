package j6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f6170a;

    public a(float f10) {
        this.f6170a = f10;
    }

    @Override // j6.c
    public final float a(RectF rectF) {
        return this.f6170a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f6170a == ((a) obj).f6170a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6170a)});
    }
}

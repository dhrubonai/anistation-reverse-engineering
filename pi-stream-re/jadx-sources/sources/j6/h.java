package j6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f6203a;

    public h(float f10) {
        this.f6203a = f10;
    }

    @Override // j6.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f6203a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f6203a == ((h) obj).f6203a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6203a)});
    }
}

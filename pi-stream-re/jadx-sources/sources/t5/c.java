package t5;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f10040a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10041b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f10042c;

    /* renamed from: d, reason: collision with root package name */
    public int f10043d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f10044e = 1;

    public c(long j4, long j10, TimeInterpolator timeInterpolator) {
        this.f10040a = 0L;
        this.f10041b = 300L;
        this.f10042c = null;
        this.f10040a = j4;
        this.f10041b = j10;
        this.f10042c = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f10042c;
        if (timeInterpolator == null) {
            return a.f10035b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10040a != cVar.f10040a || this.f10041b != cVar.f10041b || this.f10043d != cVar.f10043d || this.f10044e != cVar.f10044e) {
            return false;
        }
        return a().getClass().equals(cVar.a().getClass());
    }

    public final int hashCode() {
        long j4 = this.f10040a;
        long j10 = this.f10041b;
        return ((((a().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f10043d) * 31) + this.f10044e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f10040a + " duration: " + this.f10041b + " interpolator: " + a().getClass() + " repeatCount: " + this.f10043d + " repeatMode: " + this.f10044e + "}\n";
    }
}

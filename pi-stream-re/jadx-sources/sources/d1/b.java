package d1;

import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f3040e = new b(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3042b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3043c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3044d;

    public b(int i10, int i11, int i12) {
        int i13;
        this.f3041a = i10;
        this.f3042b = i11;
        this.f3043c = i12;
        if (b0.K(i12)) {
            i13 = b0.z(i12, i11);
        } else {
            i13 = -1;
        }
        this.f3044d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3041a == bVar.f3041a && this.f3042b == bVar.f3042b && this.f3043c == bVar.f3043c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3041a), Integer.valueOf(this.f3042b), Integer.valueOf(this.f3043c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3041a + ", channelCount=" + this.f3042b + ", encoding=" + this.f3043c + ']';
    }
}

package d2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3137b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3138c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3139d;

    public f0(int i10, byte[] bArr, int i11, int i12) {
        this.f3136a = i10;
        this.f3137b = bArr;
        this.f3138c = i11;
        this.f3139d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f3136a == f0Var.f3136a && this.f3138c == f0Var.f3138c && this.f3139d == f0Var.f3139d && Arrays.equals(this.f3137b, f0Var.f3137b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3137b) + (this.f3136a * 31)) * 31) + this.f3138c) * 31) + this.f3139d;
    }
}

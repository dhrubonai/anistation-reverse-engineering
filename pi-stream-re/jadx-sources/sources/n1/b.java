package n1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7906c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7907d;

    public b(String str, int i10, int i11, String str2) {
        this.f7904a = str;
        this.f7905b = str2;
        this.f7906c = i10;
        this.f7907d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7906c == bVar.f7906c && this.f7907d == bVar.f7907d && q6.g.x(this.f7904a, bVar.f7904a) && q6.g.x(this.f7905b, bVar.f7905b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7904a, this.f7905b, Integer.valueOf(this.f7906c), Integer.valueOf(this.f7907d)});
    }
}

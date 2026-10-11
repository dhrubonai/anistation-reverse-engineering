package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ss {
    public long a;
    public long b;

    public ss() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public boolean a(int i) {
        long j;
        if ((i >>> 7) != 0) {
            return false;
        }
        if (i < 64) {
            j = this.a;
        } else {
            j = this.b;
        }
        if (((j >>> i) & 1) != 1) {
            return false;
        }
        return true;
    }

    public ss b(ss ssVar) {
        return new ss(this.a | ssVar.a, ssVar.b | this.b);
    }

    public /* synthetic */ ss(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public ss(long j, int i, long j2) {
        this.a = j;
        this.b = j2;
    }
}

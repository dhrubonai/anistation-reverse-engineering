package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m97 {
    public int a;
    public long b;
    public int c;
    public Object d;

    public m97(ff7 ff7Var) {
        ff7Var.getClass();
    }

    public static /* synthetic */ String b(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public long a() {
        int i;
        long j = this.b;
        if (j != -1 && j != 0) {
            d24 d24Var = (d24) this.d;
            long j2 = j * d24Var.g;
            if (this.a != -1 && (i = this.c) != -1) {
                j2 -= r5 + i;
            }
            if (j2 > 0) {
                return eq6.c0(d24Var.d, j2 - 1);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}

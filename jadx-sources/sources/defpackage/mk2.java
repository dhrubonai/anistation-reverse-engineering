package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mk2 {
    public ArrayList a;

    public final int a(int i) {
        return ((int[]) this.a.get(i / 768))[i % 768];
    }

    public final os b() {
        return new os(new lk2(this, null), (byte) 3);
    }

    public final void c(int i, int i2) {
        ((int[]) this.a.get(i / 768))[i % 768] = i2;
    }
}

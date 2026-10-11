package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface y16 {
    void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var);

    default k16 h(byte[] bArr, int i, int i2) {
        jw2 k = nw2.k();
        E(bArr, 0, i2, x16.c, new xv3(k, (byte) 12));
        return new f31(k.g());
    }

    default void reset() {
    }
}

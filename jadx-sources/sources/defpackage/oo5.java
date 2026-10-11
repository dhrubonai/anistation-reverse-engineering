package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class oo5 {
    public static final oo5 A;
    public static final /* synthetic */ oo5[] B;
    public static final /* synthetic */ tv1 C;
    public static final z95 y;
    public static final oo5 z;
    public final byte x;

    static {
        oo5 oo5Var = new oo5("ANON", 0, (byte) 0);
        oo5 oo5Var2 = new oo5("RSA", 1, (byte) 1);
        z = oo5Var2;
        oo5 oo5Var3 = new oo5("DSA", 2, (byte) 2);
        oo5 oo5Var4 = new oo5("ECDSA", 3, (byte) 3);
        A = oo5Var4;
        oo5[] oo5VarArr = {oo5Var, oo5Var2, oo5Var3, oo5Var4, new oo5("ED25519", 4, (byte) 7), new oo5("ED448", 5, (byte) 8)};
        B = oo5VarArr;
        C = new tv1(oo5VarArr);
        y = new z95((byte) 1);
    }

    public oo5(String str, int i, byte b) {
        this.x = b;
    }

    public static oo5 valueOf(String str) {
        return (oo5) Enum.valueOf(oo5.class, str);
    }

    public static oo5[] values() {
        return (oo5[]) B.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z56 {
    public static final z56 A;
    public static final /* synthetic */ z56[] B;
    public static final qc5 y;
    public static final tv1 z;
    public final short x;

    static {
        z56 z56Var = new z56("SSL3", 0, 768);
        z56 z56Var2 = new z56("TLS10", 1, 769);
        z56 z56Var3 = new z56("TLS11", 2, 770);
        z56 z56Var4 = new z56("TLS12", 3, 771);
        A = z56Var4;
        z56[] z56VarArr = {z56Var, z56Var2, z56Var3, z56Var4};
        B = z56VarArr;
        tv1 tv1Var = new tv1(z56VarArr);
        y = new qc5((byte) 5);
        z = tv1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z56(String str, int i, int i2) {
        this.x = i2;
    }

    public static z56 valueOf(String str) {
        return (z56) Enum.valueOf(z56.class, str);
    }

    public static z56[] values() {
        return (z56[]) B.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o56 {
    public static final o56 A;
    public static final o56 B;
    public static final o56 C;
    public static final o56 D;
    public static final o56 E;
    public static final o56 F;
    public static final /* synthetic */ o56[] G;
    public static final /* synthetic */ tv1 H;
    public static final xb5 y;
    public static final o56[] z;
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        o56 o56Var = new o56("HelloRequest", 0, 0);
        A = o56Var;
        o56 o56Var2 = new o56("ClientHello", 1, 1);
        B = o56Var2;
        o56 o56Var3 = new o56("ServerHello", 2, 2);
        C = o56Var3;
        o56 o56Var4 = new o56("Certificate", 3, 11);
        D = o56Var4;
        o56 o56Var5 = new o56("ServerKeyExchange", 4, 12);
        o56 o56Var6 = new o56("CertificateRequest", 5, 13);
        o56 o56Var7 = new o56("ServerDone", 6, 14);
        o56 o56Var8 = new o56("CertificateVerify", 7, 15);
        o56 o56Var9 = new o56("ClientKeyExchange", 8, 16);
        E = o56Var9;
        o56 o56Var10 = new o56("Finished", 9, 20);
        F = o56Var10;
        o56[] o56VarArr = {o56Var, o56Var2, o56Var3, o56Var4, o56Var5, o56Var6, o56Var7, o56Var8, o56Var9, o56Var10};
        G = o56VarArr;
        H = new tv1(o56VarArr);
        y = new xb5((byte) 5);
        o56[] o56VarArr2 = new o56[256];
        for (int i = 0; i < 256; i++) {
            tv1 tv1Var = H;
            tv1Var.getClass();
            o1 o1Var = new o1(tv1Var, (byte) 0);
            while (true) {
                if (o1Var.hasNext()) {
                    obj = o1Var.next();
                    if (((o56) obj).x == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            o56VarArr2[i] = obj;
        }
        z = o56VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o56(String str, int i, int i2) {
        this.x = i2;
    }

    public static o56 valueOf(String str) {
        return (o56) Enum.valueOf(o56.class, str);
    }

    public static o56[] values() {
        return (o56[]) G.clone();
    }
}

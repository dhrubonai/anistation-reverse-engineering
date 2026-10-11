package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class r56 {
    public static final r56 A;
    public static final r56 B;
    public static final r56 C;
    public static final r56 D;
    public static final /* synthetic */ r56[] E;
    public static final /* synthetic */ tv1 F;
    public static final q56 y;
    public static final r56[] z;
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [q56, java.lang.Object] */
    static {
        Object obj;
        byte b = 0;
        r56 r56Var = new r56("ChangeCipherSpec", 0, 20);
        A = r56Var;
        r56 r56Var2 = new r56("Alert", 1, 21);
        B = r56Var2;
        r56 r56Var3 = new r56("Handshake", 2, 22);
        C = r56Var3;
        r56 r56Var4 = new r56("ApplicationData", 3, 23);
        D = r56Var4;
        r56[] r56VarArr = {r56Var, r56Var2, r56Var3, r56Var4};
        E = r56VarArr;
        F = new tv1(r56VarArr);
        y = new Object();
        r56[] r56VarArr2 = new r56[256];
        for (int i = 0; i < 256; i++) {
            tv1 tv1Var = F;
            tv1Var.getClass();
            o1 o1Var = new o1(tv1Var, b);
            while (true) {
                if (o1Var.hasNext()) {
                    obj = o1Var.next();
                    if (((r56) obj).x == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r56VarArr2[i] = obj;
        }
        z = r56VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r56(String str, int i, int i2) {
        this.x = i2;
    }

    public static r56 valueOf(String str) {
        return (r56) Enum.valueOf(r56.class, str);
    }

    public static r56[] values() {
        return (r56[]) E.clone();
    }
}

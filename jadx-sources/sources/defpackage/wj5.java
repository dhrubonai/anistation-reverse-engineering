package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wj5 {
    public static final /* synthetic */ wj5[] A;
    public static final /* synthetic */ tv1 B;
    public static final y95 y;
    public static final wj5[] z;
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        wj5[] wj5VarArr = {new wj5("ExplicitPrime", 0, 1), new wj5("ExplicitChar", 1, 2), new wj5("NamedCurve", 2, 3)};
        A = wj5VarArr;
        B = new tv1(wj5VarArr);
        y = new y95((byte) 1);
        wj5[] wj5VarArr2 = new wj5[256];
        for (int i = 0; i < 256; i++) {
            tv1 tv1Var = B;
            tv1Var.getClass();
            o1 o1Var = new o1(tv1Var, (byte) 0);
            while (true) {
                if (o1Var.hasNext()) {
                    obj = o1Var.next();
                    if (((wj5) obj).x == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wj5VarArr2[i] = obj;
        }
        z = wj5VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wj5(String str, int i, int i2) {
        this.x = i2;
    }

    public static wj5 valueOf(String str) {
        return (wj5) Enum.valueOf(wj5.class, str);
    }

    public static wj5[] values() {
        return (wj5[]) A.clone();
    }
}

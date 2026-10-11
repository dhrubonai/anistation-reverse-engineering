package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class t46 {
    public static final /* synthetic */ t46[] A;
    public static final /* synthetic */ tv1 B;
    public static final og5 y;
    public static final t46[] z;
    public final byte x;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object obj;
        t46[] t46VarArr = {new t46("WARNING", 0, 1), new t46("FATAL", 1, 2)};
        A = t46VarArr;
        B = new tv1(t46VarArr);
        y = new og5((byte) 4);
        t46[] t46VarArr2 = new t46[256];
        for (int i = 0; i < 256; i++) {
            tv1 tv1Var = B;
            tv1Var.getClass();
            o1 o1Var = new o1(tv1Var, (byte) 0);
            while (true) {
                if (o1Var.hasNext()) {
                    obj = o1Var.next();
                    if (((t46) obj).x == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            t46VarArr2[i] = obj;
        }
        z = t46VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t46(String str, int i, int i2) {
        this.x = i2;
    }

    public static t46 valueOf(String str) {
        return (t46) Enum.valueOf(t46.class, str);
    }

    public static t46[] values() {
        return (t46[]) A.clone();
    }
}

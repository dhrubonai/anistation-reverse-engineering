package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class pg5 {
    public static final int[] A;
    public static final pg5 B;
    public static final pg5 C;
    public static final pg5 D;
    public static final /* synthetic */ pg5[] E;
    public static final /* synthetic */ tv1 F;
    public static final og5 y;
    public static final pg5[] z;
    public final byte x;

    static {
        pg5 pg5Var = new pg5("READ", 0, 1);
        B = pg5Var;
        pg5 pg5Var2 = new pg5("WRITE", 1, 4);
        C = pg5Var2;
        pg5 pg5Var3 = new pg5("ACCEPT", 2, 16);
        pg5 pg5Var4 = new pg5("CONNECT", 3, 8);
        D = pg5Var4;
        pg5[] pg5VarArr = {pg5Var, pg5Var2, pg5Var3, pg5Var4};
        E = pg5VarArr;
        tv1 tv1Var = new tv1(pg5VarArr);
        F = tv1Var;
        y = new og5((byte) 0);
        z = (pg5[]) v94.N(tv1Var, new pg5[0]);
        ArrayList arrayList = new ArrayList(zo0.V(tv1Var, 10));
        o1 o1Var = new o1(tv1Var, (byte) 0);
        while (o1Var.hasNext()) {
            arrayList.add(Integer.valueOf(((pg5) o1Var.next()).x));
        }
        A = yo0.H0(arrayList);
        F.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pg5(String str, int i, int i2) {
        this.x = i2;
    }

    public static pg5 valueOf(String str) {
        return (pg5) Enum.valueOf(pg5.class, str);
    }

    public static pg5[] values() {
        return (pg5[]) E.clone();
    }
}

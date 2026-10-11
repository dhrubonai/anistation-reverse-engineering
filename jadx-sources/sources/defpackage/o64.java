package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o64 {
    public static final o64 A;
    public static final o64 B;
    public static final /* synthetic */ o64[] C;
    public static final /* synthetic */ tv1 D;
    public static final q18 z;
    public final byte x;
    public final short y;

    static {
        o64 o64Var = new o64("sect163k1", 0, (short) 1, 163);
        o64 o64Var2 = new o64("sect163r1", 1, (short) 2, 163);
        o64 o64Var3 = new o64("sect163r2", 2, (short) 3, 163);
        o64 o64Var4 = new o64("sect193r1", 3, (short) 4, 193);
        o64 o64Var5 = new o64("sect193r2", 4, (short) 5, 193);
        o64 o64Var6 = new o64("sect233k1", 5, (short) 6, 233);
        o64 o64Var7 = new o64("sect233r1", 6, (short) 7, 233);
        o64 o64Var8 = new o64("sect239k1", 7, (short) 8, 239);
        o64 o64Var9 = new o64("sect283k1", 8, (short) 9, 283);
        o64 o64Var10 = new o64("sect283r1", 9, (short) 10, 283);
        o64 o64Var11 = new o64("sect409k1", 10, (short) 11, 409);
        o64 o64Var12 = new o64("sect409r1", 11, (short) 12, 409);
        o64 o64Var13 = new o64("sect571k1", 12, (short) 13, 571);
        o64 o64Var14 = new o64("sect571r1", 13, (short) 14, 571);
        o64 o64Var15 = new o64("secp160k1", 14, (short) 15, 160);
        o64 o64Var16 = new o64("secp160r1", 15, (short) 16, 160);
        o64 o64Var17 = new o64("secp160r2", 16, (short) 17, 160);
        o64 o64Var18 = new o64("secp192k1", 17, (short) 18, 192);
        o64 o64Var19 = new o64("secp192r1", 18, (short) 19, 192);
        o64 o64Var20 = new o64("secp224k1", 19, (short) 20, 224);
        o64 o64Var21 = new o64("secp224r1", 20, (short) 21, 224);
        o64 o64Var22 = new o64("secp256k1", 21, (short) 22, 256);
        o64 o64Var23 = new o64("secp256r1", 22, (short) 23, 256);
        A = o64Var23;
        o64 o64Var24 = new o64("secp384r1", 23, (short) 24, 384);
        B = o64Var24;
        o64[] o64VarArr = {o64Var, o64Var2, o64Var3, o64Var4, o64Var5, o64Var6, o64Var7, o64Var8, o64Var9, o64Var10, o64Var11, o64Var12, o64Var13, o64Var14, o64Var15, o64Var16, o64Var17, o64Var18, o64Var19, o64Var20, o64Var21, o64Var22, o64Var23, o64Var24, new o64("secp521r1", 24, (short) 25, 521)};
        C = o64VarArr;
        D = new tv1(o64VarArr);
        z = new q18((byte) 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o64(String str, int i, short s, int i2) {
        this.x = s;
        this.y = i2;
    }

    public static o64 valueOf(String str) {
        return (o64) Enum.valueOf(o64.class, str);
    }

    public static o64[] values() {
        return (o64[]) C.clone();
    }
}

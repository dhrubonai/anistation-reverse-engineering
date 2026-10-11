package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lh7 {
    public static final lh7 A;
    public static final lh7 B;
    public static final /* synthetic */ lh7[] C;
    public static final lh7 z;
    public final mh7 x;
    public final byte y;

    /* JADX INFO: Fake field, exist only in values array */
    lh7 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    lh7 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    lh7 EF0;

    static {
        lh7 lh7Var = new lh7("DOUBLE", 0, mh7.A, 1);
        lh7 lh7Var2 = new lh7("FLOAT", 1, mh7.z, 5);
        mh7 mh7Var = mh7.y;
        lh7 lh7Var3 = new lh7("INT64", 2, mh7Var, 0);
        lh7 lh7Var4 = new lh7("UINT64", 3, mh7Var, 0);
        mh7 mh7Var2 = mh7.x;
        lh7 lh7Var5 = new lh7("INT32", 4, mh7Var2, 0);
        lh7 lh7Var6 = new lh7("FIXED64", 5, mh7Var, 1);
        lh7 lh7Var7 = new lh7("FIXED32", 6, mh7Var2, 5);
        lh7 lh7Var8 = new lh7("BOOL", 7, mh7.B, 0);
        lh7 lh7Var9 = new lh7("STRING", 8, mh7.C, 2);
        z = lh7Var9;
        mh7 mh7Var3 = mh7.F;
        lh7 lh7Var10 = new lh7("GROUP", 9, mh7Var3, 3);
        A = lh7Var10;
        lh7 lh7Var11 = new lh7("MESSAGE", 10, mh7Var3, 2);
        B = lh7Var11;
        C = new lh7[]{lh7Var, lh7Var2, lh7Var3, lh7Var4, lh7Var5, lh7Var6, lh7Var7, lh7Var8, lh7Var9, lh7Var10, lh7Var11, new lh7("BYTES", 11, mh7.D, 2), new lh7("UINT32", 12, mh7Var2, 0), new lh7("ENUM", 13, mh7.E, 0), new lh7("SFIXED32", 14, mh7Var2, 5), new lh7("SFIXED64", 15, mh7Var, 1), new lh7("SINT32", 16, mh7Var2, 0), new lh7("SINT64", 17, mh7Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lh7(String str, int i, mh7 mh7Var, int i2) {
        this.x = mh7Var;
        this.y = i2;
    }

    public static lh7[] values() {
        return (lh7[]) C.clone();
    }
}

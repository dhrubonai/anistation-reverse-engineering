package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class v67 {
    public static final s67 A;
    public static final t67 B;
    public static final /* synthetic */ v67[] C;
    public static final r67 z;
    public final w67 x;
    public final byte y;

    /* JADX INFO: Fake field, exist only in values array */
    v67 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    v67 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    v67 EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [t67, v67] */
    /* JADX WARN: Type inference failed for: r4v2, types: [r67, v67] */
    /* JADX WARN: Type inference failed for: r6v3, types: [s67, v67] */
    static {
        v67 v67Var = new v67("DOUBLE", 0, w67.A, 1);
        v67 v67Var2 = new v67("FLOAT", 1, w67.z, 5);
        w67 w67Var = w67.y;
        v67 v67Var3 = new v67("INT64", 2, w67Var, 0);
        v67 v67Var4 = new v67("UINT64", 3, w67Var, 0);
        w67 w67Var2 = w67.x;
        v67 v67Var5 = new v67("INT32", 4, w67Var2, 0);
        v67 v67Var6 = new v67("FIXED64", 5, w67Var, 1);
        v67 v67Var7 = new v67("FIXED32", 6, w67Var2, 5);
        v67 v67Var8 = new v67("BOOL", 7, w67.B, 0);
        ?? v67Var9 = new v67("STRING", 8, w67.C, 2);
        z = v67Var9;
        w67 w67Var3 = w67.F;
        ?? v67Var10 = new v67("GROUP", 9, w67Var3, 3);
        A = v67Var10;
        ?? v67Var11 = new v67("MESSAGE", 10, w67Var3, 2);
        B = v67Var11;
        C = new v67[]{v67Var, v67Var2, v67Var3, v67Var4, v67Var5, v67Var6, v67Var7, v67Var8, v67Var9, v67Var10, v67Var11, new v67("BYTES", 11, w67.D, 2), new v67("UINT32", 12, w67Var2, 0), new v67("ENUM", 13, w67.E, 0), new v67("SFIXED32", 14, w67Var2, 5), new v67("SFIXED64", 15, w67Var, 1), new v67("SINT32", 16, w67Var2, 0), new v67("SINT64", 17, w67Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v67(String str, int i, w67 w67Var, int i2) {
        this.x = w67Var;
        this.y = i2;
    }

    public static v67 valueOf(String str) {
        return (v67) Enum.valueOf(v67.class, str);
    }

    public static v67[] values() {
        return (v67[]) C.clone();
    }
}

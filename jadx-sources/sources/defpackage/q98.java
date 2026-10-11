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
public final class q98 {
    public static final q98[] A;
    public static final /* synthetic */ q98[] B;
    public static final q98 y;
    public static final q98 z;
    public final byte x;

    /* JADX INFO: Fake field, exist only in values array */
    q98 EF0;

    static {
        oa8 oa8Var = oa8.DOUBLE;
        q98 q98Var = new q98("DOUBLE", 0, 0, 1, oa8Var);
        oa8 oa8Var2 = oa8.FLOAT;
        q98 q98Var2 = new q98("FLOAT", 1, 1, 1, oa8Var2);
        oa8 oa8Var3 = oa8.LONG;
        q98 q98Var3 = new q98("INT64", 2, 2, 1, oa8Var3);
        q98 q98Var4 = new q98("UINT64", 3, 3, 1, oa8Var3);
        oa8 oa8Var4 = oa8.INT;
        q98 q98Var5 = new q98("INT32", 4, 4, 1, oa8Var4);
        q98 q98Var6 = new q98("FIXED64", 5, 5, 1, oa8Var3);
        q98 q98Var7 = new q98("FIXED32", 6, 6, 1, oa8Var4);
        oa8 oa8Var5 = oa8.BOOLEAN;
        q98 q98Var8 = new q98("BOOL", 7, 7, 1, oa8Var5);
        oa8 oa8Var6 = oa8.STRING;
        q98 q98Var9 = new q98("STRING", 8, 8, 1, oa8Var6);
        oa8 oa8Var7 = oa8.MESSAGE;
        q98 q98Var10 = new q98("MESSAGE", 9, 9, 1, oa8Var7);
        oa8 oa8Var8 = oa8.BYTE_STRING;
        q98 q98Var11 = new q98("BYTES", 10, 10, 1, oa8Var8);
        q98 q98Var12 = new q98("UINT32", 11, 11, 1, oa8Var4);
        oa8 oa8Var9 = oa8.ENUM;
        q98 q98Var13 = new q98("ENUM", 12, 12, 1, oa8Var9);
        q98 q98Var14 = new q98("SFIXED32", 13, 13, 1, oa8Var4);
        q98 q98Var15 = new q98("SFIXED64", 14, 14, 1, oa8Var3);
        q98 q98Var16 = new q98("SINT32", 15, 15, 1, oa8Var4);
        q98 q98Var17 = new q98("SINT64", 16, 16, 1, oa8Var3);
        q98 q98Var18 = new q98("GROUP", 17, 17, 1, oa8Var7);
        q98 q98Var19 = new q98("DOUBLE_LIST", 18, 18, 2, oa8Var);
        q98 q98Var20 = new q98("FLOAT_LIST", 19, 19, 2, oa8Var2);
        q98 q98Var21 = new q98("INT64_LIST", 20, 20, 2, oa8Var3);
        q98 q98Var22 = new q98("UINT64_LIST", 21, 21, 2, oa8Var3);
        q98 q98Var23 = new q98("INT32_LIST", 22, 22, 2, oa8Var4);
        q98 q98Var24 = new q98("FIXED64_LIST", 23, 23, 2, oa8Var3);
        q98 q98Var25 = new q98("FIXED32_LIST", 24, 24, 2, oa8Var4);
        q98 q98Var26 = new q98("BOOL_LIST", 25, 25, 2, oa8Var5);
        q98 q98Var27 = new q98("STRING_LIST", 26, 26, 2, oa8Var6);
        q98 q98Var28 = new q98("MESSAGE_LIST", 27, 27, 2, oa8Var7);
        q98 q98Var29 = new q98("BYTES_LIST", 28, 28, 2, oa8Var8);
        q98 q98Var30 = new q98("UINT32_LIST", 29, 29, 2, oa8Var4);
        q98 q98Var31 = new q98("ENUM_LIST", 30, 30, 2, oa8Var9);
        q98 q98Var32 = new q98("SFIXED32_LIST", 31, 31, 2, oa8Var4);
        q98 q98Var33 = new q98("SFIXED64_LIST", 32, 32, 2, oa8Var3);
        q98 q98Var34 = new q98("SINT32_LIST", 33, 33, 2, oa8Var4);
        q98 q98Var35 = new q98("SINT64_LIST", 34, 34, 2, oa8Var3);
        q98 q98Var36 = new q98("DOUBLE_LIST_PACKED", 35, 35, 3, oa8Var);
        y = q98Var36;
        q98 q98Var37 = new q98("FLOAT_LIST_PACKED", 36, 36, 3, oa8Var2);
        q98 q98Var38 = new q98("INT64_LIST_PACKED", 37, 37, 3, oa8Var3);
        q98 q98Var39 = new q98("UINT64_LIST_PACKED", 38, 38, 3, oa8Var3);
        q98 q98Var40 = new q98("INT32_LIST_PACKED", 39, 39, 3, oa8Var4);
        q98 q98Var41 = new q98("FIXED64_LIST_PACKED", 40, 40, 3, oa8Var3);
        q98 q98Var42 = new q98("FIXED32_LIST_PACKED", 41, 41, 3, oa8Var4);
        q98 q98Var43 = new q98("BOOL_LIST_PACKED", 42, 42, 3, oa8Var5);
        q98 q98Var44 = new q98("UINT32_LIST_PACKED", 43, 43, 3, oa8Var4);
        q98 q98Var45 = new q98("ENUM_LIST_PACKED", 44, 44, 3, oa8Var9);
        q98 q98Var46 = new q98("SFIXED32_LIST_PACKED", 45, 45, 3, oa8Var4);
        q98 q98Var47 = new q98("SFIXED64_LIST_PACKED", 46, 46, 3, oa8Var3);
        q98 q98Var48 = new q98("SINT32_LIST_PACKED", 47, 47, 3, oa8Var4);
        q98 q98Var49 = new q98("SINT64_LIST_PACKED", 48, 48, 3, oa8Var3);
        z = q98Var49;
        B = new q98[]{q98Var, q98Var2, q98Var3, q98Var4, q98Var5, q98Var6, q98Var7, q98Var8, q98Var9, q98Var10, q98Var11, q98Var12, q98Var13, q98Var14, q98Var15, q98Var16, q98Var17, q98Var18, q98Var19, q98Var20, q98Var21, q98Var22, q98Var23, q98Var24, q98Var25, q98Var26, q98Var27, q98Var28, q98Var29, q98Var30, q98Var31, q98Var32, q98Var33, q98Var34, q98Var35, q98Var36, q98Var37, q98Var38, q98Var39, q98Var40, q98Var41, q98Var42, q98Var43, q98Var44, q98Var45, q98Var46, q98Var47, q98Var48, q98Var49, new q98("GROUP_LIST", 49, 49, 2, oa8Var7), new q98("MAP", 50, 50, 4, oa8.VOID)};
        q98[] values = values();
        A = new q98[values.length];
        for (q98 q98Var50 : values) {
            A[q98Var50.x] = q98Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q98(String str, int i, int i2, int i3, oa8 oa8Var) {
        this.x = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = oa8Var.x;
            }
        } else {
            Class cls2 = oa8Var.x;
        }
        if (i3 == 1) {
            oa8 oa8Var2 = oa8.VOID;
            oa8Var.ordinal();
        }
    }

    public static q98[] values() {
        return (q98[]) B.clone();
    }
}

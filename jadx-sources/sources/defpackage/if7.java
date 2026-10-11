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
public final class if7 {
    public static final if7[] A;
    public static final /* synthetic */ if7[] B;
    public static final if7 y;
    public static final if7 z;
    public final byte x;

    /* JADX INFO: Fake field, exist only in values array */
    if7 EF0;

    static {
        bg7 bg7Var = bg7.DOUBLE;
        if7 if7Var = new if7("DOUBLE", 0, 0, 1, bg7Var);
        bg7 bg7Var2 = bg7.FLOAT;
        if7 if7Var2 = new if7("FLOAT", 1, 1, 1, bg7Var2);
        bg7 bg7Var3 = bg7.LONG;
        if7 if7Var3 = new if7("INT64", 2, 2, 1, bg7Var3);
        if7 if7Var4 = new if7("UINT64", 3, 3, 1, bg7Var3);
        bg7 bg7Var4 = bg7.INT;
        if7 if7Var5 = new if7("INT32", 4, 4, 1, bg7Var4);
        if7 if7Var6 = new if7("FIXED64", 5, 5, 1, bg7Var3);
        if7 if7Var7 = new if7("FIXED32", 6, 6, 1, bg7Var4);
        bg7 bg7Var5 = bg7.BOOLEAN;
        if7 if7Var8 = new if7("BOOL", 7, 7, 1, bg7Var5);
        bg7 bg7Var6 = bg7.STRING;
        if7 if7Var9 = new if7("STRING", 8, 8, 1, bg7Var6);
        bg7 bg7Var7 = bg7.MESSAGE;
        if7 if7Var10 = new if7("MESSAGE", 9, 9, 1, bg7Var7);
        bg7 bg7Var8 = bg7.BYTE_STRING;
        if7 if7Var11 = new if7("BYTES", 10, 10, 1, bg7Var8);
        if7 if7Var12 = new if7("UINT32", 11, 11, 1, bg7Var4);
        bg7 bg7Var9 = bg7.ENUM;
        if7 if7Var13 = new if7("ENUM", 12, 12, 1, bg7Var9);
        if7 if7Var14 = new if7("SFIXED32", 13, 13, 1, bg7Var4);
        if7 if7Var15 = new if7("SFIXED64", 14, 14, 1, bg7Var3);
        if7 if7Var16 = new if7("SINT32", 15, 15, 1, bg7Var4);
        if7 if7Var17 = new if7("SINT64", 16, 16, 1, bg7Var3);
        if7 if7Var18 = new if7("GROUP", 17, 17, 1, bg7Var7);
        if7 if7Var19 = new if7("DOUBLE_LIST", 18, 18, 2, bg7Var);
        if7 if7Var20 = new if7("FLOAT_LIST", 19, 19, 2, bg7Var2);
        if7 if7Var21 = new if7("INT64_LIST", 20, 20, 2, bg7Var3);
        if7 if7Var22 = new if7("UINT64_LIST", 21, 21, 2, bg7Var3);
        if7 if7Var23 = new if7("INT32_LIST", 22, 22, 2, bg7Var4);
        if7 if7Var24 = new if7("FIXED64_LIST", 23, 23, 2, bg7Var3);
        if7 if7Var25 = new if7("FIXED32_LIST", 24, 24, 2, bg7Var4);
        if7 if7Var26 = new if7("BOOL_LIST", 25, 25, 2, bg7Var5);
        if7 if7Var27 = new if7("STRING_LIST", 26, 26, 2, bg7Var6);
        if7 if7Var28 = new if7("MESSAGE_LIST", 27, 27, 2, bg7Var7);
        if7 if7Var29 = new if7("BYTES_LIST", 28, 28, 2, bg7Var8);
        if7 if7Var30 = new if7("UINT32_LIST", 29, 29, 2, bg7Var4);
        if7 if7Var31 = new if7("ENUM_LIST", 30, 30, 2, bg7Var9);
        if7 if7Var32 = new if7("SFIXED32_LIST", 31, 31, 2, bg7Var4);
        if7 if7Var33 = new if7("SFIXED64_LIST", 32, 32, 2, bg7Var3);
        if7 if7Var34 = new if7("SINT32_LIST", 33, 33, 2, bg7Var4);
        if7 if7Var35 = new if7("SINT64_LIST", 34, 34, 2, bg7Var3);
        if7 if7Var36 = new if7("DOUBLE_LIST_PACKED", 35, 35, 3, bg7Var);
        y = if7Var36;
        if7 if7Var37 = new if7("FLOAT_LIST_PACKED", 36, 36, 3, bg7Var2);
        if7 if7Var38 = new if7("INT64_LIST_PACKED", 37, 37, 3, bg7Var3);
        if7 if7Var39 = new if7("UINT64_LIST_PACKED", 38, 38, 3, bg7Var3);
        if7 if7Var40 = new if7("INT32_LIST_PACKED", 39, 39, 3, bg7Var4);
        if7 if7Var41 = new if7("FIXED64_LIST_PACKED", 40, 40, 3, bg7Var3);
        if7 if7Var42 = new if7("FIXED32_LIST_PACKED", 41, 41, 3, bg7Var4);
        if7 if7Var43 = new if7("BOOL_LIST_PACKED", 42, 42, 3, bg7Var5);
        if7 if7Var44 = new if7("UINT32_LIST_PACKED", 43, 43, 3, bg7Var4);
        if7 if7Var45 = new if7("ENUM_LIST_PACKED", 44, 44, 3, bg7Var9);
        if7 if7Var46 = new if7("SFIXED32_LIST_PACKED", 45, 45, 3, bg7Var4);
        if7 if7Var47 = new if7("SFIXED64_LIST_PACKED", 46, 46, 3, bg7Var3);
        if7 if7Var48 = new if7("SINT32_LIST_PACKED", 47, 47, 3, bg7Var4);
        if7 if7Var49 = new if7("SINT64_LIST_PACKED", 48, 48, 3, bg7Var3);
        z = if7Var49;
        B = new if7[]{if7Var, if7Var2, if7Var3, if7Var4, if7Var5, if7Var6, if7Var7, if7Var8, if7Var9, if7Var10, if7Var11, if7Var12, if7Var13, if7Var14, if7Var15, if7Var16, if7Var17, if7Var18, if7Var19, if7Var20, if7Var21, if7Var22, if7Var23, if7Var24, if7Var25, if7Var26, if7Var27, if7Var28, if7Var29, if7Var30, if7Var31, if7Var32, if7Var33, if7Var34, if7Var35, if7Var36, if7Var37, if7Var38, if7Var39, if7Var40, if7Var41, if7Var42, if7Var43, if7Var44, if7Var45, if7Var46, if7Var47, if7Var48, if7Var49, new if7("GROUP_LIST", 49, 49, 2, bg7Var7), new if7("MAP", 50, 50, 4, bg7.VOID)};
        if7[] values = values();
        A = new if7[values.length];
        for (if7 if7Var50 : values) {
            A[if7Var50.x] = if7Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public if7(String str, int i, int i2, int i3, bg7 bg7Var) {
        this.x = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = bg7Var.x;
            }
        } else {
            Class cls2 = bg7Var.x;
        }
        if (i3 == 1) {
            bg7 bg7Var2 = bg7.VOID;
            bg7Var.ordinal();
        }
    }

    public static if7[] values() {
        return (if7[]) B.clone();
    }
}

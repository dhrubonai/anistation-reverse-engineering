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
public final class z12 {
    public static final z12[] A;
    public static final /* synthetic */ z12[] B;
    public static final z12 y;
    public static final z12 z;
    public final byte x;

    /* JADX INFO: Fake field, exist only in values array */
    z12 EF0;

    static {
        d43 d43Var = d43.DOUBLE;
        z12 z12Var = new z12("DOUBLE", 0, 0, 1, d43Var);
        d43 d43Var2 = d43.FLOAT;
        z12 z12Var2 = new z12("FLOAT", 1, 1, 1, d43Var2);
        d43 d43Var3 = d43.LONG;
        z12 z12Var3 = new z12("INT64", 2, 2, 1, d43Var3);
        z12 z12Var4 = new z12("UINT64", 3, 3, 1, d43Var3);
        d43 d43Var4 = d43.INT;
        z12 z12Var5 = new z12("INT32", 4, 4, 1, d43Var4);
        z12 z12Var6 = new z12("FIXED64", 5, 5, 1, d43Var3);
        z12 z12Var7 = new z12("FIXED32", 6, 6, 1, d43Var4);
        d43 d43Var5 = d43.BOOLEAN;
        z12 z12Var8 = new z12("BOOL", 7, 7, 1, d43Var5);
        d43 d43Var6 = d43.STRING;
        z12 z12Var9 = new z12("STRING", 8, 8, 1, d43Var6);
        d43 d43Var7 = d43.MESSAGE;
        z12 z12Var10 = new z12("MESSAGE", 9, 9, 1, d43Var7);
        d43 d43Var8 = d43.BYTE_STRING;
        z12 z12Var11 = new z12("BYTES", 10, 10, 1, d43Var8);
        z12 z12Var12 = new z12("UINT32", 11, 11, 1, d43Var4);
        d43 d43Var9 = d43.ENUM;
        z12 z12Var13 = new z12("ENUM", 12, 12, 1, d43Var9);
        z12 z12Var14 = new z12("SFIXED32", 13, 13, 1, d43Var4);
        z12 z12Var15 = new z12("SFIXED64", 14, 14, 1, d43Var3);
        z12 z12Var16 = new z12("SINT32", 15, 15, 1, d43Var4);
        z12 z12Var17 = new z12("SINT64", 16, 16, 1, d43Var3);
        z12 z12Var18 = new z12("GROUP", 17, 17, 1, d43Var7);
        z12 z12Var19 = new z12("DOUBLE_LIST", 18, 18, 2, d43Var);
        z12 z12Var20 = new z12("FLOAT_LIST", 19, 19, 2, d43Var2);
        z12 z12Var21 = new z12("INT64_LIST", 20, 20, 2, d43Var3);
        z12 z12Var22 = new z12("UINT64_LIST", 21, 21, 2, d43Var3);
        z12 z12Var23 = new z12("INT32_LIST", 22, 22, 2, d43Var4);
        z12 z12Var24 = new z12("FIXED64_LIST", 23, 23, 2, d43Var3);
        z12 z12Var25 = new z12("FIXED32_LIST", 24, 24, 2, d43Var4);
        z12 z12Var26 = new z12("BOOL_LIST", 25, 25, 2, d43Var5);
        z12 z12Var27 = new z12("STRING_LIST", 26, 26, 2, d43Var6);
        z12 z12Var28 = new z12("MESSAGE_LIST", 27, 27, 2, d43Var7);
        z12 z12Var29 = new z12("BYTES_LIST", 28, 28, 2, d43Var8);
        z12 z12Var30 = new z12("UINT32_LIST", 29, 29, 2, d43Var4);
        z12 z12Var31 = new z12("ENUM_LIST", 30, 30, 2, d43Var9);
        z12 z12Var32 = new z12("SFIXED32_LIST", 31, 31, 2, d43Var4);
        z12 z12Var33 = new z12("SFIXED64_LIST", 32, 32, 2, d43Var3);
        z12 z12Var34 = new z12("SINT32_LIST", 33, 33, 2, d43Var4);
        z12 z12Var35 = new z12("SINT64_LIST", 34, 34, 2, d43Var3);
        z12 z12Var36 = new z12("DOUBLE_LIST_PACKED", 35, 35, 3, d43Var);
        y = z12Var36;
        z12 z12Var37 = new z12("FLOAT_LIST_PACKED", 36, 36, 3, d43Var2);
        z12 z12Var38 = new z12("INT64_LIST_PACKED", 37, 37, 3, d43Var3);
        z12 z12Var39 = new z12("UINT64_LIST_PACKED", 38, 38, 3, d43Var3);
        z12 z12Var40 = new z12("INT32_LIST_PACKED", 39, 39, 3, d43Var4);
        z12 z12Var41 = new z12("FIXED64_LIST_PACKED", 40, 40, 3, d43Var3);
        z12 z12Var42 = new z12("FIXED32_LIST_PACKED", 41, 41, 3, d43Var4);
        z12 z12Var43 = new z12("BOOL_LIST_PACKED", 42, 42, 3, d43Var5);
        z12 z12Var44 = new z12("UINT32_LIST_PACKED", 43, 43, 3, d43Var4);
        z12 z12Var45 = new z12("ENUM_LIST_PACKED", 44, 44, 3, d43Var9);
        z12 z12Var46 = new z12("SFIXED32_LIST_PACKED", 45, 45, 3, d43Var4);
        z12 z12Var47 = new z12("SFIXED64_LIST_PACKED", 46, 46, 3, d43Var3);
        z12 z12Var48 = new z12("SINT32_LIST_PACKED", 47, 47, 3, d43Var4);
        z12 z12Var49 = new z12("SINT64_LIST_PACKED", 48, 48, 3, d43Var3);
        z = z12Var49;
        B = new z12[]{z12Var, z12Var2, z12Var3, z12Var4, z12Var5, z12Var6, z12Var7, z12Var8, z12Var9, z12Var10, z12Var11, z12Var12, z12Var13, z12Var14, z12Var15, z12Var16, z12Var17, z12Var18, z12Var19, z12Var20, z12Var21, z12Var22, z12Var23, z12Var24, z12Var25, z12Var26, z12Var27, z12Var28, z12Var29, z12Var30, z12Var31, z12Var32, z12Var33, z12Var34, z12Var35, z12Var36, z12Var37, z12Var38, z12Var39, z12Var40, z12Var41, z12Var42, z12Var43, z12Var44, z12Var45, z12Var46, z12Var47, z12Var48, z12Var49, new z12("GROUP_LIST", 49, 49, 2, d43Var7), new z12("MAP", 50, 50, 4, d43.VOID)};
        z12[] values = values();
        A = new z12[values.length];
        for (z12 z12Var50 : values) {
            A[z12Var50.x] = z12Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z12(String str, int i, int i2, int i3, d43 d43Var) {
        this.x = i2;
        int B2 = h11.B(i3);
        if (B2 != 1) {
            if (B2 == 3) {
                Class cls = d43Var.x;
            }
        } else {
            Class cls2 = d43Var.x;
        }
        if (i3 == 1) {
            d43Var.ordinal();
        }
    }

    public static z12 valueOf(String str) {
        return (z12) Enum.valueOf(z12.class, str);
    }

    public static z12[] values() {
        return (z12[]) B.clone();
    }
}

package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ae7 extends po0 {
    public static final Map A;
    public final xa8 z;

    static {
        EnumMap enumMap = new EnumMap(xa8.class);
        for (xa8 xa8Var : xa8.values()) {
            ae7[] ae7VarArr = new ae7[10];
            for (int i = 0; i < 10; i++) {
                ae7VarArr[i] = new ae7(i, xa8Var, za8.e);
            }
            enumMap.put((EnumMap) xa8Var, (xa8) ae7VarArr);
        }
        A = Collections.unmodifiableMap(enumMap);
    }

    public ae7(int i, xa8 xa8Var, za8 za8Var) {
        super(za8Var, i);
        it5.h(xa8Var, "format char");
        this.z = xa8Var;
        if (!za8Var.a()) {
            int i2 = xa8Var.x;
            i2 = za8Var.c() ? i2 & 65503 : i2;
            StringBuilder sb = new StringBuilder("%");
            za8Var.d(sb);
            sb.append((char) i2);
        }
    }

    @Override // defpackage.po0
    public final void E(df2 df2Var, Object obj) {
        df2Var.d(obj, this.z, (za8) this.y);
    }
}

package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bm7 implements em7 {
    public final /* synthetic */ byte x;
    public final vs7 y;
    public final String z;

    public /* synthetic */ bm7(vs7 vs7Var, String str, byte b) {
        this.x = b;
        this.y = vs7Var;
        this.z = str;
    }

    @Override // defpackage.em7
    public final vs7 d(ik7 ik7Var) {
        byte b = this.x;
        String str = this.z;
        vs7 vs7Var = this.y;
        switch (b) {
            case 0:
                vs7 e = vs7Var.e();
                e.h(str, ik7Var);
                ((HashMap) e.d).put(str, Boolean.TRUE);
                return e;
            default:
                vs7Var.h(str, ik7Var);
                return vs7Var;
        }
    }
}

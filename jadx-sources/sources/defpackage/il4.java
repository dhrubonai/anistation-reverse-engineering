package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class il4 extends c3 implements ax2 {
    public final /* synthetic */ byte x;
    public final bl4 y;

    public /* synthetic */ il4(bl4 bl4Var, byte b) {
        this.x = b;
        this.y = bl4Var;
    }

    @Override // defpackage.m0
    public final int b() {
        byte b = this.x;
        bl4 bl4Var = this.y;
        switch (b) {
            case 0:
                return bl4Var.y;
            default:
                return bl4Var.y;
        }
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.x;
        bl4 bl4Var = this.y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = bl4Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && bl4Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return bl4Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.x;
        bl4 bl4Var = this.y;
        switch (b) {
            case 0:
                oj6 oj6Var = bl4Var.x;
                pj6[] pj6VarArr = new pj6[8];
                for (int i = 0; i < 8; i++) {
                    pj6VarArr[i] = new qj6((byte) 0);
                }
                return new cl4(oj6Var, pj6VarArr);
            default:
                oj6 oj6Var2 = bl4Var.x;
                pj6[] pj6VarArr2 = new pj6[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    pj6VarArr2[i2] = new qj6((byte) 1);
                }
                return new cl4(oj6Var2, pj6VarArr2);
        }
    }
}

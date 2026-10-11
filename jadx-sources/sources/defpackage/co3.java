package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class co3 extends m0 {
    public final /* synthetic */ byte x;
    public final Object y;

    public /* synthetic */ co3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.m0
    public final int b() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((do3) obj).a.groupCount() + 1;
            default:
                return ((bl4) obj).y;
        }
    }

    public ao3 c(int i) {
        Matcher matcher = ((do3) this.y).a;
        f13 r0 = db.r0(matcher.start(i), matcher.end(i));
        if (r0.x >= 0) {
            String group = matcher.group(i);
            group.getClass();
            return new ao3(group, r0);
        }
        return null;
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z;
        switch (this.x) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof ao3;
                }
                if (!z) {
                    return false;
                }
                return super.contains((ao3) obj);
            default:
                return ((bl4) this.y).containsValue(obj);
        }
    }

    @Override // defpackage.m0, java.util.Collection
    public boolean isEmpty() {
        switch (this.x) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.x) {
            case 0:
                return new oi6(new u22(new os(new d13(0, size() - 1, 1), (byte) 1), new lz0(this, (byte) 28), (byte) 4));
            default:
                oj6 oj6Var = ((bl4) this.y).x;
                pj6[] pj6VarArr = new pj6[8];
                for (int i = 0; i < 8; i++) {
                    pj6VarArr[i] = new qj6((byte) 2);
                }
                return new cl4(oj6Var, pj6VarArr);
        }
    }
}

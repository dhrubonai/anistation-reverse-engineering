package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nw0 extends hm3 {
    public final /* synthetic */ byte g = 1;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(nt7 nt7Var) {
        super(20);
        this.h = nt7Var;
    }

    @Override // defpackage.hm3
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((ow0) this.h).x.s0(str);
            default:
                String str2 = (String) obj;
                a34.u(str2);
                nt7 nt7Var = (nt7) this.h;
                nt7Var.M();
                a34.u(str2);
                fl7 fl7Var = nt7Var.y.z;
                z18.T(fl7Var);
                l87 T0 = fl7Var.T0(str2);
                if (T0 == null) {
                    return null;
                }
                es7 es7Var = ((gu7) nt7Var.x).C;
                gu7.l(es7Var);
                es7Var.K.b(str2, "Populate EES config from database on cache miss. appId");
                nt7Var.T(str2, nt7Var.U(str2, (byte[]) T0.y));
                nw0 nw0Var = nt7Var.H;
                synchronized (nw0Var.c) {
                    Set entrySet = nw0Var.b.a.entrySet();
                    entrySet.getClass();
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = nw0Var.b.a.entrySet();
                    entrySet2.getClass();
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (hn7) linkedHashMap.get(str2);
        }
    }

    @Override // defpackage.hm3
    public void b(Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 0:
                ((String) obj).getClass();
                ((m85) obj2).close();
                return;
            default:
                super.b(obj, obj2, obj3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(ow0 ow0Var) {
        super(25);
        this.h = ow0Var;
    }
}

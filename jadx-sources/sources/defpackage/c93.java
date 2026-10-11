package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c93 implements yv6 {
    public final im0 a;
    public final dc5 b;
    public final sb2 c;

    public c93(im0 im0Var, dc5 dc5Var, sb2 sb2Var) {
        this.a = im0Var;
        this.b = dc5Var;
        this.c = sb2Var;
    }

    @Override // defpackage.yv6
    public final vv6 c(im0 im0Var, o34 o34Var) {
        hd hdVar = new hd(this.c, o34Var);
        kz kzVar = this.b.e;
        sn3 sn3Var = (sn3) kzVar.B;
        sn3Var.getClass();
        Object obj = ((HashMap) sn3Var.y).get(b93.x);
        if (obj == null) {
            obj = null;
        }
        if (!a34.i(obj, Boolean.TRUE)) {
            return (vv6) this.b.d(this.a, null, hdVar);
        }
        String str = im0Var.f() + '-' + a34.W();
        zk6 zk6Var = new zk6(im0Var);
        zk6 zk6Var2 = aw6.a;
        zp2 zp2Var = (zp2) kzVar.z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zp2Var.z;
        ((i18) ((kz) zp2Var.x).x).getClass();
        zf3 zf3Var = zf3.x;
        zf3 zf3Var2 = zf3.B;
        zf3Var2.compareTo(zf3Var);
        Set set = (Set) zp2Var.y;
        if (!set.contains(zk6Var)) {
            zf3Var2.compareTo(zf3Var);
            set.add(zk6Var);
        }
        if (!concurrentHashMap.containsKey(str)) {
            dc5 dc5Var = new dc5(zk6Var, str, zk6Var2, (kz) zp2Var.x, 4);
            dc5[] dc5VarArr = {(dc5) zp2Var.A};
            if (!dc5Var.c) {
                dc5Var.f.addAll(0, ms.S0(dc5VarArr));
                concurrentHashMap.put(str, dc5Var);
                dc5 dc5Var2 = this.b;
                if (!dc5Var2.c) {
                    dc5[] dc5VarArr2 = {dc5Var2};
                    if (!dc5Var.c) {
                        dc5Var.f.addAll(0, ms.S0(dc5VarArr2));
                    } else {
                        ze0.m("Can't add scope link to a root scope");
                        return null;
                    }
                }
                vv6 vv6Var = (vv6) dc5Var.d(this.a, null, hdVar);
                bw6 bw6Var = new bw6(str, kzVar);
                wv6 wv6Var = vv6Var.a;
                if (wv6Var.d) {
                    wv6.a(bw6Var);
                    return vv6Var;
                }
                synchronized (wv6Var.a) {
                    wv6Var.c.add(bw6Var);
                }
                return vv6Var;
            }
            ze0.m("Can't add scope link to a root scope");
            return null;
        }
        throw new nw(qx1.m("Scope with id '", str, "' is already created"), (byte) 7);
    }
}

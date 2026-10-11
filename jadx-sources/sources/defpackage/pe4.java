package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pe4 {
    public boolean a;
    public UUID b;
    public z77 c;
    public final Set d;
    public final /* synthetic */ byte e;

    public pe4(Class cls, byte b) {
        this.e = b;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = this.b.toString();
        uuid.getClass();
        this.c = new z77(uuid, (j77) null, cls.getName(), (String) null, (e41) null, (e41) null, 0L, 0L, 0L, (qx0) null, 0, (c00) null, 0L, 0L, 0L, 0L, false, (wg4) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(vn3.S(1));
        linkedHashSet.add(strArr[0]);
        this.d = linkedHashSet;
    }

    public final w77 a() {
        w77 w77Var;
        boolean z;
        String str;
        byte b = this.e;
        Set set = this.d;
        switch (b) {
            case 0:
                if (this.a && this.c.j.d) {
                    ze0.k("Cannot set backoff criteria on an idle mode job");
                    w77Var = null;
                    break;
                } else {
                    w77Var = new w77(this.b, this.c, set);
                    break;
                }
                break;
            default:
                if (this.a && this.c.j.d) {
                    ze0.k("Cannot set backoff criteria on an idle mode job");
                } else {
                    z77 z77Var = this.c;
                    if (!z77Var.q) {
                        w77Var = new w77(this.b, z77Var, set);
                        break;
                    } else {
                        ze0.k("PeriodicWorkRequests cannot be expedited");
                    }
                }
                w77Var = null;
                break;
        }
        qx0 qx0Var = this.c.j;
        if (qx0Var.i.isEmpty() && !qx0Var.e && !qx0Var.c && !qx0Var.d) {
            z = false;
        } else {
            z = true;
        }
        z77 z77Var2 = this.c;
        if (z77Var2.q) {
            if (!z) {
                if (z77Var2.g > 0) {
                    ze0.k("Expedited jobs cannot be delayed");
                    return null;
                }
            } else {
                ze0.k("Expedited jobs only support network and storage constraints");
                return null;
            }
        }
        String str2 = z77Var2.x;
        if (str2 == null) {
            List i0 = uz5.i0(z77Var2.c, new String[]{"."}, 6);
            if (i0.size() == 1) {
                str = (String) i0.get(0);
            } else {
                str = (String) yo0.r0(i0);
            }
            if (str.length() > 127) {
                str = uz5.u0(127, str);
            }
            z77Var2.x = str;
        } else if (str2.length() > 127) {
            this.c.x = uz5.u0(127, str2);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        z77 z77Var3 = this.c;
        w77 w77Var2 = w77Var;
        this.c = new z77(uuid, z77Var3.b, z77Var3.c, z77Var3.d, new e41(z77Var3.e), new e41(z77Var3.f), z77Var3.g, z77Var3.h, z77Var3.i, new qx0(z77Var3.j), z77Var3.k, z77Var3.l, z77Var3.m, z77Var3.n, z77Var3.o, z77Var3.p, z77Var3.q, z77Var3.r, z77Var3.s, z77Var3.u, z77Var3.v, z77Var3.w, z77Var3.x, z77Var3.y, 524288);
        return w77Var2;
    }
}

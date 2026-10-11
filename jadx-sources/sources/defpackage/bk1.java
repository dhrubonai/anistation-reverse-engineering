package defpackage;

import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.library.WatchProgress;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bk1 implements kc2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ub2 C;
    public final /* synthetic */ ic2 D;
    public final /* synthetic */ ub2 E;
    public final /* synthetic */ ub2 F;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;
    public final /* synthetic */ Set z;

    public bk1(List list, List list2, Set set, ub2 ub2Var, boolean z, ub2 ub2Var2, ic2 ic2Var, ub2 ub2Var3, ub2 ub2Var4) {
        this.x = list;
        this.y = list2;
        this.z = set;
        this.A = ub2Var;
        this.B = z;
        this.C = ub2Var2;
        this.D = ic2Var;
        this.E = ub2Var3;
        this.F = ub2Var4;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Long l;
        Object obj5;
        Long l2;
        int i2;
        int i3;
        zc3 zc3Var = (zc3) obj;
        int intValue = ((Number) obj2).intValue();
        kd2 kd2Var = (kd2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (kd2Var.f(zc3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (kd2Var.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            EpisodeDownload episodeDownload = (EpisodeDownload) this.x.get(intValue);
            kd2Var.e0(1105400998);
            Iterator it = this.y.iterator();
            while (true) {
                l = null;
                if (it.hasNext()) {
                    obj5 = it.next();
                    if (((WatchProgress) obj5).getEpisodeNumber() == episodeDownload.getMetadata().getEpisodeNumber()) {
                        break;
                    }
                } else {
                    obj5 = null;
                    break;
                }
            }
            WatchProgress watchProgress = (WatchProgress) obj5;
            if (watchProgress != null) {
                l2 = Long.valueOf(watchProgress.getPositionMs());
            } else {
                l2 = null;
            }
            if (watchProgress != null) {
                l = Long.valueOf(watchProgress.getDurationMs());
            }
            boolean contains = this.z.contains(episodeDownload.getId());
            yz3 T = n77.T(zc3.a(zc3Var, vz3.x), 15.0f, 0.0f, 2);
            ub2 ub2Var = this.A;
            boolean f = kd2Var.f(ub2Var) | kd2Var.h(episodeDownload);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (f || Q == q18Var) {
                Q = new ck1(ub2Var, episodeDownload, (byte) 0);
                kd2Var.n0(Q);
            }
            sb2 sb2Var = (sb2) Q;
            ub2 ub2Var2 = this.C;
            boolean f2 = kd2Var.f(ub2Var2) | kd2Var.h(episodeDownload);
            Object Q2 = kd2Var.Q();
            if (f2 || Q2 == q18Var) {
                Q2 = new ck1(ub2Var2, episodeDownload, (byte) 1);
                kd2Var.n0(Q2);
            }
            sb2 sb2Var2 = (sb2) Q2;
            ic2 ic2Var = this.D;
            boolean f3 = kd2Var.f(ic2Var) | kd2Var.h(episodeDownload);
            Object Q3 = kd2Var.Q();
            if (f3 || Q3 == q18Var) {
                Q3 = new od(ic2Var, episodeDownload, (byte) 10);
                kd2Var.n0(Q3);
            }
            ub2 ub2Var3 = (ub2) Q3;
            boolean h = kd2Var.h(episodeDownload);
            ub2 ub2Var4 = this.E;
            boolean f4 = h | kd2Var.f(ub2Var4);
            Object Q4 = kd2Var.Q();
            if (f4 || Q4 == q18Var) {
                Q4 = new ck1(episodeDownload, ub2Var4);
                kd2Var.n0(Q4);
            }
            sb2 sb2Var3 = (sb2) Q4;
            ub2 ub2Var5 = this.F;
            boolean f5 = kd2Var.f(ub2Var5) | kd2Var.h(episodeDownload);
            Object Q5 = kd2Var.Q();
            if (f5 || Q5 == q18Var) {
                Q5 = new ck1(ub2Var5, episodeDownload, (byte) 3);
                kd2Var.n0(Q5);
            }
            Long l3 = l2;
            sw0.b(episodeDownload, l3, l, contains, sb2Var, this.B, sb2Var2, ub2Var3, T, sb2Var3, (sb2) Q5, kd2Var, 0, 0, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}

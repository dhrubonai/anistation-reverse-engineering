package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.library.WatchProgress;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gw1 implements kc2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ String C;
    public final /* synthetic */ xe1 D;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;
    public final /* synthetic */ Integer z;

    public gw1(List list, List list2, Integer num, String str, int i, String str2, xe1 xe1Var) {
        this.x = list;
        this.y = list2;
        this.z = num;
        this.A = str;
        this.B = i;
        this.C = str2;
        this.D = xe1Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Long l;
        Object obj5;
        Long l2;
        boolean z2;
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
            Episode episode = (Episode) this.x.get(intValue);
            kd2Var.e0(-1063187578);
            Iterator it = this.y.iterator();
            while (true) {
                l = null;
                if (it.hasNext()) {
                    obj5 = it.next();
                    if (((WatchProgress) obj5).getEpisodeNumber() == episode.getNumber()) {
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
            Long l3 = l;
            int number = episode.getNumber();
            Integer num = this.z;
            if (num != null && num.intValue() == number) {
                z2 = true;
            } else {
                z2 = false;
            }
            yz3 a = zc3.a(zc3Var, vz3.x);
            Integer valueOf = Integer.valueOf(this.B);
            boolean h = kd2Var.h(episode);
            Object obj6 = this.D;
            boolean f = h | kd2Var.f(obj6);
            Object Q = kd2Var.Q();
            if (f || Q == au0.a) {
                Q = new uh0(episode, obj6, (byte) 1);
                kd2Var.n0(Q);
            }
            kb0.d(episode, a, this.A, valueOf, l2, l3, this.C, z2, (sb2) Q, kd2Var, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}

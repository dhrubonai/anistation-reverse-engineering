package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;
import com.anistation.model.download.DownloadAnimeGroupKt;
import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.DownloadStorageUsage;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tm1 extends vv6 {
    public final qk1 b;
    public final cy6 c;
    public final sx5 d;

    public tm1(qk1 qk1Var, cy6 cy6Var) {
        nt1 nt1Var;
        this.b = qk1Var;
        this.c = cy6Var;
        byte b = 1;
        int i = 255 & 1;
        vz0 vz0Var = null;
        nt1 nt1Var2 = nt1.x;
        if (i != 0) {
            nt1Var = nt1Var2;
        } else {
            nt1Var = null;
        }
        this.d = tx5.a(new pm1(nt1Var, null, false, tt1.x, nt1Var2, new DownloadSettings(false, null, null, 7, null), new DownloadStorageUsage(0L, 0L, 0L, 7, null), true));
        tl7.z(zz.J(this), null, null, new rm1(this, vz0Var, (byte) 0), 3);
        tl7.z(zz.J(this), null, null, new rm1(this, vz0Var, b), 3);
        tl7.z(zz.J(this), null, null, new rm1(this, vz0Var, (byte) 2), 3);
        tl7.z(zz.J(this), null, null, new rm1(this, vz0Var, (byte) 3), 3);
    }

    public final void e(String str, Integer num) {
        Object value;
        pm1 pm1Var;
        String str2;
        String animeId;
        str.getClass();
        sx5 sx5Var = this.d;
        if (((pm1) sx5Var.getValue()).c) {
            f(str);
            return;
        }
        do {
            value = sx5Var.getValue();
            pm1Var = (pm1) value;
            DownloadAnimeGroup findDownloadGroup = DownloadAnimeGroupKt.findDownloadGroup(pm1Var.a, str, num);
            if (findDownloadGroup != null && (animeId = findDownloadGroup.getAnimeId()) != null) {
                str2 = animeId;
            } else {
                str2 = str;
            }
        } while (!sx5Var.j(value, pm1.a(pm1Var, null, str2, false, null, null, null, null, false, 253)));
    }

    public final void f(String str) {
        sx5 sx5Var;
        Object value;
        pm1 pm1Var;
        LinkedHashSet W;
        str.getClass();
        do {
            sx5Var = this.d;
            value = sx5Var.getValue();
            pm1Var = (pm1) value;
            boolean contains = pm1Var.d.contains(str);
            Set set = pm1Var.d;
            if (contains) {
                W = el5.V(set, str);
            } else {
                W = el5.W(set, str);
            }
        } while (!sx5Var.j(value, pm1.a(pm1Var, null, null, true, W, null, null, null, false, 243)));
    }
}

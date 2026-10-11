package defpackage;

import android.graphics.Path;
import com.anistation.local.dao.WatchProgressDao_Impl;
import com.anistation.local.entity.WatchProgress;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class by6 implements ub2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ by6(Object obj, int i, int i2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        WatchProgress progress$lambda$0;
        WatchProgress observeProgress$lambda$0;
        byte b = this.x;
        int i = this.A;
        int i2 = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                progress$lambda$0 = WatchProgressDao_Impl.getProgress$lambda$0("\n        SELECT * FROM watch_progress\n        WHERE (animeId = ? OR\n            (? > 0 AND anilistId = ?))\n            AND episodeNumber = ?\n        ORDER BY CASE WHEN animeId = ? THEN 0 ELSE 1 END, updatedAt DESC\n        LIMIT 1\n        ", (String) obj2, i2, i, (g85) obj);
                return progress$lambda$0;
            case 1:
                observeProgress$lambda$0 = WatchProgressDao_Impl.observeProgress$lambda$0("\n        SELECT * FROM watch_progress\n        WHERE (animeId = ? OR\n            (? > 0 AND anilistId = ?))\n            AND episodeNumber = ?\n        ORDER BY CASE WHEN animeId = ? THEN 0 ELSE 1 END, updatedAt DESC\n        LIMIT 1\n        ", (String) obj2, i2, i, (g85) obj);
                return observeProgress$lambda$0;
            default:
                id idVar = (id) obj2;
                di4 di4Var = (di4) obj;
                cd cdVar = di4Var.a;
                int d = di4Var.d(i2);
                int d2 = di4Var.d(i);
                CharSequence charSequence = cdVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder u = qx1.u("start(", d, ") or end(", d2, ") is out of range [0..");
                    u.append(length);
                    u.append("], or start > end!");
                    fz2.a(u.toString());
                }
                Path path = new Path();
                zc6 zc6Var = cdVar.d;
                zc6Var.f.getSelectionPath(d, d2, path);
                int i3 = zc6Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                id idVar2 = new id(path);
                float f = di4Var.f;
                idVar2.g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                id.a(idVar, idVar2);
                return pn6.a;
        }
    }
}

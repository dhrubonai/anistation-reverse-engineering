package defpackage;

import com.anistation.model.backup.BackupFrequency;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y00 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final nf2 d;
    public final rt6 e;
    public final m00 f;
    public final int g;
    public final BackupFrequency h;
    public final boolean i;

    public y00(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, nf2 nf2Var, rt6 rt6Var, m00 m00Var, int i, BackupFrequency backupFrequency, boolean z) {
        m00Var.getClass();
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = nf2Var;
        this.e = rt6Var;
        this.f = m00Var;
        this.g = i;
        this.h = backupFrequency;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y00) {
                y00 y00Var = (y00) obj;
                if (!this.a.equals(y00Var.a) || !this.b.equals(y00Var.b) || !this.c.equals(y00Var.c) || !this.d.equals(y00Var.d) || !this.e.equals(y00Var.e) || !a34.i(this.f, y00Var.f) || this.g != y00Var.g || this.h != y00Var.h || this.i != y00Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + qx1.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestoreData(animeList=");
        sb.append(this.a);
        sb.append(", watchProgress=");
        sb.append(this.b);
        sb.append(", removedWatchHistory=");
        sb.append(this.c);
        sb.append(", globalSettings=");
        sb.append(this.d);
        sb.append(", videoSettings=");
        sb.append(this.e);
        sb.append(", downloadSettings=");
        sb.append(this.f);
        sb.append(", skippedUpdateVersionCode=");
        sb.append(this.g);
        sb.append(", backupFrequency=");
        sb.append(this.h);
        sb.append(", includeAnimeList=");
        return qx1.r(sb, this.i, ")");
    }
}

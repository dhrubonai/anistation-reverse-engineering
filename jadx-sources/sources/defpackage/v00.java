package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class v00 {
    public static final u00 Companion = new Object();
    public static final rb3[] h;
    public final long a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final v10 f;
    public final List g;

    /* JADX WARN: Type inference failed for: r0v0, types: [u00, java.lang.Object] */
    static {
        gr grVar = new gr((byte) 2);
        jf3 jf3Var = jf3.y;
        h = new rb3[]{null, null, bx7.B(jf3Var, grVar), bx7.B(jf3Var, new gr((byte) 3)), bx7.B(jf3Var, new gr((byte) 4)), null, bx7.B(jf3Var, new gr((byte) 5))};
    }

    public /* synthetic */ v00(int i, long j, String str, List list, List list2, List list3, v10 v10Var, List list4) {
        if (63 != (i & 63)) {
            iq4.throwMissingFieldException(i, 63, t00.a.getDescriptor());
        }
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = v10Var;
        if ((i & 64) == 0) {
            this.g = nt1.x;
        } else {
            this.g = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        if (this.a == v00Var.a && a34.i(this.b, v00Var.b) && a34.i(this.c, v00Var.c) && a34.i(this.d, v00Var.d) && a34.i(this.e, v00Var.e) && a34.i(this.f, v00Var.f) && a34.i(this.g, v00Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + zo5.j(this.e, zo5.j(this.d, zo5.j(this.c, zo5.i(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "BackupPayload(createdAtEpochMillis=" + this.a + ", appVersionName=" + this.b + ", animeList=" + this.c + ", watchProgress=" + this.d + ", removedWatchHistoryIds=" + this.e + ", settings=" + this.f + ", removedWatchHistoryAnimeIds=" + this.g + ")";
    }

    public v00(long j, String str, ArrayList arrayList, ArrayList arrayList2, v10 v10Var, ArrayList arrayList3) {
        this.a = j;
        this.b = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = nt1.x;
        this.f = v10Var;
        this.g = arrayList3;
    }
}

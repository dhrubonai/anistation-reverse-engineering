package z2;

/* loaded from: classes.dex */
public final class g extends y2.i implements Comparable {
    public long C;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (g(4) != gVar.g(4)) {
            if (g(4)) {
                return 1;
            }
        } else {
            long j4 = this.f5264x - gVar.f5264x;
            if (j4 == 0) {
                j4 = this.C - gVar.C;
                if (j4 == 0) {
                    return 0;
                }
            }
            if (j4 > 0) {
                return 1;
            }
        }
        return -1;
    }
}

package defpackage;

import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ln4 extends o2 {
    @Override // defpackage.o2
    public final long f(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.o2
    public final long g() {
        return ThreadLocalRandom.current().nextLong(1000L);
    }
}

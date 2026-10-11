package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mp5 implements Comparable {
    public static final Pattern D = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern E = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern F = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public final boolean A;
    public final File B;
    public final long C;
    public final String x;
    public final long y;
    public final long z;

    public mp5(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.x = str;
        this.y = j;
        this.z = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.A = z;
        this.B = file;
        this.C = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (r16.renameTo(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mp5 a(java.io.File r16, long r17, long r19, defpackage.tp r21) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp5.a(java.io.File, long, long, tp):mp5");
    }

    public static File b(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, qx1.k(j2, ".v3.exo", sb));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mp5 mp5Var = (mp5) obj;
        String str = mp5Var.x;
        String str2 = this.x;
        if (!str2.equals(str)) {
            return str2.compareTo(mp5Var.x);
        }
        long j = this.y - mp5Var.y;
        if (j == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.y);
        sb.append(", ");
        return qx1.k(this.z, "]", sb);
    }
}

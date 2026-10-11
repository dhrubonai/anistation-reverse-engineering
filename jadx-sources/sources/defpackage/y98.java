package defpackage;

import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y98 extends z98 {
    public int b;

    @Override // defpackage.z98
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // defpackage.z98
    public final String b() {
        return "logInternal";
    }

    @Override // defpackage.z98
    public final int c() {
        return 44;
    }

    @Override // defpackage.z98
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.z98
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y98) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            this.b = -1391114360;
            return -1391114360;
        }
        return i;
    }
}

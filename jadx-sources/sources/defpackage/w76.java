package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w76 implements q41 {
    public long A;
    public final q41 x;
    public final se0 y;
    public boolean z;

    public w76(q41 q41Var, se0 se0Var) {
        q41Var.getClass();
        this.x = q41Var;
        se0Var.getClass();
        this.y = se0Var;
    }

    @Override // defpackage.q41
    public final void close() {
        se0 se0Var = this.y;
        try {
            this.x.close();
            if (this.z) {
                this.z = false;
                if (se0Var.c != null) {
                    try {
                        se0Var.a();
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
            }
        } catch (Throwable th) {
            if (this.z) {
                this.z = false;
                if (se0Var.c != null) {
                    try {
                        se0Var.a();
                    } catch (IOException e2) {
                        throw new IOException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        long j;
        long h = this.x.h(v41Var);
        this.A = h;
        if (h == 0) {
            return 0L;
        }
        if (v41Var.g == -1 && h != -1) {
            v41Var = v41Var.c(0L, h);
        }
        int i = v41Var.i;
        this.z = true;
        se0 se0Var = this.y;
        se0Var.getClass();
        v41Var.h.getClass();
        if (v41Var.g == -1 && (i & 2) == 2) {
            se0Var.c = null;
        } else {
            se0Var.c = v41Var;
            if ((i & 4) == 4) {
                j = se0Var.b;
            } else {
                j = Long.MAX_VALUE;
            }
            se0Var.d = j;
            se0Var.h = 0L;
            try {
                se0Var.b(v41Var);
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        return this.A;
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (this.A == 0) {
            return -1;
        }
        int read = this.x.read(bArr, i, i2);
        if (read > 0) {
            se0 se0Var = this.y;
            v41 v41Var = se0Var.c;
            if (v41Var != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (se0Var.g == se0Var.d) {
                            se0Var.a();
                            se0Var.b(v41Var);
                        }
                        int min = (int) Math.min(read - i3, se0Var.d - se0Var.g);
                        OutputStream outputStream = se0Var.f;
                        String str = eq6.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        se0Var.g += j;
                        se0Var.h += j;
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
            }
            long j2 = this.A;
            if (j2 != -1) {
                this.A = j2 - read;
            }
        }
        return read;
    }

    @Override // defpackage.q41
    public final Map s() {
        return this.x.s();
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.x.y();
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.x.z(n71Var);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xs extends i30 {
    public final AssetManager B;
    public Uri C;
    public InputStream D;
    public long E;
    public boolean F;

    public xs(Context context) {
        super(false);
        this.B = context.getAssets();
    }

    @Override // defpackage.q41
    public final void close() {
        this.C = null;
        try {
            try {
                InputStream inputStream = this.D;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new s41(e, 2000);
            }
        } finally {
            this.D = null;
            if (this.F) {
                this.F = false;
                b();
            }
        }
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        int i;
        try {
            Uri uri = v41Var.a;
            long j = v41Var.f;
            this.C = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c();
            InputStream open = this.B.open(path, 1);
            this.D = open;
            if (open.skip(j) >= j) {
                long j2 = v41Var.g;
                if (j2 != -1) {
                    this.E = j2;
                } else {
                    long available = this.D.available();
                    this.E = available;
                    if (available == 2147483647L) {
                        this.E = -1L;
                    }
                }
                this.F = true;
                d(v41Var);
                return this.E;
            }
            throw new s41((Exception) null, 2008);
        } catch (ws e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new s41(e2, i);
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.E;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new s41(e, 2000);
                }
            }
            InputStream inputStream = this.D;
            String str = eq6.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.E;
                if (j2 != -1) {
                    this.E = j2 - read;
                }
                a(read);
                return read;
            }
        }
        return -1;
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.C;
    }
}

package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b22 extends i30 {
    public RandomAccessFile B;
    public Uri C;
    public long D;
    public boolean E;

    @Override // defpackage.q41
    public final void close() {
        this.C = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.B;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new s41(e, 2000);
            }
        } finally {
            this.B = null;
            if (this.E) {
                this.E = false;
                b();
            }
        }
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        Uri uri = v41Var.a;
        long j = v41Var.f;
        this.C = uri;
        c();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.B = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = v41Var.g;
                if (j2 == -1) {
                    j2 = this.B.length() - j;
                }
                this.D = j2;
                if (j2 >= 0) {
                    this.E = true;
                    d(v41Var);
                    return this.D;
                }
                throw new s41(null, null, 2008);
            } catch (IOException e) {
                throw new s41(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e2.getCause() instanceof ErrnoException) || ((ErrnoException) e2.getCause()).errno != OsConstants.EACCES) {
                    i = 2005;
                }
                throw new s41(e2, i);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder o = h11.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            o.append(fragment);
            throw new s41(o.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new s41(e3, 2006);
        } catch (RuntimeException e4) {
            throw new s41(e4, 2000);
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.D;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.B;
            String str = eq6.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.D -= read;
                a(read);
            }
            return read;
        } catch (IOException e) {
            throw new s41(e, 2000);
        }
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.C;
    }
}

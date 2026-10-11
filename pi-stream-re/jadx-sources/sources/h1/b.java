package h1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f4545e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f4546f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f4547g;

    /* renamed from: h, reason: collision with root package name */
    public long f4548h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4549i;

    public b(Context context) {
        super(false);
        this.f4545e = context.getAssets();
    }

    @Override // h1.h
    public final void close() {
        this.f4546f = null;
        try {
            try {
                InputStream inputStream = this.f4547g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(2000, e10);
            }
        } finally {
            this.f4547g = null;
            if (this.f4549i) {
                this.f4549i = false;
                s();
            }
        }
    }

    @Override // h1.h
    public final Uri j() {
        return this.f4546f;
    }

    @Override // h1.h
    public final long m(l lVar) {
        int i10;
        try {
            Uri uri = lVar.f4597a;
            long j4 = lVar.f4602f;
            this.f4546f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            t();
            InputStream open = this.f4545e.open(path, 1);
            this.f4547g = open;
            if (open.skip(j4) >= j4) {
                long j10 = lVar.f4603g;
                if (j10 != -1) {
                    this.f4548h = j10;
                } else {
                    long available = this.f4547g.available();
                    this.f4548h = available;
                    if (available == 2147483647L) {
                        this.f4548h = -1L;
                    }
                }
                this.f4549i = true;
                u(lVar);
                return this.f4548h;
            }
            throw new a(2008, null);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new a(i10, e11);
        }
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j4 = this.f4548h;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i11 = (int) Math.min(j4, i11);
            } catch (IOException e10) {
                throw new a(2000, e10);
            }
        }
        InputStream inputStream = this.f4547g;
        int i12 = f1.b0.f3799a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f4548h;
        if (j10 != -1) {
            this.f4548h = j10 - read;
        }
        r(read);
        return read;
    }
}

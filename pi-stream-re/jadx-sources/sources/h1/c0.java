package h1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c0 extends c {

    /* renamed from: e, reason: collision with root package name */
    public final Context f4554e;

    /* renamed from: f, reason: collision with root package name */
    public l f4555f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f4556g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f4557h;

    /* renamed from: i, reason: collision with root package name */
    public long f4558i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4559j;

    public c0(Context context) {
        super(false);
        this.f4554e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // h1.h
    public final void close() {
        this.f4555f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f4557h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f4557h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f4556g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new b0(2000, null, e10);
                    }
                } finally {
                    this.f4556g = null;
                    if (this.f4559j) {
                        this.f4559j = false;
                        s();
                    }
                }
            } catch (IOException e11) {
                throw new b0(2000, null, e11);
            }
        } catch (Throwable th) {
            this.f4557h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f4556g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f4556g = null;
                    if (this.f4559j) {
                        this.f4559j = false;
                        s();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new b0(2000, null, e12);
                }
            } finally {
                this.f4556g = null;
                if (this.f4559j) {
                    this.f4559j = false;
                    s();
                }
            }
        }
    }

    @Override // h1.h
    public final Uri j() {
        l lVar = this.f4555f;
        if (lVar != null) {
            return lVar.f4597a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r3.matches("\\d+") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    @Override // h1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(h1.l r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c0.m(h1.l):long");
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j4 = this.f4558i;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i11 = (int) Math.min(j4, i11);
            } catch (IOException e10) {
                throw new b0(2000, null, e10);
            }
        }
        FileInputStream fileInputStream = this.f4557h;
        int i12 = f1.b0.f3799a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f4558i == -1) {
                return -1;
            }
            throw new b0(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j10 = this.f4558i;
        if (j10 != -1) {
            this.f4558i = j10 - read;
        }
        r(read);
        return read;
    }
}

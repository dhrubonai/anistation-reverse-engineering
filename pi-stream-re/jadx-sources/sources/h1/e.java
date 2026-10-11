package h1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f4563e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f4564f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f4565g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f4566h;

    /* renamed from: i, reason: collision with root package name */
    public long f4567i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4568j;

    public e(Context context) {
        super(false);
        this.f4563e = context.getContentResolver();
    }

    @Override // h1.h
    public final void close() {
        this.f4564f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f4566h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f4566h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f4565g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f4565g = null;
                        if (this.f4568j) {
                            this.f4568j = false;
                            s();
                        }
                    }
                } catch (IOException e10) {
                    throw new d(e10, 2000);
                }
            } catch (IOException e11) {
                throw new d(e11, 2000);
            }
        } catch (Throwable th) {
            this.f4566h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f4565g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f4565g = null;
                    if (this.f4568j) {
                        this.f4568j = false;
                        s();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new d(e12, 2000);
                }
            } finally {
                this.f4565g = null;
                if (this.f4568j) {
                    this.f4568j = false;
                    s();
                }
            }
        }
    }

    @Override // h1.h
    public final Uri j() {
        return this.f4564f;
    }

    @Override // h1.h
    public final long m(l lVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i10 = 2000;
        try {
            Uri normalizeScheme = lVar.f4597a.normalizeScheme();
            this.f4564f = normalizeScheme;
            t();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f4563e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f4565g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f4566h = fileInputStream;
                long j4 = lVar.f4602f;
                if (length != -1 && j4 > length) {
                    throw new d(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j4) - startOffset;
                if (skip == j4) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f4567i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f4567i = position;
                            if (position < 0) {
                                throw new d(null, 2008);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f4567i = j10;
                        if (j10 < 0) {
                            throw new d(null, 2008);
                        }
                    }
                    long j11 = lVar.f4603g;
                    if (j11 != -1) {
                        long j12 = this.f4567i;
                        if (j12 == -1) {
                            min = j11;
                        } else {
                            min = Math.min(j12, j11);
                        }
                        this.f4567i = min;
                    }
                    this.f4568j = true;
                    u(lVar);
                    if (j11 == -1) {
                        return this.f4567i;
                    }
                    return j11;
                }
                throw new d(null, 2008);
            }
            throw new d(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (d e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new d(e11, i10);
        }
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j4 = this.f4567i;
        if (j4 == 0) {
            return -1;
        }
        if (j4 != -1) {
            try {
                i11 = (int) Math.min(j4, i11);
            } catch (IOException e10) {
                throw new d(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f4566h;
        int i12 = f1.b0.f3799a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f4567i;
        if (j10 != -1) {
            this.f4567i = j10 - read;
        }
        r(read);
        return read;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ky0 extends i30 {
    public final ContentResolver B;
    public Uri C;
    public AssetFileDescriptor D;
    public FileInputStream E;
    public long F;
    public boolean G;

    public ky0(Context context) {
        super(false);
        this.B = context.getContentResolver();
    }

    @Override // defpackage.q41
    public final void close() {
        this.C = null;
        try {
            try {
                FileInputStream fileInputStream = this.E;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.E = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.D;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new s41(e, 2000);
                    }
                } finally {
                    this.D = null;
                    if (this.G) {
                        this.G = false;
                        b();
                    }
                }
            } catch (IOException e2) {
                throw new s41(e2, 2000);
            }
        } catch (Throwable th) {
            this.E = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.D;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.D = null;
                    if (this.G) {
                        this.G = false;
                        b();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new s41(e3, 2000);
                }
            } finally {
                this.D = null;
                if (this.G) {
                    this.G = false;
                    b();
                }
            }
        }
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        int i;
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        long min;
        try {
            try {
                Uri uri = v41Var.a;
                long j2 = v41Var.g;
                long j3 = v41Var.f;
                Uri normalizeScheme = uri.normalizeScheme();
                this.C = normalizeScheme;
                c();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                ContentResolver contentResolver = this.B;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.D = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.E = fileInputStream;
                    if (length != -1 && j3 > length) {
                        throw new s41((Exception) null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                    if (skip == j3) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.F = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.F = j;
                                if (j < 0) {
                                    throw new s41((Exception) null, 2008);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.F = j;
                            if (j < 0) {
                                throw new s41((Exception) null, 2008);
                            }
                        }
                        if (j2 != -1) {
                            if (j == -1) {
                                min = j2;
                            } else {
                                min = Math.min(j, j2);
                            }
                            this.F = min;
                        }
                        this.G = true;
                        d(v41Var);
                        if (j2 != -1) {
                            return j2;
                        }
                        return this.F;
                    }
                    throw new s41((Exception) null, 2008);
                }
                i = 2000;
                try {
                    throw new s41(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        i2 = 2005;
                    } else {
                        i2 = i;
                    }
                    throw new s41(e, i2);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (jy0 e3) {
            throw e3;
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.F;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new s41(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.E;
            String str = eq6.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.F;
                if (j2 != -1) {
                    this.F = j2 - read;
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

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hy4 extends i30 {
    public final Context B;
    public v41 C;
    public AssetFileDescriptor D;
    public FileInputStream E;
    public long F;
    public boolean G;

    public hy4(Context context) {
        super(false);
        this.B = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
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
                        throw new s41(null, e, 2000);
                    }
                } finally {
                    this.D = null;
                    if (this.G) {
                        this.G = false;
                        b();
                    }
                }
            } catch (IOException e2) {
                throw new s41(null, e2, 2000);
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
                    throw new s41(null, e3, 2000);
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
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        long j;
        long min;
        this.C = v41Var;
        c();
        Uri uri = v41Var.a;
        long j2 = v41Var.g;
        long j3 = v41Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.B;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new s41("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new s41("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new s41("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new s41("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(qx1.m(host, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new s41("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new s41("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd != null) {
                this.D = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.D.getFileDescriptor());
                this.E = fileInputStream;
                try {
                    if (length != -1 && j3 > length) {
                        throw new s41(null, null, 2008);
                    }
                    long startOffset = this.D.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                    if (skip == j3) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.F = -1L;
                                j = -1;
                            } else {
                                j = channel.size() - channel.position();
                                this.F = j;
                                if (j < 0) {
                                    throw new s41(null, null, 2008);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.F = j;
                            if (j < 0) {
                                throw new s41(2008);
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
                    throw new s41(null, null, 2008);
                } catch (gy4 e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new s41(null, e3, 2000);
                }
            }
            throw new s41("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e4) {
            throw new s41(null, e4, 2005);
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
                    throw new s41(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.E;
            String str = eq6.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.F;
            if (read == -1) {
                if (j2 != -1) {
                    throw new s41("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
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
        v41 v41Var = this.C;
        if (v41Var != null) {
            return v41Var.a;
        }
        return null;
    }
}

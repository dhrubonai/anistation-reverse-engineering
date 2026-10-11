package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d91 extends i30 {
    public final rt3 B;
    public final rt3 C;
    public v41 D;
    public HttpURLConnection E;
    public InputStream F;
    public boolean G;
    public int H;
    public long I;
    public long J;

    public d91(rt3 rt3Var) {
        super(true);
        this.B = rt3Var;
        this.C = new rt3((byte) 27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q41
    public final void close() {
        try {
            InputStream inputStream = this.F;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = eq6.a;
                    throw new mq2(2000, 3, e);
                }
            }
        } finally {
            this.F = null;
            e();
            if (this.G) {
                this.G = false;
                b();
            }
            this.E = null;
            this.D = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.E;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                kb0.t("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection f(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String str;
        boolean z3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.B.q());
        hashMap.putAll(this.C.q());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = xs2.a(j, j2);
        if (a != null) {
            httpURLConnection.setRequestProperty("Range", a);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        httpURLConnection.setRequestMethod(v41.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        long threadId;
        boolean z;
        s41 s41Var;
        this.D = v41Var;
        long j = 0;
        this.J = 0L;
        this.I = 0L;
        c();
        try {
            Thread currentThread = Thread.currentThread();
            if (Build.VERSION.SDK_INT >= 36) {
                threadId = currentThread.threadId();
            } else {
                threadId = currentThread.getId();
            }
            TrafficStats.setThreadStatsTag((int) threadId);
            URL url = new URL(v41Var.a.toString());
            byte b = v41Var.c;
            byte[] bArr = v41Var.d;
            long j2 = v41Var.f;
            long j3 = v41Var.g;
            if ((v41Var.i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            HttpURLConnection f = f(url, b, bArr, j2, j3, z, true, v41Var.e);
            long j4 = v41Var.g;
            long j5 = v41Var.f;
            this.E = f;
            this.H = f.getResponseCode();
            f.getResponseMessage();
            int i = this.H;
            long j6 = -1;
            if (i >= 200 && i <= 299) {
                f.getContentType();
                if (this.H == 200 && j5 != 0) {
                    j = j5;
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(f.getHeaderField("Content-Encoding"));
                if (!equalsIgnoreCase) {
                    if (j4 != -1) {
                        this.I = j4;
                    } else {
                        long b2 = xs2.b(f.getHeaderField("Content-Length"), f.getHeaderField("Content-Range"));
                        if (b2 != -1) {
                            j6 = b2 - j;
                        }
                        this.I = j6;
                    }
                } else {
                    this.I = j4;
                }
                try {
                    this.F = f.getInputStream();
                    if (equalsIgnoreCase) {
                        this.F = new GZIPInputStream(this.F);
                    }
                    this.G = true;
                    d(v41Var);
                    try {
                        m(j);
                        return this.I;
                    } catch (IOException e) {
                        e();
                        if (e instanceof mq2) {
                            throw ((mq2) e);
                        }
                        throw new mq2(2000, 1, e);
                    }
                } catch (IOException e2) {
                    e();
                    throw new mq2(2000, 1, e2);
                }
            }
            Map<String, List<String>> headerFields = f.getHeaderFields();
            if (this.H == 416 && j5 == xs2.c(f.getHeaderField("Content-Range"))) {
                this.G = true;
                d(v41Var);
                if (j4 == -1) {
                    return 0L;
                }
                return j4;
            }
            InputStream errorStream = f.getErrorStream();
            try {
                if (errorStream != null) {
                    pd0.b(errorStream);
                } else {
                    String str = eq6.a;
                }
            } catch (IOException unused) {
                String str2 = eq6.a;
            }
            e();
            if (this.H == 416) {
                s41Var = new s41(2008);
            } else {
                s41Var = null;
            }
            throw new oq2(this.H, s41Var, headerFields);
        } catch (IOException e3) {
            e();
            throw mq2.a(1, e3);
        }
    }

    public final void m(long j) {
        if (j != 0) {
            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            while (j > 0) {
                int min = (int) Math.min(j, 4096L);
                InputStream inputStream = this.F;
                String str = eq6.a;
                int read = inputStream.read(bArr, 0, min);
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        a(read);
                    } else {
                        throw new mq2(2008);
                    }
                } else {
                    throw new mq2(2000, 1, new InterruptedIOException());
                }
            }
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.I;
            if (j != -1) {
                long j2 = j - this.J;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.F;
            String str = eq6.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.J += read;
                a(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = eq6.a;
            throw mq2.a(2, e);
        }
    }

    @Override // defpackage.q41
    public final Map s() {
        HttpURLConnection httpURLConnection = this.E;
        if (httpURLConnection == null) {
            return t15.D;
        }
        return new c91(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.q41
    public final Uri y() {
        HttpURLConnection httpURLConnection = this.E;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        v41 v41Var = this.D;
        if (v41Var != null) {
            return v41Var.a;
        }
        return null;
    }
}

package h1;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import r6.s1;

/* loaded from: classes.dex */
public final class r extends c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4626e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4627f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4628g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4629h;

    /* renamed from: i, reason: collision with root package name */
    public final z f4630i;

    /* renamed from: j, reason: collision with root package name */
    public final z f4631j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4632k;

    /* renamed from: l, reason: collision with root package name */
    public final q6.h f4633l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f4634m;

    /* renamed from: n, reason: collision with root package name */
    public InputStream f4635n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public int f4636p;

    /* renamed from: q, reason: collision with root package name */
    public long f4637q;

    /* renamed from: r, reason: collision with root package name */
    public long f4638r;

    public r(String str, int i10, int i11, z zVar) {
        super(true);
        this.f4629h = str;
        this.f4627f = i10;
        this.f4628g = i11;
        this.f4626e = false;
        this.f4630i = zVar;
        this.f4633l = null;
        this.f4631j = new z(0);
        this.f4632k = false;
    }

    public static void z(HttpURLConnection httpURLConnection, long j4) {
        int i10;
        if (httpURLConnection != null && (i10 = f1.b0.f3799a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j4 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j4 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void A(long j4) {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j4 > 0) {
            int min = (int) Math.min(j4, 4096);
            InputStream inputStream = this.f4635n;
            int i10 = f1.b0.f3799a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j4 -= read;
                    r(read);
                } else {
                    throw new w();
                }
            } else {
                throw new w(new InterruptedIOException(), 2000, 1);
            }
        }
    }

    @Override // h1.h
    public final void close() {
        try {
            InputStream inputStream = this.f4635n;
            if (inputStream != null) {
                long j4 = this.f4637q;
                long j10 = -1;
                if (j4 != -1) {
                    j10 = j4 - this.f4638r;
                }
                z(this.f4634m, j10);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = f1.b0.f3799a;
                    throw new w(e10, 2000, 3);
                }
            }
        } finally {
            this.f4635n = null;
            v();
            if (this.o) {
                this.o = false;
                s();
            }
        }
    }

    @Override // h1.c, h1.h
    public final Map e() {
        HttpURLConnection httpURLConnection = this.f4634m;
        if (httpURLConnection == null) {
            return s1.f9531x;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override // h1.h
    public final Uri j() {
        HttpURLConnection httpURLConnection = this.f4634m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0139 A[Catch: IOException -> 0x0162, TRY_LEAVE, TryCatch #3 {IOException -> 0x0162, blocks: (B:26:0x0131, B:28:0x0139), top: B:25:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    @Override // h1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(h1.l r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.r.m(h1.l):long");
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j4 = this.f4637q;
            if (j4 != -1) {
                long j10 = j4 - this.f4638r;
                if (j10 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j10);
            }
            InputStream inputStream = this.f4635n;
            int i12 = f1.b0.f3799a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f4638r += read;
                r(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i13 = f1.b0.f3799a;
            throw w.a(e10, 2);
        }
    }

    public final void v() {
        HttpURLConnection httpURLConnection = this.f4634m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                f1.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f4634m = null;
        }
    }

    public final URL w(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new w(r.f.d("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f4626e && !protocol.equals(url.getProtocol())) {
                    throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new w(e10, 2001, 1);
            }
        }
        throw new w("Null location redirect", 2001);
    }

    public final HttpURLConnection x(l lVar) {
        boolean z9;
        HttpURLConnection y9;
        boolean z10;
        l lVar2 = lVar;
        URL url = new URL(lVar2.f4597a.toString());
        int i10 = lVar2.f4599c;
        byte[] bArr = lVar2.f4600d;
        long j4 = lVar2.f4602f;
        long j10 = lVar2.f4603g;
        if ((lVar2.f4605i & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = this.f4626e;
        boolean z12 = this.f4632k;
        if (!z11 && !z12) {
            return y(url, i10, bArr, j4, j10, z9, true, lVar2.f4601e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                Map map = lVar2.f4601e;
                URL url3 = url2;
                int i14 = i11;
                boolean z13 = z12;
                long j11 = j10;
                y9 = y(url2, i11, bArr2, j4, j10, z9, false, map);
                int responseCode = y9.getResponseCode();
                String headerField = y9.getHeaderField("Location");
                if ((i14 != 1 && i14 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    y9.disconnect();
                    if (z13 && responseCode == 302) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i14;
                    }
                    url2 = w(url3, headerField);
                } else {
                    y9.disconnect();
                    url2 = w(url3, headerField);
                    i11 = i14;
                }
                lVar2 = lVar;
                i12 = i13;
                z12 = z13;
                j10 = j11;
            } else {
                throw new w(new NoRouteToHostException(a3.g.n("Too many redirects: ", i13)), 2001, 1);
            }
        }
        return y9;
    }

    public final HttpURLConnection y(URL url, int i10, byte[] bArr, long j4, long j10, boolean z9, boolean z10, Map map) {
        Map map2;
        String sb;
        String str;
        boolean z11;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f4627f);
        httpURLConnection.setReadTimeout(this.f4628g);
        HashMap hashMap = new HashMap();
        z zVar = this.f4630i;
        if (zVar != null) {
            hashMap.putAll(zVar.a());
        }
        z zVar2 = this.f4631j;
        synchronized (zVar2) {
            if (zVar2.f4647b == null) {
                zVar2.f4647b = Collections.unmodifiableMap(new HashMap(zVar2.f4646a));
            }
            map2 = zVar2.f4647b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = a0.f4543a;
        if (j4 == 0 && j10 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j4);
            sb2.append("-");
            if (j10 != -1) {
                sb2.append((j4 + j10) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.f4629h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z9) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z10);
        if (bArr != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        httpURLConnection.setDoOutput(z11);
        int i11 = l.f4596k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }
}

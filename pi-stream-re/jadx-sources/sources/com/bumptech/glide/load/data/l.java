package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b4.o f2264a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2265b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f2266c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f2267d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f2268e;

    static {
        new w1.o(17);
    }

    public l(b4.o oVar, int i10) {
        this.f2264a = oVar;
        this.f2265b = i10;
    }

    public static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        InputStream inputStream = this.f2267d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2266c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2266c = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f2268e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, d dVar) {
        StringBuilder sb;
        b4.o oVar = this.f2264a;
        int i10 = p4.g.f8564b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.s(f(oVar.d(), 0, null, oVar.f1479b.a()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                dVar.n(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(p4.g.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + p4.g.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i10, URL url2, Map map) {
        boolean z9;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new m1.b(-1, "In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z10 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i11 = this.f2265b;
                httpURLConnection.setConnectTimeout(i11);
                httpURLConnection.setReadTimeout(i11);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f2266c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f2267d = this.f2266c.getInputStream();
                    if (this.f2268e) {
                        return null;
                    }
                    int b10 = b(this.f2266c);
                    int i12 = b10 / 100;
                    if (i12 == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        HttpURLConnection httpURLConnection2 = this.f2266c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f2267d = new p4.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f2267d = httpURLConnection2.getInputStream();
                            }
                            return this.f2267d;
                        } catch (IOException e10) {
                            throw new m1.b(b(httpURLConnection2), "Failed to obtain InputStream", e10);
                        }
                    }
                    if (i12 == 3) {
                        z10 = true;
                    }
                    if (z10) {
                        String headerField = this.f2266c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                c();
                                return f(url3, i10 + 1, url, map);
                            } catch (MalformedURLException e11) {
                                throw new m1.b(b10, r.f.d("Bad redirect url: ", headerField), e11);
                            }
                        }
                        throw new m1.b(b10, "Received empty or null redirect url", null);
                    }
                    if (b10 == -1) {
                        throw new m1.b(b10, 1);
                    }
                    try {
                        throw new m1.b(b10, this.f2266c.getResponseMessage(), null);
                    } catch (IOException e12) {
                        throw new m1.b(b10, "Failed to get a response message", e12);
                    }
                } catch (IOException e13) {
                    throw new m1.b(b(this.f2266c), "Failed to connect or obtain data", e13);
                }
            } catch (IOException e14) {
                throw new m1.b(0, "URL.openConnection threw", e14);
            }
        }
        throw new m1.b(-1, "Too many (> 5) redirects!", null);
    }
}

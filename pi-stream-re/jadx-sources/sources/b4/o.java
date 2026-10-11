package b4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class o implements v3.i {

    /* renamed from: b, reason: collision with root package name */
    public final p f1479b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f1480c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1481d;

    /* renamed from: e, reason: collision with root package name */
    public String f1482e;

    /* renamed from: f, reason: collision with root package name */
    public URL f1483f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f1484g;

    /* renamed from: h, reason: collision with root package name */
    public int f1485h;

    public o(URL url) {
        s sVar = p.f1486a;
        w7.b.q(url);
        this.f1480c = url;
        this.f1481d = null;
        w7.b.q(sVar);
        this.f1479b = sVar;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        if (this.f1484g == null) {
            this.f1484g = c().getBytes(v3.i.f10644a);
        }
        messageDigest.update(this.f1484g);
    }

    public final String c() {
        String str = this.f1481d;
        if (str == null) {
            URL url = this.f1480c;
            w7.b.q(url);
            return url.toString();
        }
        return str;
    }

    public final URL d() {
        if (this.f1483f == null) {
            if (TextUtils.isEmpty(this.f1482e)) {
                String str = this.f1481d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f1480c;
                    w7.b.q(url);
                    str = url.toString();
                }
                this.f1482e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1483f = new URL(this.f1482e);
        }
        return this.f1483f;
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!c().equals(oVar.c()) || !this.f1479b.equals(oVar.f1479b)) {
            return false;
        }
        return true;
    }

    @Override // v3.i
    public final int hashCode() {
        if (this.f1485h == 0) {
            int hashCode = c().hashCode();
            this.f1485h = hashCode;
            this.f1485h = this.f1479b.hashCode() + (hashCode * 31);
        }
        return this.f1485h;
    }

    public final String toString() {
        return c();
    }

    public o(String str) {
        s sVar = p.f1486a;
        this.f1480c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f1481d = str;
            w7.b.q(sVar);
            this.f1479b = sVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}

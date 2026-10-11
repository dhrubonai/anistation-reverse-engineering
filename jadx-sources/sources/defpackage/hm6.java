package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hm6 {
    public static final op6 k = fz5.b("http://localhost");
    public String a;
    public boolean b;
    public int c;
    public jm6 d;
    public String e;
    public String f;
    public String g;
    public List h;
    public kk2 i;
    public eo3 j;

    public hm6() {
        ki4.b.getClass();
        qt1 qt1Var = ji4.b;
        qt1Var.getClass();
        this.a = "";
        this.b = false;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        ss ssVar = lo0.a;
        Charset charset = kl0.a;
        charset.getClass();
        byte[] l = et5.l("", charset);
        StringBuilder sb = new StringBuilder(l.length);
        for (byte b : l) {
            if (b == 32) {
                sb.append("%20");
            } else if (!lo0.a.a(b) && !lo0.c.a(b)) {
                lo0.a(sb, b);
            } else {
                sb.append((char) b);
            }
        }
        this.g = sb.toString();
        nt1 nt1Var = nt1.x;
        this.h = new ArrayList(zo0.V(nt1Var, 10));
        kk2 kk2Var = new kk2((byte) 1);
        for (String str : qt1Var.names()) {
            List<String> d = qt1Var.d(str);
            d = d == null ? nt1Var : d;
            String f = lo0.f(str, false);
            ArrayList arrayList = new ArrayList(zo0.V(d, 10));
            for (String str2 : d) {
                str2.getClass();
                arrayList.add(lo0.f(str2, true));
            }
            kk2Var.j(f, arrayList);
        }
        this.i = kk2Var;
        this.j = new eo3((Object) kk2Var, (byte) 24);
    }

    public final void a() {
        if (this.a.length() <= 0 && !d().x.equals("file")) {
            op6 op6Var = k;
            this.a = op6Var.x;
            if (this.d == null) {
                this.d = op6Var.E;
            }
            if (this.c == 0) {
                e(op6Var.y);
            }
        }
    }

    public final op6 b() {
        String str;
        a();
        jm6 jm6Var = this.d;
        String str2 = this.a;
        int i = this.c;
        List list = this.h;
        ArrayList arrayList = new ArrayList(zo0.V(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lo0.d((String) it.next()));
        }
        ki4 b = it5.b((kk2) this.j.y);
        String e = lo0.e(this.g, 0, 0, 15);
        String str3 = this.e;
        String str4 = null;
        if (str3 != null) {
            str = lo0.d(str3);
        } else {
            str = null;
        }
        String str5 = this.f;
        if (str5 != null) {
            str4 = lo0.d(str5);
        }
        return new op6(jm6Var, str2, i, arrayList, b, e, str, str4, this.b, c());
    }

    public final String c() {
        a();
        StringBuilder sb = new StringBuilder(256);
        jy5.b(this, sb);
        return sb.toString();
    }

    public final jm6 d() {
        jm6 jm6Var = this.d;
        if (jm6Var == null) {
            jm6 jm6Var2 = jm6.z;
            return jm6.z;
        }
        return jm6Var;
    }

    public final void e(int i) {
        if (i >= 0 && i < 65536) {
            this.c = i;
        } else {
            ze0.e(qx1.h(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        jy5.b(this, sb);
        return sb.toString();
    }
}

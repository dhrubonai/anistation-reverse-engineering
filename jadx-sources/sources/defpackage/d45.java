package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d45 extends n22 {
    public static final qj4 C;
    public final n22 A;
    public final d46 B;
    public final ClassLoader z;

    static {
        String str = qj4.y;
        C = r18.l("/");
    }

    public d45(ClassLoader classLoader) {
        b73 b73Var = n22.x;
        b73Var.getClass();
        this.z = classLoader;
        this.A = b73Var;
        this.B = new d46(new nj4(this, (byte) 6));
    }

    @Override // defpackage.n22
    public final List G(qj4 qj4Var) {
        qj4 qj4Var2 = C;
        qj4Var2.getClass();
        String q = c.a(qj4Var2, qj4Var, true).d(qj4Var2).x.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (ai4 ai4Var : (List) this.B.getValue()) {
            n22 n22Var = (n22) ai4Var.x;
            qj4 qj4Var3 = (qj4) ai4Var.y;
            try {
                List G = n22Var.G(qj4Var3.e(q));
                ArrayList arrayList = new ArrayList();
                for (Object obj : G) {
                    if (wk6.y((qj4) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    qj4 qj4Var4 = (qj4) obj2;
                    qj4Var4.getClass();
                    String replace = uz5.c0(qj4Var4.x.q(), qj4Var3.x.q()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(qj4Var2.e(replace));
                }
                dp0.Y(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return yo0.I0(linkedHashSet);
        }
        v71.m(qj4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.n22
    public final e22 T(qj4 qj4Var) {
        qj4Var.getClass();
        if (wk6.y(qj4Var)) {
            qj4 qj4Var2 = C;
            qj4Var2.getClass();
            String q = c.a(qj4Var2, qj4Var, true).d(qj4Var2).x.q();
            for (ai4 ai4Var : (List) this.B.getValue()) {
                e22 T = ((n22) ai4Var.x).T(((qj4) ai4Var.y).e(q));
                if (T != null) {
                    return T;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.n22
    public final pq5 a(qj4 qj4Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n22
    public final z63 d0(qj4 qj4Var) {
        if (wk6.y(qj4Var)) {
            qj4 qj4Var2 = C;
            qj4Var2.getClass();
            String q = c.a(qj4Var2, qj4Var, true).d(qj4Var2).x.q();
            Iterator it = ((List) this.B.getValue()).iterator();
            while (it.hasNext()) {
                ai4 ai4Var = (ai4) it.next();
                try {
                    return ((n22) ai4Var.x).d0(((qj4) ai4Var.y).e(q));
                } catch (FileNotFoundException unused) {
                }
            }
            v71.m(qj4Var, "file not found: ");
            return null;
        }
        v71.m(qj4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.n22
    public final pq5 k0(qj4 qj4Var, boolean z) {
        qj4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n22
    public final void l(qj4 qj4Var, qj4 qj4Var2) {
        qj4Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.n22
    public final bv5 l0(qj4 qj4Var) {
        qj4Var.getClass();
        if (wk6.y(qj4Var)) {
            qj4 qj4Var2 = C;
            qj4Var2.getClass();
            URL resource = this.z.getResource(c.a(qj4Var2, qj4Var, false).d(qj4Var2).x.q());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return iv.O(inputStream);
            }
            v71.m(qj4Var, "file not found: ");
            return null;
        }
        v71.m(qj4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.n22
    public final void q(qj4 qj4Var) {
        qj4Var.getClass();
        throw new IOException(this + " is read-only");
    }
}

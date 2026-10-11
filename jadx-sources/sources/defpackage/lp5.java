package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lp5 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final x94 b;
    public final tp c;
    public final rt3 d;
    public final HashMap e;
    public final Random f;
    public long g;
    public long h;
    public pe0 i;

    public lp5(File file, x94 x94Var, cx5 cx5Var) {
        boolean add;
        tp tpVar = new tp(cx5Var, file);
        rt3 rt3Var = new rt3((Object) cx5Var, (byte) 1);
        synchronized (lp5.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (add) {
            this.a = file;
            this.b = x94Var;
            this.c = tpVar;
            this.d = rt3Var;
            this.e = new HashMap();
            this.f = new Random();
            this.g = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new kp5(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        ov3.p(file, "Another SimpleCache instance uses the folder: ");
        throw null;
    }

    public static void d(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            kb0.s("SimpleCache", str);
            throw new IOException(str);
        }
    }

    public final void a(mp5 mp5Var) {
        String str = mp5Var.x;
        this.c.k(str).c.add(mp5Var);
        this.h += mp5Var.z;
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((x94) arrayList.get(size)).getClass();
            }
        }
        this.b.getClass();
    }

    public final synchronized void b(String str, pz2 pz2Var) {
        c();
        tp tpVar = this.c;
        if0 k = tpVar.k(str);
        r71 r71Var = k.e;
        r71 b = r71Var.b(pz2Var);
        k.e = b;
        if (!b.equals(r71Var)) {
            ((jf0) tpVar.C).d(k);
        }
        try {
            this.c.s();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public final synchronized void c() {
        pe0 pe0Var = this.i;
        if (pe0Var != null) {
            throw pe0Var;
        }
    }

    public final synchronized long e(long j2, String str, long j3) {
        long j4;
        long j5;
        long j6 = Long.MAX_VALUE;
        if (j3 == -1) {
            j4 = Long.MAX_VALUE;
        } else {
            j4 = j3 + j2;
        }
        if (j4 >= 0) {
            j6 = j4;
        }
        j5 = 0;
        while (j2 < j6) {
            long f = f(j2, str, j6 - j2);
            if (f > 0) {
                j5 += f;
            } else {
                f = -f;
            }
            j2 += f;
        }
        return j5;
    }

    public final synchronized long f(long j2, String str, long j3) {
        long j4;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        if0 h = this.c.h(str);
        if (h != null) {
            j4 = h.a(j2, j3);
        } else {
            j4 = -j3;
        }
        return j4;
    }

    public final synchronized r71 g(String str) {
        r71 r71Var;
        if0 h = this.c.h(str);
        if (h != null) {
            r71Var = h.e;
        } else {
            r71Var = r71.c;
        }
        return r71Var;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.IOException, pe0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.IOException, pe0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.IOException, pe0] */
    public final void h() {
        long j2;
        tp tpVar = this.c;
        File file = this.a;
        if (!file.exists()) {
            try {
                d(file);
            } catch (pe0 e) {
                this.i = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            kb0.s("SimpleCache", str);
            this.i = new IOException(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i < length) {
                File file2 = listFiles[i];
                String name = file2.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        kb0.s("SimpleCache", "Malformed UID file: " + file2);
                        file2.delete();
                    }
                }
                i++;
            } else {
                j2 = -1;
                break;
            }
        }
        this.g = j2;
        if (j2 == -1) {
            try {
                long nextLong = new SecureRandom().nextLong();
                if (nextLong == Long.MIN_VALUE) {
                    j2 = 0;
                } else {
                    j2 = Math.abs(nextLong);
                }
                File file3 = new File(file, h11.j(Long.toString(j2, 16), ".uid"));
                if (!file3.createNewFile()) {
                    p65.n(file3, "Failed to create UID file: ");
                    j2 = 0;
                }
                this.g = j2;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                kb0.t("SimpleCache", str2, e2);
                this.i = new IOException(str2, e2);
                return;
            }
        }
        try {
            tpVar.n(j2);
            rt3 rt3Var = this.d;
            if (rt3Var != null) {
                rt3Var.v(this.g);
                HashMap m = rt3Var.m();
                i(file, true, listFiles, m);
                rt3Var.B(m.keySet());
            } else {
                i(file, true, listFiles, null);
            }
            ho6 it = zw2.m(((HashMap) tpVar.y).keySet()).iterator();
            while (it.hasNext()) {
                tpVar.p((String) it.next());
            }
            try {
                tpVar.s();
            } catch (IOException e3) {
                kb0.t("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            kb0.t("SimpleCache", str3, e4);
            this.i = new IOException(str3, e4);
        }
    }

    public final void i(File file, boolean z, File[] fileArr, Map map) {
        ye0 ye0Var;
        long j2;
        long j3;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    i(file2, false, file2.listFiles(), map);
                } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    if (map != null) {
                        ye0Var = (ye0) map.remove(name);
                    } else {
                        ye0Var = null;
                    }
                    if (ye0Var != null) {
                        j2 = ye0Var.a;
                        j3 = ye0Var.b;
                    } else {
                        j2 = -1;
                        j3 = -9223372036854775807L;
                    }
                    mp5 a = mp5.a(file2, j2, j3, this.c);
                    if (a != null) {
                        a(a);
                    } else {
                        file2.delete();
                    }
                }
            }
            return;
        }
        if (!z) {
            file.delete();
        }
    }

    public final synchronized void j(mp5 mp5Var) {
        if0 h = this.c.h(mp5Var.x);
        h.getClass();
        long j2 = mp5Var.y;
        ArrayList arrayList = h.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((hf0) arrayList.get(i)).a == j2) {
                arrayList.remove(i);
                this.c.p(h.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final synchronized void k(String str) {
        TreeSet treeSet;
        synchronized (this) {
            try {
                if0 h = this.c.h(str);
                if (h != null && !h.c.isEmpty()) {
                    treeSet = new TreeSet((Collection) h.c);
                }
                treeSet = new TreeSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            l((mp5) it.next());
        }
    }

    public final void l(mp5 mp5Var) {
        String str = mp5Var.x;
        File file = mp5Var.B;
        tp tpVar = this.c;
        if0 h = tpVar.h(str);
        if (h != null && h.c.remove(mp5Var)) {
            if (file != null) {
                file.delete();
            }
            this.h -= mp5Var.z;
            rt3 rt3Var = this.d;
            if (rt3Var != null) {
                file.getClass();
                String name = file.getName();
                try {
                    ((String) rt3Var.z).getClass();
                    try {
                        ((cx5) rt3Var.y).getWritableDatabase().delete((String) rt3Var.z, "name = ?", new String[]{name});
                    } catch (SQLException e) {
                        throw new IOException(e);
                    }
                } catch (IOException unused) {
                    h11.w("Failed to remove file index entry for: ", name, "SimpleCache");
                }
            }
            tpVar.p(h.b);
            ArrayList arrayList = (ArrayList) this.e.get(mp5Var.x);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((x94) arrayList.get(size)).getClass();
                }
            }
            this.b.getClass();
        }
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.y).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((if0) it.next()).c.iterator();
            while (it2.hasNext()) {
                mp5 mp5Var = (mp5) it2.next();
                File file = mp5Var.B;
                file.getClass();
                if (file.length() != mp5Var.z) {
                    arrayList.add(mp5Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            l((mp5) arrayList.get(i));
        }
    }

    public final synchronized mp5 n(long j2, String str, long j3) {
        long j4;
        mp5 b;
        c();
        if0 h = this.c.h(str);
        if (h == null) {
            j4 = j2;
            b = new mp5(str, j4, j3, -9223372036854775807L, null);
        } else {
            j4 = j2;
            while (true) {
                b = h.b(j4, j3);
                if (!b.A) {
                    break;
                }
                File file = b.B;
                file.getClass();
                if (file.length() == b.z) {
                    break;
                }
                m();
            }
        }
        if (b.A) {
            return b;
        }
        if0 k = this.c.k(str);
        long j5 = b.z;
        ArrayList arrayList = k.d;
        for (int i = 0; i < arrayList.size(); i++) {
            hf0 hf0Var = (hf0) arrayList.get(i);
            long j6 = hf0Var.a;
            if (j6 <= j4) {
                long j7 = hf0Var.b;
                if (j7 != -1 && j6 + j7 <= j4) {
                }
                return null;
            }
            if (j5 != -1 && j4 + j5 <= j6) {
            }
            return null;
        }
        arrayList.add(new hf0(j4, j5));
        return b;
    }
}

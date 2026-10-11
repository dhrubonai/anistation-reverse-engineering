package t3;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o1.d0;

/* loaded from: classes.dex */
public final class e implements Closeable {
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final File f10010a;

    /* renamed from: b, reason: collision with root package name */
    public final File f10011b;

    /* renamed from: c, reason: collision with root package name */
    public final File f10012c;

    /* renamed from: d, reason: collision with root package name */
    public final File f10013d;

    /* renamed from: f, reason: collision with root package name */
    public final long f10015f;

    /* renamed from: z, reason: collision with root package name */
    public BufferedWriter f10018z;

    /* renamed from: y, reason: collision with root package name */
    public long f10017y = 0;
    public final LinkedHashMap A = new LinkedHashMap(0, 0.75f, true);
    public long C = 0;
    public final ThreadPoolExecutor D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a E = new a(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f10014e = 1;

    /* renamed from: x, reason: collision with root package name */
    public final int f10016x = 1;

    public e(File file, long j4) {
        this.f10010a = file;
        this.f10011b = new File(file, "journal");
        this.f10012c = new File(file, "journal.tmp");
        this.f10013d = new File(file, "journal.bkp");
        this.f10015f = j4;
    }

    public static e G(File file, long j4) {
        if (j4 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    L(file2, file3, false);
                }
            }
            e eVar = new e(file, j4);
            if (eVar.f10011b.exists()) {
                try {
                    eVar.I();
                    eVar.H();
                    return eVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    eVar.close();
                    h.a(eVar.f10010a);
                }
            }
            file.mkdirs();
            e eVar2 = new e(file, j4);
            eVar2.K();
            return eVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void L(File file, File file2, boolean z9) {
        if (z9) {
            q(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public static void a(e eVar, d0 d0Var, boolean z9) {
        synchronized (eVar) {
            c cVar = (c) d0Var.f8138b;
            if (cVar.f10002f == d0Var) {
                if (z9 && !cVar.f10001e) {
                    for (int i10 = 0; i10 < eVar.f10016x; i10++) {
                        if (((boolean[]) d0Var.f8139c)[i10]) {
                            if (!cVar.f10000d[i10].exists()) {
                                d0Var.c();
                                return;
                            }
                        } else {
                            d0Var.c();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < eVar.f10016x; i11++) {
                    File file = cVar.f10000d[i11];
                    if (z9) {
                        if (file.exists()) {
                            File file2 = cVar.f9999c[i11];
                            file.renameTo(file2);
                            long j4 = cVar.f9998b[i11];
                            long length = file2.length();
                            cVar.f9998b[i11] = length;
                            eVar.f10017y = (eVar.f10017y - j4) + length;
                        }
                    } else {
                        q(file);
                    }
                }
                eVar.B++;
                cVar.f10002f = null;
                if (cVar.f10001e | z9) {
                    cVar.f10001e = true;
                    eVar.f10018z.append((CharSequence) "CLEAN");
                    eVar.f10018z.append(' ');
                    eVar.f10018z.append((CharSequence) cVar.f9997a);
                    eVar.f10018z.append((CharSequence) cVar.a());
                    eVar.f10018z.append('\n');
                    if (z9) {
                        long j10 = eVar.C;
                        eVar.C = 1 + j10;
                        cVar.f10003g = j10;
                    }
                } else {
                    eVar.A.remove(cVar.f9997a);
                    eVar.f10018z.append((CharSequence) "REMOVE");
                    eVar.f10018z.append(' ');
                    eVar.f10018z.append((CharSequence) cVar.f9997a);
                    eVar.f10018z.append('\n');
                }
                t(eVar.f10018z);
                if (eVar.f10017y > eVar.f10015f || eVar.x()) {
                    eVar.D.submit(eVar.E);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void f(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void q(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void t(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void H() {
        q(this.f10012c);
        Iterator it = this.A.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            d0 d0Var = cVar.f10002f;
            int i10 = this.f10016x;
            int i11 = 0;
            if (d0Var == null) {
                while (i11 < i10) {
                    this.f10017y += cVar.f9998b[i11];
                    i11++;
                }
            } else {
                cVar.f10002f = null;
                while (i11 < i10) {
                    q(cVar.f9999c[i11]);
                    q(cVar.f10000d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void I() {
        File file = this.f10011b;
        g gVar = new g(new FileInputStream(file), h.f10025a);
        try {
            String a10 = gVar.a();
            String a11 = gVar.a();
            String a12 = gVar.a();
            String a13 = gVar.a();
            String a14 = gVar.a();
            if ("libcore.io.DiskLruCache".equals(a10) && "1".equals(a11) && Integer.toString(this.f10014e).equals(a12) && Integer.toString(this.f10016x).equals(a13) && "".equals(a14)) {
                boolean z9 = false;
                int i10 = 0;
                while (true) {
                    try {
                        J(gVar.a());
                        i10++;
                    } catch (EOFException unused) {
                        this.B = i10 - this.A.size();
                        if (gVar.f10024e == -1) {
                            z9 = true;
                        }
                        if (z9) {
                            K();
                        } else {
                            this.f10018z = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), h.f10025a));
                        }
                        try {
                            gVar.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
        } catch (Throwable th) {
            try {
                gVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void J(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap linkedHashMap = this.A;
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            c cVar = (c) linkedHashMap.get(substring);
            if (cVar == null) {
                cVar = new c(this, substring);
                linkedHashMap.put(substring, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.f10001e = true;
                cVar.f10002f = null;
                if (split.length == cVar.f10004h.f10016x) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            cVar.f9998b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f10002f = new d0(this, cVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void K() {
        BufferedWriter bufferedWriter = this.f10018z;
        if (bufferedWriter != null) {
            f(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10012c), h.f10025a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f10014e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f10016x));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (c cVar : this.A.values()) {
                if (cVar.f10002f != null) {
                    bufferedWriter2.write("DIRTY " + cVar.f9997a + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + cVar.f9997a + cVar.a() + '\n');
                }
            }
            f(bufferedWriter2);
            if (this.f10011b.exists()) {
                L(this.f10011b, this.f10013d, true);
            }
            L(this.f10012c, this.f10011b, false);
            this.f10013d.delete();
            this.f10018z = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10011b, true), h.f10025a));
        } catch (Throwable th) {
            f(bufferedWriter2);
            throw th;
        }
    }

    public final void M() {
        while (this.f10017y > this.f10015f) {
            String str = (String) ((Map.Entry) this.A.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.f10018z != null) {
                    c cVar = (c) this.A.get(str);
                    if (cVar != null && cVar.f10002f == null) {
                        for (int i10 = 0; i10 < this.f10016x; i10++) {
                            File file = cVar.f9999c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j4 = this.f10017y;
                            long[] jArr = cVar.f9998b;
                            this.f10017y = j4 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.B++;
                        this.f10018z.append((CharSequence) "REMOVE");
                        this.f10018z.append(' ');
                        this.f10018z.append((CharSequence) str);
                        this.f10018z.append('\n');
                        this.A.remove(str);
                        if (x()) {
                            this.D.submit(this.E);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f10018z == null) {
            return;
        }
        Iterator it = new ArrayList(this.A.values()).iterator();
        while (it.hasNext()) {
            d0 d0Var = ((c) it.next()).f10002f;
            if (d0Var != null) {
                d0Var.c();
            }
        }
        M();
        f(this.f10018z);
        this.f10018z = null;
    }

    public final d0 r(String str) {
        synchronized (this) {
            if (this.f10018z != null) {
                c cVar = (c) this.A.get(str);
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.A.put(str, cVar);
                } else if (cVar.f10002f != null) {
                    return null;
                }
                d0 d0Var = new d0(this, cVar);
                cVar.f10002f = d0Var;
                this.f10018z.append((CharSequence) "DIRTY");
                this.f10018z.append(' ');
                this.f10018z.append((CharSequence) str);
                this.f10018z.append('\n');
                t(this.f10018z);
                return d0Var;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized d v(String str) {
        if (this.f10018z != null) {
            c cVar = (c) this.A.get(str);
            if (cVar == null) {
                return null;
            }
            if (!cVar.f10001e) {
                return null;
            }
            for (File file : cVar.f9999c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.B++;
            this.f10018z.append((CharSequence) "READ");
            this.f10018z.append(' ');
            this.f10018z.append((CharSequence) str);
            this.f10018z.append('\n');
            if (x()) {
                this.D.submit(this.E);
            }
            return new d(this, str, cVar.f10003g, cVar.f9999c, cVar.f9998b);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean x() {
        int i10 = this.B;
        if (i10 >= 2000 && i10 >= this.A.size()) {
            return true;
        }
        return false;
    }
}

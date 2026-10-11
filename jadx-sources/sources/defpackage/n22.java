package defpackage;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n22 implements Closeable {
    public static final b73 x;
    public static final qj4 y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [b73] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        try {
            Class.forName("java.nio.file.Files");
            r0 = new Object();
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        }
        x = r0;
        String str = qj4.y;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        y = r18.l(property);
        ClassLoader classLoader = d45.class.getClassLoader();
        classLoader.getClass();
        new d45(classLoader);
    }

    public final boolean A(qj4 qj4Var) {
        qj4Var.getClass();
        if (T(qj4Var) != null) {
            return true;
        }
        return false;
    }

    public List G(qj4 qj4Var) {
        File file = qj4Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!file.exists()) {
                v71.m(qj4Var, "no such file: ");
                return null;
            }
            p65.n(qj4Var, "failed to list ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(qj4Var.e(str));
        }
        cp0.W(arrayList);
        return arrayList;
    }

    public final e22 I(qj4 qj4Var) {
        qj4Var.getClass();
        e22 T = T(qj4Var);
        if (T != null) {
            return T;
        }
        v71.m(qj4Var, "no such file: ");
        return null;
    }

    public e22 T(qj4 qj4Var) {
        qj4Var.getClass();
        File file = qj4Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new e22(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    public pq5 a(qj4 qj4Var) {
        return new wt(new FileOutputStream(qj4Var.toFile(), true), new Object(), (byte) 1);
    }

    public z63 d0(qj4 qj4Var) {
        return new z63(new RandomAccessFile(qj4Var.toFile(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    public pq5 k0(qj4 qj4Var, boolean z) {
        qj4Var.getClass();
        if (z && A(qj4Var)) {
            throw new IOException(qj4Var + " already exists.");
        }
        return new wt(new FileOutputStream(qj4Var.toFile(), false), new Object(), (byte) 1);
    }

    public void l(qj4 qj4Var, qj4 qj4Var2) {
        qj4Var2.getClass();
        if (qj4Var.toFile().renameTo(qj4Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + qj4Var + " to " + qj4Var2);
    }

    public bv5 l0(qj4 qj4Var) {
        qj4Var.getClass();
        return new xt(new FileInputStream(qj4Var.toFile()), of6.d);
    }

    public void p(qj4 qj4Var) {
        qj4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    public void q(qj4 qj4Var) {
        qj4Var.getClass();
        if (!Thread.interrupted()) {
            File file = qj4Var.toFile();
            if (!file.delete() && file.exists()) {
                p65.n(qj4Var, "failed to delete ");
                return;
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public final void t(qj4 qj4Var) {
        qj4Var.getClass();
        q(qj4Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}

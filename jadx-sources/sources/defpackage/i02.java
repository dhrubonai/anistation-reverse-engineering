package defpackage;

import android.content.Context;
import android.util.AtomicFile;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.download.external.ExternalDownloadRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i02 {
    public static final m18 d = new m18((byte) 18);
    public static volatile i02 e;
    public final AtomicFile a;
    public final x53 b = zz.d(new f01((byte) 17));
    public final Object c = new Object();

    public i02(Context context) {
        this.a = new AtomicFile(new File(context.getApplicationContext().getFilesDir(), "external_downloads.json"));
    }

    public final List a() {
        List list;
        synchronized (this.c) {
            list = d().b;
        }
        return list;
    }

    public final void b(ExternalDownloadRequest externalDownloadRequest) {
        synchronized (this.c) {
            try {
                h02 d2 = d();
                ExternalDownloadRecord externalDownloadRecord = new ExternalDownloadRecord(externalDownloadRequest, EpisodeDownloadState.QUEUED, 0.0f, 0L, 0L, 0, (String) null, (String) null, (String) null, System.currentTimeMillis(), (String) null, 1532, (q71) null);
                List list = d2.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!a34.i(((ExternalDownloadRecord) obj).getRequest().getId(), externalDownloadRequest.getId())) {
                        arrayList.add(obj);
                    }
                }
                g(new h02(d2.a, yo0.v0(arrayList, externalDownloadRecord)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ExternalDownloadRecord c(String str) {
        Object obj;
        ExternalDownloadRecord externalDownloadRecord;
        str.getClass();
        synchronized (this.c) {
            try {
                Iterator it = d().b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (a34.i(((ExternalDownloadRecord) obj).getRequest().getId(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                externalDownloadRecord = (ExternalDownloadRecord) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return externalDownloadRecord;
    }

    public final h02 d() {
        Object y45Var;
        AtomicFile atomicFile = this.a;
        if (!atomicFile.getBaseFile().exists()) {
            return new h02();
        }
        try {
            FileInputStream openRead = atomicFile.openRead();
            try {
                openRead.getClass();
                byte[] H = kb0.H(openRead);
                openRead.close();
                if (H.length == 0) {
                    y45Var = new h02();
                } else {
                    y45Var = (h02) this.b.a(h02.Companion.serializer(), new String(H, kl0.a));
                }
            } finally {
            }
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (z45.b(y45Var) != null) {
            y45Var = new h02();
        }
        return (h02) y45Var;
    }

    public final ExternalDownloadRecord e(String str) {
        ExternalDownloadRecord externalDownloadRecord;
        Object obj;
        str.getClass();
        synchronized (this.c) {
            try {
                h02 d2 = d();
                Iterator it = d2.b.iterator();
                while (true) {
                    externalDownloadRecord = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (a34.i(((ExternalDownloadRecord) obj).getRequest().getId(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ExternalDownloadRecord externalDownloadRecord2 = (ExternalDownloadRecord) obj;
                if (externalDownloadRecord2 != null) {
                    List list = d2.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!a34.i(((ExternalDownloadRecord) obj2).getRequest().getId(), str)) {
                            arrayList.add(obj2);
                        }
                    }
                    g(new h02(d2.a, arrayList));
                    externalDownloadRecord = externalDownloadRecord2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return externalDownloadRecord;
    }

    public final ExternalDownloadRecord f(String str, ub2 ub2Var) {
        ExternalDownloadRecord externalDownloadRecord;
        str.getClass();
        synchronized (this.c) {
            try {
                h02 d2 = d();
                List<ExternalDownloadRecord> list = d2.b;
                ArrayList arrayList = new ArrayList(zo0.V(list, 10));
                externalDownloadRecord = null;
                for (ExternalDownloadRecord externalDownloadRecord2 : list) {
                    if (a34.i(externalDownloadRecord2.getRequest().getId(), str)) {
                        externalDownloadRecord2 = ExternalDownloadRecord.copy$default((ExternalDownloadRecord) ub2Var.invoke(externalDownloadRecord2), null, null, 0.0f, 0L, 0L, 0, null, null, null, System.currentTimeMillis(), null, 1535, null);
                        externalDownloadRecord = externalDownloadRecord2;
                    }
                    arrayList.add(externalDownloadRecord2);
                }
                if (externalDownloadRecord != null) {
                    g(new h02(d2.a, arrayList));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return externalDownloadRecord;
    }

    public final void g(h02 h02Var) {
        byte[] bytes = this.b.b(h02.Companion.serializer(), h02Var).getBytes(kl0.a);
        bytes.getClass();
        AtomicFile atomicFile = this.a;
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bytes);
            startWrite.getFD().sync();
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }
}

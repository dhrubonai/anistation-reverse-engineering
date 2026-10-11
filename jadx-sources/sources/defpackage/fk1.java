package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fk1 extends Handler {
    public final HandlerThread a;
    public final x71 b;
    public final dn0 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public fk1(HandlerThread handlerThread, x71 x71Var, dn0 dn0Var, Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = x71Var;
        this.c = dn0Var;
        this.d = handler;
        this.i = i;
        this.j = i2;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static cj1 a(cj1 cj1Var, int i, int i2) {
        return new cj1(cj1Var.a, i, cj1Var.c, System.currentTimeMillis(), cj1Var.e, i2, 0, cj1Var.h);
    }

    public final cj1 b(String str, boolean z) {
        int c = c(str);
        if (c != -1) {
            return (cj1) this.e.get(c);
        }
        if (z) {
            try {
                return this.b.d(str);
            } catch (IOException e) {
                kb0.t("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }
        return null;
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                if (((cj1) arrayList.get(i)).a.x.equals(str)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final void d(cj1 cj1Var) {
        boolean z;
        int i = cj1Var.b;
        boolean z2 = true;
        if (i != 3 && i != 4) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        int c = c(cj1Var.a.x);
        byte b = 11;
        ArrayList arrayList = this.e;
        if (c == -1) {
            arrayList.add(cj1Var);
            Collections.sort(arrayList, new be(b));
        } else {
            if (cj1Var.c == ((cj1) arrayList.get(c)).c) {
                z2 = false;
            }
            arrayList.set(c, cj1Var);
            if (z2) {
                Collections.sort(arrayList, new be(b));
            }
        }
        try {
            this.b.i(cj1Var);
        } catch (IOException e) {
            kb0.t("DownloadManager", "Failed to update index.", e);
        }
        this.d.obtainMessage(3, new ek1(cj1Var, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final cj1 e(cj1 cj1Var, int i, int i2) {
        boolean z;
        if (i != 3 && i != 4) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        cj1 a = a(cj1Var, i, i2);
        d(a);
        return a;
    }

    public final void f(cj1 cj1Var, int i) {
        if (i == 0) {
            if (cj1Var.b == 1) {
                e(cj1Var, 0, 0);
            }
        } else if (i != cj1Var.f) {
            int i2 = cj1Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new cj1(cj1Var.a, i2, cj1Var.c, System.currentTimeMillis(), cj1Var.e, i, 0, cj1Var.h));
        }
    }

    public final void g() {
        hk1 hk1Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                cj1 cj1Var = (cj1) arrayList.get(i);
                il1 il1Var = cj1Var.a;
                String str = il1Var.x;
                HashMap hashMap = this.f;
                hk1 hk1Var2 = (hk1) hashMap.get(str);
                int i3 = cj1Var.b;
                dn0 dn0Var = this.c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 5 && i3 != 7) {
                                p65.l();
                                return;
                            }
                            if (hk1Var2 != null) {
                                if (!hk1Var2.A) {
                                    hk1Var2.a(false);
                                }
                            } else if (!this.l) {
                                hk1 hk1Var3 = new hk1(cj1Var.a, dn0Var.s(il1Var), cj1Var.h, true, this.j, this);
                                hashMap.put(il1Var.x, hk1Var3);
                                this.l = true;
                                hk1Var3.start();
                            }
                        } else {
                            hk1Var2.getClass();
                            io3.B(!hk1Var2.A);
                            if (this.h || this.g != 0 || i2 >= this.i) {
                                e(cj1Var, 0, 0);
                                hk1Var2.a(false);
                            }
                        }
                    } else if (hk1Var2 != null) {
                        io3.B(!hk1Var2.A);
                        hk1Var2.a(false);
                    }
                } else if (hk1Var2 != null) {
                    io3.B(!hk1Var2.A);
                    hk1Var2.a(false);
                } else {
                    if (!this.h && this.g == 0 && this.k < this.i) {
                        cj1 e = e(cj1Var, 2, 0);
                        il1 il1Var2 = e.a;
                        hk1Var = new hk1(e.a, dn0Var.s(il1Var2), e.h, false, this.j, this);
                        hashMap.put(il1Var2.x, hk1Var);
                        int i4 = this.k;
                        this.k = i4 + 1;
                        if (i4 == 0) {
                            sendEmptyMessageDelayed(12, 5000L);
                        }
                        hk1Var.start();
                    } else {
                        hk1Var = null;
                    }
                    hk1Var2 = hk1Var;
                }
                if (hk1Var2 != null && !hk1Var2.A) {
                    i2++;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        w71 w71Var;
        Cursor cursor;
        int i;
        long j;
        List list;
        int i2;
        int i3;
        int i4 = 7;
        w71 w71Var2 = null;
        boolean z = false;
        r10 = 0;
        int i5 = 0;
        int i6 = 1;
        switch (message.what) {
            case 1:
                int i7 = message.arg1;
                x71 x71Var = this.b;
                ArrayList arrayList = this.e;
                this.g = i7;
                try {
                    try {
                        x71Var.k();
                        x71Var.b();
                        w71Var = new w71(x71Var.c(x71.g(0, 1, 2, 5, 7), null));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                while (true) {
                    try {
                        cursor = (Cursor) w71Var.y;
                    } catch (IOException e2) {
                        e = e2;
                        w71Var2 = w71Var;
                        kb0.t("DownloadManager", "Failed to load index.", e);
                        arrayList.clear();
                        eq6.h(w71Var2);
                        this.d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                        g();
                        i5 = 1;
                        this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        w71Var2 = w71Var;
                        eq6.h(w71Var2);
                        throw th;
                    }
                    if (cursor.moveToPosition(cursor.getPosition() + 1)) {
                        arrayList.add(x71.e((Cursor) w71Var.y));
                    } else {
                        eq6.h(w71Var);
                        this.d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                        g();
                        i5 = 1;
                        this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                        return;
                    }
                }
            case 2:
                if (message.arg1 != 0) {
                    z = true;
                }
                this.h = z;
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 3:
                this.g = message.arg1;
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 4:
                String str = (String) message.obj;
                int i8 = message.arg1;
                x71 x71Var2 = this.b;
                ArrayList arrayList2 = this.e;
                if (str == null) {
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        f((cj1) arrayList2.get(i9), i8);
                    }
                    try {
                        x71Var2.b();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i8));
                            x71Var2.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, x71.e, null);
                        } catch (SQLException e3) {
                            throw new IOException(e3);
                        }
                    } catch (IOException e4) {
                        kb0.t("DownloadManager", "Failed to set manual stop reason", e4);
                    }
                } else {
                    cj1 b = b(str, false);
                    if (b != null) {
                        f(b, i8);
                    } else {
                        try {
                            x71Var2.m(str, i8);
                        } catch (IOException e5) {
                            kb0.t("DownloadManager", "Failed to set manual stop reason: ".concat(str), e5);
                        }
                    }
                }
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 5:
                this.i = message.arg1;
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 6:
                this.j = message.arg1;
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 7:
                il1 il1Var = (il1) message.obj;
                int i10 = message.arg1;
                cj1 b2 = b(il1Var.x, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (b2 != null) {
                    int i11 = b2.b;
                    if (i11 != 5 && i11 != 3 && i11 != 4) {
                        j = b2.c;
                    } else {
                        j = currentTimeMillis;
                    }
                    if (i11 != 5 && i11 != 7) {
                        i4 = i10 != 0 ? 1 : 0;
                    }
                    il1 il1Var2 = b2.a;
                    String str2 = il1Var2.x;
                    String str3 = il1Var.x;
                    List list2 = il1Var.A;
                    io3.n(str2.equals(str3));
                    List list3 = il1Var2.A;
                    if (!list3.isEmpty() && !list2.isEmpty()) {
                        list = new ArrayList(list3);
                        for (int i12 = 0; i12 < list2.size(); i12++) {
                            vy5 vy5Var = (vy5) list2.get(i12);
                            if (!list.contains(vy5Var)) {
                                list.add(vy5Var);
                            }
                        }
                    } else {
                        list = Collections.EMPTY_LIST;
                    }
                    d(new cj1(new il1(il1Var2.x, il1Var.y, il1Var.z, list, il1Var.B, il1Var.C, il1Var.D, il1Var.E, il1Var.F), i4, j, currentTimeMillis, i10));
                } else {
                    if (i10 != 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    d(new cj1(il1Var, i, currentTimeMillis, currentTimeMillis, i10));
                }
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 8:
                String str4 = (String) message.obj;
                cj1 b3 = b(str4, true);
                if (b3 == null) {
                    kb0.s("DownloadManager", "Failed to remove nonexistent download: " + str4);
                } else {
                    e(b3, 5, 0);
                    g();
                }
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 9:
                x71 x71Var3 = this.b;
                ArrayList arrayList3 = this.e;
                ArrayList arrayList4 = new ArrayList();
                try {
                    x71Var3.b();
                    Cursor c = x71Var3.c(x71.g(3, 4), null);
                    while (c.moveToPosition(c.getPosition() + 1)) {
                        try {
                            arrayList4.add(x71.e(c));
                        } finally {
                        }
                    }
                    c.close();
                } catch (IOException unused) {
                    kb0.s("DownloadManager", "Failed to load downloads.");
                }
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    arrayList3.set(i13, a((cj1) arrayList3.get(i13), 5, 0));
                }
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    arrayList3.add(a((cj1) arrayList4.get(i14), 5, 0));
                }
                Collections.sort(arrayList3, new be((byte) 11));
                try {
                    x71Var3.l();
                } catch (IOException e6) {
                    kb0.t("DownloadManager", "Failed to update index.", e6);
                }
                ArrayList arrayList5 = new ArrayList(arrayList3);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    this.d.obtainMessage(3, new ek1((cj1) arrayList3.get(i15), false, arrayList5, null)).sendToTarget();
                }
                g();
                i5 = 1;
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 10:
                hk1 hk1Var = (hk1) message.obj;
                String str5 = hk1Var.x.x;
                this.f.remove(str5);
                boolean z2 = hk1Var.A;
                if (z2) {
                    this.l = false;
                } else {
                    int i16 = this.k - 1;
                    this.k = i16;
                    if (i16 == 0) {
                        removeMessages(12);
                    }
                }
                if (hk1Var.D) {
                    g();
                } else {
                    Exception exc = hk1Var.E;
                    if (exc != null) {
                        kb0.t("DownloadManager", "Task failed: " + hk1Var.x + ", " + z2, exc);
                    }
                    cj1 b4 = b(str5, false);
                    b4.getClass();
                    int i17 = b4.b;
                    if (i17 != 2) {
                        if (i17 != 5 && i17 != 7) {
                            p65.l();
                            return;
                        }
                        io3.B(z2);
                        ArrayList arrayList6 = this.e;
                        int i18 = b4.b;
                        il1 il1Var3 = b4.a;
                        if (i18 == 7) {
                            int i19 = b4.f;
                            if (i19 == 0) {
                                i6 = 0;
                            }
                            e(b4, i6, i19);
                            g();
                        } else {
                            arrayList6.remove(c(il1Var3.x));
                            try {
                                x71 x71Var4 = this.b;
                                String str6 = il1Var3.x;
                                x71Var4.b();
                                try {
                                    x71Var4.b.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str6});
                                } catch (SQLiteException e7) {
                                    throw new IOException(e7);
                                }
                            } catch (IOException unused2) {
                                kb0.s("DownloadManager", "Failed to remove from database");
                            }
                            this.d.obtainMessage(3, new ek1(b4, true, new ArrayList(arrayList6), null)).sendToTarget();
                        }
                    } else {
                        io3.B(!z2);
                        ArrayList arrayList7 = this.e;
                        il1 il1Var4 = b4.a;
                        if (exc == null) {
                            i2 = 3;
                        } else {
                            i2 = 4;
                        }
                        long j2 = b4.c;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j3 = b4.e;
                        int i20 = b4.f;
                        if (exc == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        cj1 cj1Var = new cj1(il1Var4, i2, j2, currentTimeMillis2, j3, i20, i3, b4.h);
                        arrayList7.remove(c(cj1Var.a.x));
                        try {
                            this.b.i(cj1Var);
                        } catch (IOException e8) {
                            kb0.t("DownloadManager", "Failed to update index.", e8);
                        }
                        this.d.obtainMessage(3, new ek1(cj1Var, false, new ArrayList(arrayList7), exc)).sendToTarget();
                    }
                    g();
                }
                this.d.obtainMessage(2, i5, this.f.size()).sendToTarget();
                return;
            case 11:
                hk1 hk1Var2 = (hk1) message.obj;
                int i21 = message.arg1;
                int i22 = message.arg2;
                String str7 = eq6.a;
                long j4 = ((i21 & 4294967295L) << 32) | (4294967295L & i22);
                cj1 b5 = b(hk1Var2.x.x, false);
                b5.getClass();
                if (j4 != b5.e && j4 != -1) {
                    d(new cj1(b5.a, b5.b, b5.c, System.currentTimeMillis(), j4, b5.f, b5.g, b5.h));
                    return;
                }
                return;
            case 12:
                ArrayList arrayList8 = this.e;
                for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                    cj1 cj1Var2 = (cj1) arrayList8.get(i23);
                    if (cj1Var2.b == 2) {
                        try {
                            this.b.i(cj1Var2);
                        } catch (IOException e9) {
                            kb0.t("DownloadManager", "Failed to update index.", e9);
                        }
                    }
                }
                sendEmptyMessageDelayed(12, 5000L);
                return;
            case 13:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((hk1) it.next()).a(true);
                }
                try {
                    this.b.k();
                } catch (IOException e10) {
                    kb0.t("DownloadManager", "Failed to update index.", e10);
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                }
                return;
            default:
                p65.l();
                return;
        }
    }
}

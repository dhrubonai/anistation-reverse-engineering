package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fk7 implements wk7, g25, em7, ec7, xc2, wz0, s48 {
    public Object x;
    public Object y;

    public fk7(qb7 qb7Var, int i) {
        this.y = qb7Var;
        this.x = new AtomicReferenceArray(i);
    }

    @Override // defpackage.ec7
    public void a(Bitmap bitmap) {
        fk7 fk7Var = (fk7) this.x;
        fk7Var.y = bitmap;
        jy7 jy7Var = (jy7) this.y;
        jy7Var.l = fk7Var;
        jy7Var.a();
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        p76 p76Var = (p76) obj2;
        sm7 sm7Var = (sm7) this.x;
        String str = (String) this.y;
        sm7Var.j();
        uh7 uh7Var = (uh7) ((t98) obj).m();
        lp i = rv5.i();
        Parcel K = uh7Var.K();
        K.writeString(str);
        nn7.b(K, i);
        uh7Var.O(K, 5);
        synchronized (sm7Var.s) {
            try {
                if (sm7Var.p != null) {
                    p76Var.a(new bp(new Status(2001, null, null, null)));
                } else {
                    sm7Var.p = p76Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz0
    public Object b(Task task) {
        boolean z = task.b() instanceof vo6;
        uy7 uy7Var = (uy7) this.y;
        ww7 ww7Var = (ww7) this.x;
        if (z) {
            return ww7Var.e(uy7Var.r());
        }
        if (task.b() instanceof bp) {
            bp bpVar = (bp) task.b();
            bpVar.getClass();
            if (bpVar.x.x == 29514) {
                return ww7Var.e(uy7Var.r());
            }
        }
        return task;
    }

    @Override // defpackage.s48
    public Object c(q48 q48Var) {
        p48 p48Var;
        Uri uri = q48Var.d;
        AtomicLong atomicLong = t58.a;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = t58.a.getAndIncrement();
        int length = String.valueOf(myPid).length();
        StringBuilder sb = new StringBuilder(length + 15 + String.valueOf(id).length() + 1 + String.valueOf(currentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(myPid);
        sb.append("-");
        sb.append(id);
        qx1.w(sb, "-", currentTimeMillis, "-");
        sb.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        v58 v58Var = q48Var.a;
        OutputStream b = v58Var.b(build);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        ArrayList arrayList2 = q48Var.c;
        if (!arrayList2.isEmpty()) {
            int i = p48.y;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                if (!arrayList3.isEmpty()) {
                    p48Var = new p48(b, arrayList3);
                } else {
                    p48Var = null;
                }
                if (p48Var != null) {
                    arrayList.add(p48Var);
                }
            } else {
                throw qx1.f(it);
            }
        }
        Iterator it2 = q48Var.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
        } else if (it2.next() != null) {
            ov3.d();
            arrayList = null;
        } else {
            throw null;
        }
        ht7[] ht7VarArr = (ht7[]) this.y;
        if (ht7VarArr != null) {
            ht7 ht7Var = ht7VarArr[0];
            ht7Var.getClass();
            OutputStream outputStream = (OutputStream) bx7.z(arrayList);
            if (outputStream instanceof k58) {
                ht7Var.y = (k58) outputStream;
                ht7Var.x = (OutputStream) arrayList.get(0);
            }
        }
        try {
            OutputStream outputStream2 = (OutputStream) arrayList.get(0);
            try {
                qe7 qe7Var = (qe7) this.x;
                qe7Var.getClass();
                mf7 mf7Var = (mf7) qe7Var;
                int k = mf7Var.k();
                boolean z = ef7.b;
                if (k > 4096) {
                    k = 4096;
                }
                bf7 bf7Var = new bf7(outputStream2, k);
                mf7Var.d(bf7Var);
                if (bf7Var.e > 0) {
                    bf7Var.B();
                }
                ht7[] ht7VarArr2 = (ht7[]) this.y;
                if (ht7VarArr2 != null) {
                    ht7 ht7Var2 = ht7VarArr2[0];
                    if (((k58) ht7Var2.y) != null) {
                        ((OutputStream) ht7Var2.x).flush();
                        ((k58) ht7Var2.y).x.getFD().sync();
                    } else {
                        throw new IOException("Cannot sync underlying stream");
                    }
                }
                outputStream2.close();
                v58Var.e(build, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                v58Var.c(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    @Override // defpackage.em7
    public vs7 d(ik7 ik7Var) {
        vs7 e = ((vs7) this.x).e();
        e.h((String) this.y, ik7Var);
        return e;
    }

    public v08 e(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.x;
        v08 v08Var = (v08) atomicReferenceArray.get(i);
        if (v08Var == null) {
            i08 a = ((qb7) this.y).a(str, z);
            while (!atomicReferenceArray.compareAndSet(i, null, a)) {
                if (atomicReferenceArray.get(i) != null) {
                    v08 v08Var2 = (v08) atomicReferenceArray.get(i);
                    v08Var2.getClass();
                    return v08Var2;
                }
            }
            return a;
        }
        return v08Var;
    }

    public v08 f(long j, int i, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.x;
        v08 v08Var = (v08) atomicReferenceArray.get(i);
        if (v08Var == null) {
            q08 q08Var = new q08(str, (yh2) ((qb7) this.y).y, j);
            while (!atomicReferenceArray.compareAndSet(i, null, q08Var)) {
                if (atomicReferenceArray.get(i) != null) {
                    v08 v08Var2 = (v08) atomicReferenceArray.get(i);
                    v08Var2.getClass();
                    return v08Var2;
                }
            }
            return q08Var;
        }
        return v08Var;
    }

    public void g(vs7 vs7Var, l87 l87Var) {
        int i;
        gx7 gx7Var = new gx7(l87Var);
        TreeMap treeMap = (TreeMap) this.x;
        for (Integer num : treeMap.keySet()) {
            mc7 clone = ((mc7) l87Var.z).clone();
            ik7 a = ((gk7) treeMap.get(num)).a(vs7Var, Collections.singletonList(gx7Var));
            if (a instanceof xh7) {
                i = fy5.q(((xh7) a).x.doubleValue());
            } else {
                i = -1;
            }
            if (i == 2 || i == -1) {
                l87Var.z = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.y;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            ik7 a2 = ((gk7) treeMap2.get((Integer) it.next())).a(vs7Var, Collections.singletonList(gx7Var));
            if (a2 instanceof xh7) {
                fy5.q(((xh7) a2).x.doubleValue());
            }
        }
    }

    public v08 h(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.x;
        v08 v08Var = (v08) atomicReferenceArray.get(i);
        if (v08Var == null) {
            s08 s08Var = new s08(str, (yh2) ((qb7) this.y).y, str2);
            while (!atomicReferenceArray.compareAndSet(i, null, s08Var)) {
                if (atomicReferenceArray.get(i) != null) {
                    v08 v08Var2 = (v08) atomicReferenceArray.get(i);
                    v08Var2.getClass();
                    return v08Var2;
                }
            }
            return s08Var;
        }
        return v08Var;
    }

    @Override // defpackage.wk7
    public void m(String str, long j, long j2, long j3) {
        wk7 wk7Var = (wk7) this.x;
        if (wk7Var != null) {
            wk7Var.m(str, j, j2, j3);
        }
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        qx7 qx7Var = (qx7) this.y;
        qx7Var.L();
        gu7 gu7Var = (gu7) qx7Var.x;
        bt7 bt7Var = gu7Var.B;
        gu7.j(bt7Var);
        SparseArray R = bt7Var.R();
        x08 x08Var = (x08) this.x;
        R.put(x08Var.z, Long.valueOf(x08Var.y));
        bt7 bt7Var2 = gu7Var.B;
        gu7.j(bt7Var2);
        int[] iArr = new int[R.size()];
        long[] jArr = new long[R.size()];
        for (int i = 0; i < R.size(); i++) {
            iArr[i] = R.keyAt(i);
            jArr[i] = ((Long) R.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        bt7Var2.K.d(bundle);
        qx7Var.F = false;
        qx7Var.G = 1;
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.J.b(x08Var.x, "Successfully registered trigger URI");
        qx7Var.k0();
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        qx7 qx7Var = (qx7) this.y;
        qx7Var.L();
        gu7 gu7Var = (gu7) qx7Var.x;
        boolean z = false;
        qx7Var.F = false;
        qx7Var.j0().add((x08) this.x);
        byte b = 1;
        if (qx7Var.G > ((Integer) tq7.v0.a(null)).intValue()) {
            qx7Var.G = 1;
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.F.c("registerTriggerAsync failed. May try later. App ID, throwable", es7.P(gu7Var.p().R()), es7.P(th.toString()));
            return;
        }
        es7 es7Var2 = gu7Var.C;
        gu7.l(es7Var2);
        es7Var2.F.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", es7.P(gu7Var.p().R()), es7.P(String.valueOf(qx7Var.G)), es7.P(th.toString()));
        int i = qx7Var.G;
        gw7 gw7Var = qx7Var.H;
        if (gw7Var == null) {
            gw7Var = new gw7(qx7Var, gu7Var, b, z);
            qx7Var.H = gw7Var;
        }
        gw7Var.b(i * 1000);
        int i2 = qx7Var.G;
        qx7Var.G = i2 + i2;
    }

    @Override // defpackage.wk7
    public void x(String str, long j, int i, Object obj, long j2, long j3) {
        wk7 wk7Var = (wk7) this.x;
        if (wk7Var != null) {
            if (i == 2001) {
                qk7 qk7Var = (qk7) this.y;
                Object[] objArr = {Integer.valueOf(qk7Var.i)};
                zk3 zk3Var = qk7Var.a;
                Log.w(zk3Var.a, zk3Var.c("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((s25) qk7Var.h.y).h.iterator();
                while (it.hasNext()) {
                    ((r25) it.next()).w();
                }
                i = 2001;
            }
            wk7Var.x(str, j, i, obj, j2, j3);
        }
    }

    public /* synthetic */ fk7(Object obj, Object obj2) {
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ fk7(Object obj) {
        this.x = obj;
    }

    public fk7(qk7 qk7Var, wk7 wk7Var) {
        this.x = wk7Var;
        Objects.requireNonNull(qk7Var);
        this.y = qk7Var;
    }
}

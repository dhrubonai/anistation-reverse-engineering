package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class u98 implements gp3, b14 {
    public static final u98 B;
    public Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public Object z;

    static {
        Object obj = null;
        B = new u98((byte) 0, obj, obj, true);
    }

    public u98(byte b) {
        this.x = b;
        switch (b) {
            case 7:
                this.z = new Object();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u98 o(String str) {
        return new u98((byte) 0, str, null, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u98 p(String str, Exception exc) {
        return new u98((byte) 0, str, exc, 0 == true ? 1 : 0);
    }

    @Override // defpackage.b14
    public boolean a(long j, p65 p65Var) {
        uf3 uf3Var;
        jb6 jb6Var = (jb6) this.A;
        if (jb6Var.i() && jb6Var.l().a.y.length() != 0 && (uf3Var = jb6Var.d) != null && uf3Var.d() != null) {
            k(jb6Var.l(), j, false, p65Var);
            return true;
        }
        return false;
    }

    @Override // defpackage.b14
    public boolean c(long j) {
        uf3 uf3Var;
        jb6 jb6Var = (jb6) this.A;
        if (jb6Var.i() && jb6Var.l().a.y.length() != 0 && (uf3Var = jb6Var.d) != null && uf3Var.d() != null) {
            k(jb6Var.l(), j, false, l68.K);
            return true;
        }
        return false;
    }

    @Override // defpackage.b14
    public void d() {
        if (this.y) {
            ((jb6) this.A).n((nd6) this.z);
        }
    }

    @Override // defpackage.b14
    public boolean e(long j) {
        jb6 jb6Var = (jb6) this.A;
        uf3 uf3Var = jb6Var.d;
        if (uf3Var != null && uf3Var.d() != null && jb6Var.i()) {
            jb6Var.s = -1;
            w72 w72Var = jb6Var.k;
            if (w72Var != null) {
                w72.a(w72Var);
            }
            k(jb6Var.l(), j, false, l68.K);
            return true;
        }
        return false;
    }

    @Override // defpackage.b14
    public boolean f(long j, p65 p65Var, int i) {
        uf3 uf3Var;
        jb6 jb6Var = (jb6) this.A;
        if (jb6Var.i() && jb6Var.l().a.y.length() != 0 && (uf3Var = jb6Var.d) != null && uf3Var.d() != null) {
            w72 w72Var = jb6Var.k;
            if (w72Var != null) {
                w72.a(w72Var);
            }
            jb6Var.n = j;
            jb6Var.s = -1;
            jb6Var.e(true);
            long k = k(jb6Var.l(), jb6Var.n, true, p65Var);
            if (i >= 2) {
                this.y = true;
                this.z = new nd6(k);
            }
            return true;
        }
        return false;
    }

    public boolean g(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((l33) this.A).y;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                if (sw0.o(((wq4) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        wq4 wq4Var = (wq4) obj;
        if (wq4Var == null) {
            return false;
        }
        return wq4Var.h;
    }

    @Override // defpackage.gp3
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public eu b(tp tpVar) {
        MediaCodec mediaCodec;
        kp3 huVar;
        int i;
        eu euVar;
        String str = ((mp3) tpVar.y).a;
        eu euVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                if (this.y && Build.VERSION.SDK_INT >= 36) {
                    huVar = new fq3((Object) mediaCodec, (byte) 12);
                    i = 4;
                } else {
                    huVar = new hu(mediaCodec, (HandlerThread) ((du) this.A).get());
                    i = 0;
                }
                euVar = new eu(mediaCodec, (HandlerThread) ((du) this.z).get(), huVar, (y23) tpVar.D);
            } catch (Exception e) {
                e = e;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) tpVar.B;
                if (surface == null && ((mp3) tpVar.y).h && Build.VERSION.SDK_INT >= 35) {
                    i |= 8;
                }
                euVar.b((MediaFormat) tpVar.z, surface, (MediaCrypto) tpVar.C, i);
                return euVar;
            } catch (Exception e2) {
                e = e2;
                euVar2 = euVar;
                if (euVar2 == null) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                } else {
                    euVar2.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public p21 i() {
        fm0 fm0Var = (fm0) this.A;
        int i = fm0Var.y;
        int i2 = fm0Var.z;
        if (i < i2) {
            return p21.y;
        }
        if (i > i2) {
            return p21.x;
        }
        return p21.z;
    }

    public boolean j(u98 u98Var) {
        if (((yg5) this.z) != null && u98Var != null && this.y == u98Var.y) {
            fm0 fm0Var = (fm0) this.A;
            fm0 fm0Var2 = (fm0) u98Var.A;
            if (fm0Var.y == fm0Var2.y && fm0Var.z == fm0Var2.z) {
                return false;
            }
            return true;
        }
        return true;
    }

    public long k(mc6 mc6Var, long j, boolean z, p65 p65Var) {
        hj2 hj2Var;
        jb6 jb6Var = (jb6) this.A;
        long v = jb6Var.v(mc6Var, j, z, false, p65Var, false, null);
        if (!nd6.b(v, (nd6) this.z)) {
            this.y = false;
        }
        if (nd6.d(v)) {
            hj2Var = hj2.z;
        } else {
            hj2Var = hj2.y;
        }
        jb6Var.r(hj2Var);
        return v;
    }

    public String l() {
        return (String) this.z;
    }

    public void m(r28 r28Var) {
        synchronized (this.z) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.A;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.A = arrayDeque;
                }
                arrayDeque.add(r28Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(Task task) {
        r28 r28Var;
        synchronized (this.z) {
            if (((ArrayDeque) this.A) != null && !this.y) {
                this.y = true;
                while (true) {
                    synchronized (this.z) {
                        try {
                            r28Var = (r28) ((ArrayDeque) this.A).poll();
                            if (r28Var == null) {
                                this.y = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    r28Var.a(task);
                }
            }
        }
    }

    public String toString() {
        switch (this.x) {
            case 5:
                return "SingleSelectionLayout(isStartHandle=" + this.y + ", crossed=" + i() + ", info=\n\t" + ((fm0) this.A) + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u98(byte b, Object obj, Object obj2, boolean z) {
        this.x = b;
        this.y = z;
        this.z = obj;
        this.A = obj2;
    }

    public u98(sl3 sl3Var, l33 l33Var) {
        this.x = (byte) 3;
        this.z = sl3Var;
        this.A = l33Var;
    }

    public u98(du duVar, du duVar2) {
        this.x = (byte) 1;
        this.z = duVar;
        this.A = duVar2;
        this.y = true;
    }

    public u98(Context context) {
        this.x = (byte) 4;
        this.z = context;
        this.A = new r18((byte) 13);
    }

    public u98(jb6 jb6Var) {
        this.x = (byte) 6;
        this.A = jb6Var;
        this.y = true;
    }
}

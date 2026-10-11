package defpackage;

import android.content.Context;
import android.util.Log;
import com.anistation.android.R;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p18 implements tc1, ur, wr, te2, td0, k11, jm2, w16, iz1, d12, jq2, vn0, pw6, ep3, uu4 {
    public final /* synthetic */ byte x;
    public static final p18 y = new p18(0);
    public static final p18 z = new p18(1);
    public static final p18 A = new p18(2);
    public static final p18 B = new p18(3);
    public static final p18 C = new p18(4);

    public /* synthetic */ p18(byte b) {
        this.x = b;
    }

    @Override // defpackage.w16
    public int A(ea2 ea2Var) {
        String str = ea2Var.p;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        ze0.k(zo5.l("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // defpackage.d12
    public bh6 G(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wr
    public void H(ud1 ud1Var, int i, int[] iArr, int[] iArr2) {
        x97.K(i, iArr, iArr2, false);
    }

    @Override // defpackage.d12
    public void I(hf5 hf5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ur, defpackage.wr
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.td0
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.tc1
    public boolean c(SSLSocket sSLSocket) {
        return b06.I(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.iz1
    public jz1[] d(hz1[] hz1VarArr, z20 z20Var) {
        jz1[] jz1VarArr = new jz1[hz1VarArr.length];
        byte b = 0;
        for (int i = 0; i < hz1VarArr.length; i++) {
            hz1 hz1Var = hz1VarArr[i];
            ij1 ij1Var = null;
            if (hz1Var != null) {
                ij1Var = new ij1(hz1Var.a, hz1Var.b, ij1Var, b);
            }
            jz1VarArr[i] = ij1Var;
        }
        return jz1VarArr;
    }

    @Override // defpackage.jq2
    public void e(Object obj, wp2 wp2Var) {
        ls2 ls2Var = (ls2) obj;
        ls2Var.getClass();
        wp2Var.A.f(ir2.m, new ks2(ls2Var, wp2Var, null));
    }

    @Override // defpackage.jm2
    public fj4 f(fm2 fm2Var, bm2 bm2Var) {
        return new im2(fm2Var, bm2Var);
    }

    @Override // defpackage.ep3
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.jq2
    public ou getKey() {
        return ls2.c;
    }

    @Override // defpackage.w16
    public boolean i(ea2 ea2Var) {
        String str = ea2Var.p;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ur
    public void j(ud1 ud1Var, int i, int[] iArr, ia3 ia3Var, int[] iArr2) {
        if (ia3Var == ia3.x) {
            x97.K(i, iArr, iArr2, false);
        } else {
            x97.K(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.jq2
    public Object l(ub2 ub2Var) {
        ub2Var.invoke(new m18((byte) 21));
        return new ls2();
    }

    @Override // defpackage.uu4
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.ep3
    public long n() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ep3
    public boolean next() {
        return false;
    }

    @Override // defpackage.tc1
    public hu5 o(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new pe(cls2);
    }

    @Override // defpackage.uu4
    public void p(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.pw6
    public int r() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // defpackage.w16
    public y16 s(ea2 ea2Var) {
        String str = ea2Var.p;
        List list = ea2Var.s;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new ls0(list);
                case 1:
                    return new zp2((byte) 16);
                case 2:
                    return new a24();
                case 3:
                    return new y23((byte) 23);
                case 4:
                    return new uk6(list);
                case 5:
                    return new uw5(list);
                case 6:
                    return new uw6(list);
                case 7:
                    return new a16();
                case '\b':
                    return new pk6();
            }
        }
        ze0.k(zo5.l("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.d12
    public void t() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        switch (this.x) {
            case 6:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jm2
    public fj4 u() {
        return new im2();
    }

    @Override // defpackage.vn0
    public m03 v() {
        m03 m03Var = m03.z;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        if ((currentTimeMillis ^ 1000) < 0 && j * 1000 != currentTimeMillis) {
            j--;
        }
        long j2 = currentTimeMillis % 1000;
        int i = (int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000);
        if (j < -31557014167219200L) {
            return m03.z;
        }
        if (j > 31556889864403199L) {
            return m03.A;
        }
        return te4.C(i, j);
    }

    public wc4 w(ok1 ok1Var, Context context) {
        wc4 wc4Var;
        ok1Var.getClass();
        wc4 wc4Var2 = wc4.h;
        if (wc4Var2 == null) {
            synchronized (this) {
                wc4Var = wc4.h;
                if (wc4Var == null) {
                    wc4Var = new wc4(ok1Var, context);
                    wc4.h = wc4Var;
                }
            }
            return wc4Var;
        }
        return wc4Var2;
    }

    public List x(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (kr0 kr0Var : componentRegistrar.getComponents()) {
            String str = kr0Var.a;
            if (str != null) {
                fs0 fs0Var = new fs0((Object) str, (Object) kr0Var, (byte) 0);
                Set set = kr0Var.b;
                Set set2 = kr0Var.c;
                byte b = kr0Var.d;
                boolean z2 = kr0Var.e;
                kr0Var = new kr0(str, set, set2, b, z2 ? 1 : 0, fs0Var, kr0Var.g);
            }
            arrayList.add(kr0Var);
        }
        return arrayList;
    }
}

package defpackage;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.library.WatchProgress;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class od implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ od(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        long j;
        boolean z = true;
        switch (this.x) {
            case 0:
                qz2 qz2Var = (qz2) this.y;
                synchronized (qz2Var.c) {
                    try {
                        qz2Var.e = true;
                        z44 z44Var = qz2Var.d;
                        Object[] objArr = z44Var.x;
                        int i = z44Var.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            ub4 ub4Var = (ub4) ((c37) objArr[i2]).get();
                            if (ub4Var != null && (inputConnection = ub4Var.b) != null) {
                                inputConnection.closeConnection();
                                ub4Var.b = null;
                            }
                        }
                        qz2Var.d.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                sc6 sc6Var = ((pd) this.z).y;
                sc6Var.b.set(null);
                sc6Var.a.d();
                return pn6.a;
            case 1:
                sf sfVar = (sf) this.y;
                tf tfVar = (tf) this.z;
                synchronized (sfVar.A) {
                    sfVar.C.remove(tfVar);
                }
                return pn6.a;
            case 2:
                ((Choreographer) ((uf) this.y).y).removeFrameCallback((tf) this.z);
                return pn6.a;
            case 3:
                return ((ui) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 4:
                return ((ui) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 5:
                KeyEvent keyEvent = ((g83) obj).a;
                w44 w44Var = (w44) this.z;
                if (!((ng6) this.y).b()) {
                    w44Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 6:
                ((Number) obj).intValue();
                ((ub2) this.y).invoke((WatchProgress) this.z);
                return pn6.a;
            case 7:
                return ((f01) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 8:
                KeyEvent keyEvent2 = ((g83) obj).a;
                if (((uf3) this.y).a() == hj2.y && keyEvent2.getKeyCode() == 4 && h41.E(keyEvent2) == 1) {
                    ((jb6) this.z).d(null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((f01) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 10:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ic2) this.y).invoke(((EpisodeDownload) this.z).getId(), bool);
                return pn6.a;
            case 11:
                int intValue = ((Number) obj).intValue();
                return ((st0) this.y).invoke(Integer.valueOf(intValue), ((List) this.z).get(intValue));
            case 12:
                return ((f01) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 13:
                kt5 kt5Var = (kt5) obj;
                synchronized (mt5.c) {
                    j = mt5.e;
                    mt5.e = 1 + j;
                }
                return new u44(j, kt5Var, (ub2) this.y, (ub2) this.z);
            case 14:
                int intValue2 = ((Number) obj).intValue();
                return ((st0) this.y).invoke(Integer.valueOf(intValue2), ((List) this.z).get(intValue2));
            case 15:
                int intValue3 = ((Number) obj).intValue();
                return ((st0) this.y).invoke(Integer.valueOf(intValue3), ((List) this.z).get(intValue3));
            case 16:
                int intValue4 = ((Number) obj).intValue();
                return ((st0) this.y).invoke(Integer.valueOf(intValue4), ((List) this.z).get(intValue4));
            case 17:
                tu tuVar = (tu) this.y;
                Object obj2 = tuVar.y;
                qg0 qg0Var = (qg0) this.z;
                synchronized (obj2) {
                    ((ArrayList) tuVar.z).remove(qg0Var);
                }
                return pn6.a;
            case 18:
                int intValue5 = ((Number) obj).intValue();
                return ((wj3) this.y).invoke(Integer.valueOf(intValue5), ((List) this.z).get(intValue5));
            case 19:
                return ((zg) this.y).invoke(((ArrayList) this.z).get(((Number) obj).intValue()));
            case 20:
                return ((zg) this.y).invoke(((ArrayList) this.z).get(((Number) obj).intValue()));
            case 21:
                int intValue6 = ((Number) obj).intValue();
                return ((oa5) this.y).invoke(Integer.valueOf(intValue6), ((List) this.z).get(intValue6));
            case 22:
                return ((la5) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 23:
                return ((la5) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 24:
                return ((la5) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 25:
                KeyEvent keyEvent3 = ((g83) obj).a;
                p72 p72Var = (p72) this.y;
                InputDevice device = keyEvent3.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent3.getSource() == 33554433) && h41.E(keyEvent3) == 2 && keyEvent3.getSource() != 257)) {
                    if (et5.d(19, keyEvent3)) {
                        z = ((r72) p72Var).h(5, true);
                    } else if (et5.d(20, keyEvent3)) {
                        z = ((r72) p72Var).h(6, true);
                    } else if (et5.d(21, keyEvent3)) {
                        z = ((r72) p72Var).h(3, true);
                    } else if (et5.d(22, keyEvent3)) {
                        z = ((r72) p72Var).h(4, true);
                    } else if (et5.d(23, keyEvent3)) {
                        ou5 ou5Var = ((uf3) this.z).c;
                        if (ou5Var != null) {
                            ((id1) ou5Var).b();
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 26:
                ((gi6) this.y).a.h.k((jf) this.z);
                return pn6.a;
            case 27:
                int intValue7 = ((Number) obj).intValue();
                return ((q10) this.y).invoke(Integer.valueOf(intValue7), ((List) this.z).get(intValue7));
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof m87) {
                    ((pi3) this.y).stop(((m87) th2).x);
                }
                ((ii3) this.z).cancel(false);
                return pn6.a;
        }
    }
}
